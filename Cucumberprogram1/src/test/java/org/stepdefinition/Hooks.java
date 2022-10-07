package org.stepdefinition;

import org.utilities.Baseclass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Baseclass {
	@Before
	public void beforesec() {
		System.out.println("scenario starts");
		loadBrowserFireFox();
		applyWaitForAllLocators();
	}
	
	@After
	public void aftersec() {
		closeBrowser();
		System.out.println("scenario ends");
	}
	
	@Before("@smoke")
	public void befsmokesenario() {
		System.out.println("smoke scenerio started");
	}
	
	@After("@smoke")
	public void aftsmokesec() {
		System.out.println("smoke scenario ended");
	}
	@Before("@sanity")
	public void befsanitysenario() {
		System.out.println("sanity scenerio started");
	}
	
	@After("@sanity")
	public void aftsanitysec() {
		System.out.println("sanity scenario ended");
	}
	@Before("@regression")
	public void befsasenario() {
		System.out.println("regee scenerio started");
	}
	
	@After("@regression")
	public void aftregsec() {
		System.out.println("rege scenario ended");
	}
	
}
