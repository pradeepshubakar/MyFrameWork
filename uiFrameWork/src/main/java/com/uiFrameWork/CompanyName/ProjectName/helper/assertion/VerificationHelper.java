package com.uiFrameWork.CompanyName.ProjectName.helper.assertion;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.uiFrameWork.CompanyName.ProjectName.helper.logger.LoggerHelper;
import com.uiFrameWork.CompanyName.ProjectName.testBase.TestBase;

public class VerificationHelper {

	private Logger log = LoggerHelper.getLogger(VerificationHelper.class);
	private WebDriver driver;

	public VerificationHelper(WebDriver driver) {
		this.driver = driver;
		log.info("VerificationHelper Object created");
		TestBase.logExtentReport("VerificationHelper Object created");
	}

	/**
	 * this method will check whether image or text is displaying
	 * 
	 * @param element
	 * @return
	 */
	public boolean isDisplayed(WebElement element) {
		try {
			element.isDisplayed();
			log.info("element is displayed.. " + element.getText());
			TestBase.logExtentReport("element is displayed.. " + element.getText());
			return true;
		} catch (Exception e) {
			log.error("elment is not displayed.. " + e.getCause());
			TestBase.logExtentReport("elment is not displayed.. " + e.getCause());
			return false;
		}
	}

	/**
	 * this method will check whether image or text is not displaying
	 * 
	 * @param element
	 * @return
	 */
	public boolean isNotDisplayed(WebElement element) {
		try {
			element.isDisplayed();
			log.info("element is displayed.. " + element.getText());
			TestBase.logExtentReport("element is displayed.. " + element.getText());
			return false;
		} catch (Exception e) {
			log.error("elment is not displayed.. " + e.getCause());
			TestBase.logExtentReport("elment is not displayed.. " + e.getCause());
			return true;
		}
	}

	/**
	 * this method will use to polling the element text
	 * 
	 * @param element
	 * @return
	 */
	public String getText(WebElement element) {
		if (null == element) {
			log.info("webElement is null..");
			TestBase.logExtentReport("webElement is null..");
			return null;
		}
		boolean status = isDisplayed(element);
		if (status) {
			log.info("element text is: " + element.getText());
			TestBase.logExtentReport("element text is: " + element.getText());
			return element.getText();
		} else {
			return null;
		}
	}

	/**
	 * this method will use to get the title of the webElement
	 * 
	 * @return
	 */
	public String getTitle() {
		log.info("page title is: " + driver.getTitle());
		TestBase.logExtentReport("page title is: " + driver.getTitle());
		return driver.getTitle();
	}
}
