package com.cjl.helloworld;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloworldApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void  helloworld() {
		System.out.println("Spring boot单元测试开始");
	}

}
