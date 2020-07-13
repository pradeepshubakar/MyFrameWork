package com.uiFrameWork.CompanyName.ProjectName.helper.frame;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.uiFrameWork.CompanyName.ProjectName.helper.logger.LoggerHelper;
import com.uiFrameWork.CompanyName.ProjectName.testBase.TestBase;

public class FrameHelper {

	private Logger log = LoggerHelper.getLogger(FrameHelper.class);
	private WebDriver driver;
	
	public FrameHelper(WebDriver driver) {
		this.driver = driver;
		log.info("FrameHelper Object created");
		TestBase.logExtentReport("FrameHelper Object created");
	}
	/**
	 * this method will switch to frame based on frame index
	 * @param frameIndex
	 */
	public void switchToFrame(int frameIndex) {
		driver.switchTo().frame(frameIndex);
		log.info("Switched to: "+frameIndex+" frame");
		TestBase.logExtentReport("Switched to: "+frameIndex+" frame");
	}
	/**
	 * this method will switch to frame based on frame name
	 * @param frameName
	 */
	public void switchToFrame(String frameName) {
		driver.switchTo().frame(frameName);
		log.info("Switched to: "+frameName+" frame");
		TestBase.logExtentReport("Switched to: "+frameName+" frame");
	}
	/**
	 * this method will switch to frame based on webElement locator
	 * @param element
	 */
	public void switchToFrame(WebElement element) {
		driver.switchTo().frame(element);
		log.info("Switched to: "+element.toString()+" frame");
		TestBase.logExtentReport("Switched to: "+element.toString()+" frame");
	}
}
