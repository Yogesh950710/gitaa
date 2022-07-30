package com.qa.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.testBase.TestBase;

public class TradingPageTest extends TestBase {
	
	@Test
	public void buyShareWipro() throws InterruptedException
	{
		
		Thread.sleep(2000);
		dash.enterCompanyName("WIPRO");
		Thread.sleep(2000);
		dash.selectOptionWipro();
		//-----------------------
		Thread.sleep(2000);
		trade.clickOnBuyButton1();
		trade.enterQuantityOfShares("5");
		trade.clickOnBuyButton2();
		Thread.sleep(2000);
		System.out.println(trade.getStatus());
		Assert.assertEquals(trade.getStatus(), "Order Created successfully");
	}
	
	@Test
	public void buyShareAxis() throws InterruptedException
	{
		
		Thread.sleep(2000);
		dash.enterCompanyName("Axis");
		Thread.sleep(2000);
		dash.selectOptionAxis();
		//-----------------------
		Thread.sleep(2000);
		trade.clickOnBuyButton1();
		trade.enterQuantityOfShares("5");
		trade.clickOnBuyButton2();
		Thread.sleep(2000);
		System.out.println(trade.getStatus());
		Assert.assertEquals(trade.getStatus(), "Order Created ccessfully");
	}

}
