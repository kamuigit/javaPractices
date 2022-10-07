package com.execution;

import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.pojo.LoginPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.utilities.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExecutionClass extends BaseClass {
	WebDriver driver;
	LoginPage l;
	@BeforeClass
	private void startTime() {
		Date d = new Date();
		System.out.println("Start Date: "+d);

	}

	@AfterClass
	private void endTime() {
		Date d = new Date();
		System.out.println("End Date: "+d);
	}

	@Parameters({"browser"})
	@Test
	private void tc2(String browsername) {
		if (browsername.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://en-gb.facebook.com/");
			driver.quit();
		}
		else if (browsername.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.get("https://en-gb.facebook.com/");
			driver.quit();
		}
		else {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get("https://en-gb.facebook.com/");
			driver.quit();
		}
		
	}

}
