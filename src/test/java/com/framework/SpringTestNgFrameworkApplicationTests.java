package com.framework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

@SpringBootTest(classes=SpringTestNgFrameworkApplication.class)
class SpringTestNgFrameworkApplicationTests extends AbstractTestNGSpringContextTests{

	@Test
	void contextLoads() {
		System.out.println("context load test ran");
	}

}
