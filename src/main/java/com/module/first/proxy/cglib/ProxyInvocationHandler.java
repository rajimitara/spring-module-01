package com.module.first.proxy.cglib;

import com.module.first.common.dao.SongDao;
import com.module.first.common.ds.Song;
import com.module.first.common.service.Service;
import org.springframework.cglib.proxy.InvocationHandler;

import java.lang.reflect.Method;


public class ProxyInvocationHandler implements InvocationHandler {

    private SongDao target;

    public ProxyInvocationHandler(SongDao songDao) {
        this.target = songDao;
    }


    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        System.out.println("Before calling method"+method.getName());
        method.invoke(target,objects);
        return null;
    }

}
