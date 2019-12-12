package com.framework.testscripts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.event.annotation.AfterTestMethod;
import org.springframework.test.context.event.annotation.BeforeTestMethod;
import org.testng.annotations.Test;

import com.framework.pageobjects.HomePage;

public class HomePageTests {
	@Autowired
	HomePage homePage;
	
@BeforeTestMethod
public void startBrowser() {
	homePage.navigate();
}

@Test
public void testfuncdtion() {
	
}
	
@AfterTestMethod
public void quitBrowser() {
	HomePage.quitBrowser();
}

}
