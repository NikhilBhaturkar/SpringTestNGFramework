package com.framework.utils;

import java.nio.file.Paths;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverClass {
	public WebDriver driver;
	private final String CHROME_WEBDRIVER_LOCATION = Paths.get(".").toAbsolutePath()
			+ "\\src\\test\\resources\\drivers\\chromedriver.exe";
	private final String IE_WEBDRIVER_LOCATION = Paths.get(".").toAbsolutePath()
			+ "\\src\\test\\resources\\drivers\\IEWebdriver.exe";
	private final String FIREFOX_WEBDRIVER_LOCATION = Paths.get(".").toAbsolutePath()
			+ "\\src\\test\\resources\\drivers\\firefoxdriver.exe";
	
	public DriverClass createDriver() {
		PropertyReader prop = new PropertyReader();
		String driverName = prop.getProps().getProperty("webdriver.driver");
		if (driver == null) {
			System.out.println("Initializing Driver");
			switch (driverName.toUpperCase()) {
			case "CHROME":
				System.setProperty("webdriver.chrome.driver", CHROME_WEBDRIVER_LOCATION);
				driver = new ChromeDriver();
				break;
			case "IE":
				System.setProperty("webdriver.ie.driver", IE_WEBDRIVER_LOCATION);
				driver = new InternetExplorerDriver();
				break;
			case "FIREFOX":
				System.setProperty("webdriver.firefox.driver", FIREFOX_WEBDRIVER_LOCATION);
				driver = new FirefoxDriver();
				break;
			default:
				System.setProperty("webdriver.ie.driver", IE_WEBDRIVER_LOCATION);
				driver = new ChromeDriver();
				break;
			}
		}
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		String url = prop.getProps().getProperty("application.url");
		driver.navigate().to(url);
		return this;
	}

}
