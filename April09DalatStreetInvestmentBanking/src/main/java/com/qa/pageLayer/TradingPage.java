package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class TradingPage extends TestBase {
	
	public TradingPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Buy')]")
	private WebElement buy_button1;
	
	public void clickOnBuyButton1()
	{
		buy_button1.click();
	}
	
	@FindBy(xpath="(//input[@class='form-control'])[3]")
	private WebElement quantity_box;
	
	public void enterQuantityOfShares(String count)
	{
		quantity_box.sendKeys(count);
	}
	
	@FindBy(xpath="//button[contains(text(),'Buy')]")
	private WebElement buy_button2;
	
	public void clickOnBuyButton2()
	{
		buy_button2.click();
	}

	@FindBy(xpath="(//div[text()='Order Created successfully'])[1]")
	private WebElement status;
	
	public String getStatus()
	{
		String data=status.getText();
		return data;
	}
}
