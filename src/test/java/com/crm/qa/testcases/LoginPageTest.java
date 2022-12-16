package com.crm.qa.testcases;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	 LoginPage loginPage;
	 
     HomePage homePage;
     
     public LoginPageTest() 
     {
 		super();  //it called test base class(constructor)
 	}
 	
 	
 	@BeforeMethod
 	
 	public void setUp()   {
 		
 		 initialization(); 

 		loginPage =new LoginPage();
 		
 	}
 		@Test(priority=1)
 		public void LoginPageTitleTest() {
 		String title =loginPage.validateLoginPageTitle();
 		Assert.assertEquals(title,"CRMPRO - CRM software for customer relationship management, sales, and support.");
 	}
 		@Test(priority=2)
 		public void CRMLogoTest()
 		{
 			
 		boolean flag=loginPage.validateCRMLogo();
 		Assert.assertTrue(flag);
 		
 		}
 		
 		@Test(priority=3)
 		public void loginTest() {
 			homePage =loginPage.Login(prop.getProperty("username"), prop.getProperty("password"));
 			
 		}
 		@AfterMethod
 		public void tearDown() {
 			driver.quit();
 		}

}
