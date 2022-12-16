package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
	

	@FindBy (xpath="//td[contains(text(),' User: sapinder kaur' )]")
	
	WebElement userNameLabel;
	
@FindBy(xpath="//a[@title='Contacts']")
	WebElement contactsLink;
@FindBy(xpath="//a[@title='New Contact']")
WebElement newContactLink;
@FindBy(xpath="//a[contains(text(),'Deals')]")
WebElement dealsLink;
@FindBy(xpath="//a[contains(text(),'Tasks')]")
WebElement tasksLink;

public HomePage()
{
	  
	PageFactory.initElements(driver,this); 
	
}
      public String verifyHomePageTitle()
  	{
  		return driver.getTitle();

		
	}
      public boolean verifyCorrectUserName()
      {
    	  return userNameLabel.isDisplayed();
      }
      public ContactsPage clicksOnContactsLink()
  	{
  		contactsLink.click();
  		return new ContactsPage();
  	}
      public DealsPage clicksOnDealsLink()
    	{
    		dealsLink.click();
    		return new DealsPage();
    	}	
      public TasksPage clicksOnTasksLink()
    	{
    		tasksLink.click();
    		return new TasksPage();
    	}
      public void clickOnNewContactLink() {
    	  Actions action =new Actions(driver);
    	  action.moveToElement(contactsLink).build().perform();
    	  newContactLink.click();
    	  
      }
  		
}


