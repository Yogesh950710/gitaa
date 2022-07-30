package com.qa.testBase;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.qa.pageLayer.Dashboard;
import com.qa.pageLayer.LoginPage;
import com.qa.pageLayer.TradingPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;
	public static Logger logger;
	
	public LoginPage login;
	public Dashboard dash;
	public TradingPage trade;
	
	@BeforeClass
	public void start()
	{
		logger = Logger.getLogger("09 April AF");
		PropertyConfigurator.configure("Log4j.properties");
		
		logger.info("Framework exection started");
	}
	
	@AfterClass
	public void stop()
	{
		logger.info("Framework exection Stopped");
	}
	@Parameters("browser")        // browser = "chrome"
	@BeforeMethod
	public void setUp(String br)
	{            
		 if(br.equalsIgnoreCase("chrome"))
		 {
			 WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			 logger.info("Chrome launches"); 
		 }
		 else if (br.equalsIgnoreCase("firefox"))
		 {
			 WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
		 }
		 else if(br.equalsIgnoreCase("edge"))
		 {
			 WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
		 }
		 else 
		 {
			 System.out.println("Please provide valid browser name");
		 }
		 
		 driver.get("https://www.apps.dalalstreet.ai/login");
		 logger.info("url launches");
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 logger.info("maximized browser");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		 logger.info("provided waits");
		 
		 login = new LoginPage();
		 dash = new Dashboard();
		 trade = new TradingPage();
		 
		 
		login.enterEmailAddress("amarwaghmare573@gmail.com");
		login.enterPassword("Test@1234");
		login.clickOnLoginButton();
			//--------------------------------
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		logger.info("Chrome closed");
	}
}
