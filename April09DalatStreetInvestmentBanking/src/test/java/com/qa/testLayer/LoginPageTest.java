package com.qa.testLayer;

import org.testng.annotations.Test;

import com.qa.pageLayer.LoginPage;
import com.qa.testBase.TestBase;

public class LoginPageTest extends TestBase {
	
	@Test
	public void verifyLogin()
	{
		LoginPage login = new LoginPage();
		login.enterEmailAddress("amarwaghmare573@gmail.com");
		login.enterPassword("Test@1234");
		login.clickOnLoginButton();
	}

}
