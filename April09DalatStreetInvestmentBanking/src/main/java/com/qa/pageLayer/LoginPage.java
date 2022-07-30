package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class LoginPage extends TestBase {
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//email 
	@FindBy(xpath="//input[@name='email']")
	private WebElement email_box;
	
	public void enterEmailAddress(String email)
	{
		email_box.sendKeys(email);
	}
	
	//password 
	@FindBy(xpath="//input[@name='password']")
	private WebElement pass_box;
	
	public void enterPassword(String pass)
	{
		pass_box.sendKeys(pass);
	}
	
	// click on login btn 
	@FindBy(xpath="//button[contains(text(),'Log In')]")
	private WebElement login_btn;
	
	public void clickOnLoginButton()
	{
		login_btn.click();
	}

}
