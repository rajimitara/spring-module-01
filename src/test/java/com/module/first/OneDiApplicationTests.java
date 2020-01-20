package com.module.first;

import com.module.first.springApp.Config;
import com.module.first.springApp.PlaylistService1;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@ContextConfiguration(classes = Config.class)
class OneDiApplicationTests {

	@Autowired
	private PlaylistService1 playlistService1;
	@Test
	void contextLoads() {

		playlistService1.play("Execute unit tests");
	}

}
