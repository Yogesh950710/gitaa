package com.qa.utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.qa.testBase.TestBase;

public class ListenersEx extends TestBase implements ITestListener  {

	@Override
	public void onTestStart(ITestResult result) 
	{
			logger.info("Test Case execution");
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		logger.info("Test Case execution passed");
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		UtilClass.takeSS(result.getName()+System.currentTimeMillis());
		logger.info("Test Case execution failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		logger.info("Test Case execution skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) 
	{
		
	}

	@Override
	public void onStart(ITestContext context) 
	{
		
	}

	@Override
	public void onFinish(ITestContext context) 
	{
		
	}

}
