package com.module.first;

import com.module.first.Qualifier.PlaylistService3;
import com.module.first.javaconfig.SpringBean3;
import com.module.first.lifecycle.PlaylistService2;
import com.module.first.javaconfig.SpringBean1;
import com.module.first.javaconfig.SpringBean2;
import com.module.first.scope.*;
import com.module.first.springApp.Config;
import com.module.first.springApp.PlaylistService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class OneDiApplication implements CommandLineRunner {
    //Injection applicable on all access specifier

    @Autowired
    private PlaylistService1 playlistService1;

    @Autowired
    public SingletonBean singleBean;

    @Autowired
    protected PrototypeBean prototypeBean;

    @Autowired
    private HttpBean httpBean;

    @Autowired
    private SessionBean sessionBean;

    @Autowired
    private ApplicationBean applicationBean;
    // 3.Springboot without controller

   /*  public static void main(String[] args) {
             SpringApplication.run(OneDiApplication.class, args);
     }*/
    //Scope examples
    @Override
	public void run(String... args) throws Exception {
		playlistService1.play("spring boot - spring creates container");
        System.out.println("SingleScope is created with address"+singleBean);
        System.out.println("Prototype Scope is created with address"+prototypeBean);
        System.out.println("ApplicationScope is created with address"+applicationBean);
	}

    // 2.Lifecycle example web app create container : try with resource does bean.close()

    public static void main(String[] args) {

        try (AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext()) {
            configApplicationContext.register(Config.class);
            System.out.println("registered");
            configApplicationContext.refresh();
            System.out.println("Starting to refreshed");
            configApplicationContext.getBean(PlaylistService2.class).play("DI done: test qualifier annotation");
            System.out.println("Starting to shutdown");
            configApplicationContext.getBean(PlaylistService3.class).play("DI done: test custom qualifier");
            //scope check for java config
            configApplicationContext.getBean(SpringBean1.class);
            configApplicationContext.getBean(SpringBean1.class);
            configApplicationContext.getBean(SpringBean1.class);

            configApplicationContext.getBean(SpringBean2.class);
            configApplicationContext.getBean(SpringBean2.class);
            configApplicationContext.getBean(SpringBean2.class);
            //test primary
            //configApplicationContext.getBean(PlaylistService.class).play("test primary bean");

            //test different types of autowiring / injection
            configApplicationContext.getBean(SpringBean3.class).createInstance();
        }
    }




}
