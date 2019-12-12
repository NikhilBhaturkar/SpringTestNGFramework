package com.framework.testscripts;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.framework.pageobjects.HomePage;

public class HomePageTests extends SpringTestNgFrameworkApplicationTests {
	HomePage homePage=new HomePage();
	
	@BeforeTest
	public void startBrowser() {
		homePage.navigate();
	}

	@Test
	public void testfuncdtion() {
		System.out.println("test function");
	}

	@AfterTest
	public void quitBrowser() {
		homePage.quitBrowser();
	}

}
