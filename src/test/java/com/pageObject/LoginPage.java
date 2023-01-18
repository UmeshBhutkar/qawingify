package com.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, rdriver);
	}
	
	@FindBy(className="auth-header")
	WebElement header;
	
	@FindBy(xpath = "//img[@src='img/logo-big.png']")
	WebElement logo;
	
	@FindBy(id="username")
	WebElement username;
	
	@FindBy(id = "password")
	WebElement password;
	
	@FindBy(id = "log-in")
	WebElement loginBtn;
	
	@FindBy(className = "form-check-label")
	WebElement rembMe;
	
	@FindBy(xpath = "//img[@src='img/twitter.png']")
	WebElement twitterBtn;
	
	@FindBy(xpath = "//img[@src='img/facebook.png']")
	WebElement facebookBtn;
	
	@FindBy(xpath = "//img[@src='img/linkedin.png']")
	WebElement linkedInBtn;
	
	
	public void setUsername(String uname)
	{
		username.sendKeys(uname);
	}
	
	public void setPassword(String pw)
	{
		password.sendKeys(pw);
	}
	
	public void clickLogin()
	{
		loginBtn.click();
	}
	
}
