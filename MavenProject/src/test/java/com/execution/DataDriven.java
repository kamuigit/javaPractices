package com.execution;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.utilities.BaseClass;

public class DataDriven extends BaseClass{
	public static void main(String[] args) throws IOException {
		loadBrowserChrome();
		launchUrl("https://en-gb.facebook.com/");
		maxWindow();
		WebElement txtmail = driver.findElement(By.id("email"));
		String usid = excelRead("datamaven","credentials", 1, 0);
		fill(txtmail, usid);
		WebElement txtpass = driver.findElement(By.id("pass"));
		String uspass = excelRead("datamaven","credentials", 1, 1);
		fill(txtpass, uspass);
		WebElement btnlogin = driver.findElement(By.name("login"));
		btnClick(btnlogin);
	}
}

