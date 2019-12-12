package com.framework.testscripts;

import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

import com.framework.SpringTestNgFrameworkApplication;

@SpringBootTest(classes = SpringTestNgFrameworkApplication.class)
@ContextConfiguration(classes = SpringTestNgFrameworkApplication.class, loader = SpringBootContextLoader.class)
@ComponentScan(basePackages ="com.framework.pageobjects,com.framework.testscripts")
class SpringTestNgFrameworkApplicationTests extends AbstractTestNGSpringContextTests {

	public void contextLoads() {
		System.out.println("context load test ran");
	}
}
