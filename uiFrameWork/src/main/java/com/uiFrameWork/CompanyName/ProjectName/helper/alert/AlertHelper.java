package com.uiFrameWork.CompanyName.ProjectName.helper.alert;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

import com.uiFrameWork.CompanyName.ProjectName.helper.logger.LoggerHelper;
import com.uiFrameWork.CompanyName.ProjectName.testBase.TestBase;

public class AlertHelper {

	private Logger log = LoggerHelper.getLogger(AlertHelper.class);
	private WebDriver driver;
	
	public AlertHelper(WebDriver driver) {
		this.driver = driver;
		log.info("AlertHelper Object is created");
		TestBase.logExtentReport("AlertHelper Object is created");
	}
	
	public Alert getAlert() {
		log.info("alert test: "+driver.switchTo().alert().getText());
		TestBase.logExtentReport("alert test: "+driver.switchTo().alert().getText());
		return driver.switchTo().alert();
	}
	
	public void acceptAlert() {
		getAlert().accept();
		log.info("accept alert is done");
		TestBase.logExtentReport("accept alert is done");
	}
	
	public  void dismissAlert() {
		getAlert().dismiss();
		log.info("dismiss alert is done");
		TestBase.logExtentReport("dismiss alert is done");
	}
	
	public String getAlertText() {
		String text = getAlert().getText();
		log.info("alert text: "+text);
		TestBase.logExtentReport("alert text: "+text);
		return text;
	}
	
	public boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			log.info("alert is present");
			TestBase.logExtentReport("alert is present");
			return true;
		}catch(NoAlertPresentException e) {
			log.info(e.getCause());
			return false;
		}
	}
	
	public void acceptAlertIfPresent() {
		if (isAlertPresent()) {
			acceptAlert();
		}
		else {
			log.info("alert is not present");
			TestBase.logExtentReport("alert is not present");
		}
	}
	
	public void dismissAlertIfPresent() {
		if (isAlertPresent()) {
			dismissAlert();
		}
		else {
			log.info("alert is not present");
			TestBase.logExtentReport("alert is not present");
		}
	}

	public void acceptPrompt(String text) {
		if(isAlertPresent()) {
		Alert alert = getAlert();
		alert.sendKeys(text);
		alert.accept();
		log.info("alert text: "+text);
		TestBase.logExtentReport("alert text: "+text);
		}
	}
}
