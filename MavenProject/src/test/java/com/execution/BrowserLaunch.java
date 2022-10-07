package com.execution;

import java.util.Date;

import org.pojo.LoginPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.utilities.BaseClass;

public class BrowserLaunch extends BaseClass{
	LoginPage l;


	@BeforeClass
	public static void startDate() {
		Date d =  new Date();
		System.out.println("start date and time :"+d);
	}
	@AfterClass
	public static void endDate() {
		Date d =  new Date();
		System.out.println("end date and time :"+d);
	}

	@BeforeMethod
	public void startBrowser() {
		loadBrowserChrome();
		launchUrl("https://en-gb.facebook.com/");
		maxWindow();
	}
	@AfterMethod
	public void endBrowser() {
		closeBrowser();

	}
	@Test
	public void tc1() {
		l = new LoginPage();

		fill(l.getTxtuser(), "arun");
		fill(l.getTxtpass(), "4543tennt6");
		btnClick(l.getBtnlogin());
		System.out.println("Test 1 completed");

	}
	@Test
	public void tc3() {
		l = new LoginPage();
		fill(l.getTxtuser(), "raj");
		fill(l.getTxtpass(), "4543fhftet6");
		btnClick(l.getBtnlogin());
		System.out.println("test 3 completed");
	}
	@Test
	public void tc2() {
		l = new LoginPage();
		fill(l.getTxtuser(), "vishnu");
		fill(l.getTxtpass(), "4543t34t6");
		btnClick(l.getBtnlogin());
		System.out.println("test 2 completed");
	}


}
