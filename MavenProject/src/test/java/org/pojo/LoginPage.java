package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.BaseClass;

public class LoginPage extends BaseClass {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id ="email")
	private WebElement txtuser;
	
	
	@FindBy(name="pass")
	private WebElement txtpass;
	
	@FindBy(xpath="//button[text()='Log In']")
	
	private WebElement btnlogin;
	
	
	public WebElement getTxtuser() {
		return txtuser;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}
	









}
