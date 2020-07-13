package com.uiFrameWork.CompanyName.ProjectName.helper.action;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.uiFrameWork.CompanyName.ProjectName.helper.logger.LoggerHelper;
import com.uiFrameWork.CompanyName.ProjectName.testBase.TestBase;

public class ActionHelper {

	private WebDriver driver;
	private Logger log = LoggerHelper.getLogger(ActionHelper.class);
	
	public ActionHelper(WebDriver driver) {
		this.driver = driver;
	}
	
	public void mouseOver(WebElement element) {
		log.info("mouse over action to: "+element.toString());
		TestBase.logExtentReport("mouse over action to: "+element.toString());
		Actions action = new Actions(driver);
		 action.moveToElement(element);
		
	}
	
	public void clickOnMouseOverElement(WebElement element) {
		log.info("mouse over action and clicking on "+element.toString());
		TestBase.logExtentReport("mouse over action and clicking on "+element.toString());
		Actions action = new Actions(driver);
		mouseOver(element);
		
		
		 
	}
}
