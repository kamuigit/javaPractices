package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.utilities.Baseclass;

public class Pojoclass extends Baseclass {
	public Pojoclass() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	private WebElement txtuser;

	@FindBy(name = "pass")
	private WebElement txtpass;

	@FindBys({ @FindBy(xpath = "//button[text()='Log In']"), @FindBy(xpath = "//button [@name = 'login']") })
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
