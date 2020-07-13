package com.uiFrameWork.CompanyName.ProjectName.helper.window;

import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.uiFrameWork.CompanyName.ProjectName.helper.logger.LoggerHelper;
import com.uiFrameWork.CompanyName.ProjectName.testBase.TestBase;

public class WindowHelper {

	private Logger log = LoggerHelper.getLogger(WindowHelper.class);
	private WebDriver driver;
	
	public WindowHelper(WebDriver driver) {
		this.driver = driver;
		log.info("WindowHelper Object is created");
		TestBase.logExtentReport("WindowHelper Object is created");
	}
	/**
	 * this method will switch to parent window
	 */
	public void switchToParentWindow() {
		log.info("switching to parent window..");
		TestBase.logExtentReport("switching to parent window..");
		driver.switchTo().defaultContent();
	}
	/**
	 * this method will switch to child window based on index
	 * @param index
	 */
	public void switchToWindow(int index) {
		Set<String> windows = driver.getWindowHandles();
		int i = 1;
		for(String window:windows) {
			if(i == index) {
			driver.switchTo().window(window);
			}
			else {
				i++;
			}
		}
	}
	/**
	 * this method will close all tabbed window and switched to main window
	 */
	public void closeAllTabsAndSwitchToMainWindow() {
		String parentWinowTitle = driver.getTitle();
		Set<String> windows = driver.getWindowHandles();
		for(String window:windows) {
			String currentWindowTitle = driver.switchTo().window(window).getTitle();
			if (!parentWinowTitle.equalsIgnoreCase(currentWindowTitle)) {
				driver.close();
			}
		}
		log.info("switched to main window");
		TestBase.logExtentReport("switched to main window");
	}
	/**
	 * this method will do browser back navigation
	 */
	public void navigationBack() {
		log.info("navigating back..");
		TestBase.logExtentReport("navigating back..");
		driver.navigate().back();
	}
	/**
	 * this method will do browser forward navigation
	 */
	public void navigationFarward() {
		log.info("navigating forward..");
		TestBase.logExtentReport("navigating forward..");
		driver.navigate().forward();
	}
	/**
	 * this method will do browser refresh navigation
	 */
	public void navigationRefresh() {
		log.info("navigating refresh..");
		TestBase.logExtentReport("navigating refresh..");
		driver.navigate().refresh();
	}


}
