package com.framework.pageobjects;

import com.framework.utils.DriverInitializer;

public class HomePage extends DriverInitializer{

	public void navigate() {
		getDriver().navigate().to("http://www.google.com");
	}
	
	public void quitBrowser() {
		getDriver().quit();
	}
}
