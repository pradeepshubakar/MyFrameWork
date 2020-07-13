package com.uiFrameWork.CompanyName.ProjectName.helper.javaScript;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.uiFrameWork.CompanyName.ProjectName.helper.logger.LoggerHelper;
import com.uiFrameWork.CompanyName.ProjectName.testBase.TestBase;

public class JavaScriptHelper {

	private Logger log = LoggerHelper.getLogger(JavaScriptHelper.class);
	private WebDriver driver;

	public JavaScriptHelper(WebDriver driver) {
		this.driver = driver;
		log.info("JavaScriptHelper Object created");
		TestBase.logExtentReport("JavaScriptHelper Object created");
	}

	/**
	 * this method will execute script
	 * 
	 * @param script
	 * @return
	 */
	public Object executeScript(String script) {
		JavascriptExecutor exe = (JavascriptExecutor) driver;
		return exe.executeScript(script);
	}

	/**
	 * this method will execute script along with multiple arguments(... mean is
	 * multiple)
	 * 
	 * @param script
	 * @param args
	 * @return
	 */
	public Object executeScript(String script, Object... args) {
		JavascriptExecutor exe = (JavascriptExecutor) driver;
		return exe.executeScript(script, args);
	}

	/**
	 * this method will scroll to element
	 * 
	 * @param element
	 */
	public void scrollToElement(WebElement element) {
		executeScript("window.scrollTo(arguments[0],arguments[1])", element.getLocation().x, element.getLocation().y);
	}

	/**
	 * this method will scroll to element and click
	 * 
	 * @param element
	 */
	public void scrollToElementAndClick(WebElement element) {
		scrollToElement(element);
		element.click();
		log.info("element is clicked " + element.toString());
		TestBase.logExtentReport("element is clicked " + element.toString());
	}

	/**
	 * this method will scoll till to webElement to view
	 * 
	 * @param element
	 */
	public void scrollInToView(WebElement element) {
		log.info("scroll till webElement");
		TestBase.logExtentReport("scroll till webElement");
		executeScript("arguments[0].scrollIntoView()", element);	}

	/**
	 * this method will scroll till to webElement to view and click
	 * 
	 * @param element
	 * @throws InterruptedException 
	 */
	public void scrollInToViewAndClick(WebElement element) throws InterruptedException {
		scrollInToView(element);
		Thread.sleep(2000);
		element.click();
		log.info("element is clicked " + element.toString());
	}

	/**
	 * this method will scroll down vertically
	 */
	public void scrollDownVertically() {
		log.info("scrolling down vertically..");
		TestBase.logExtentReport("scrolling down vertically..");
		executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}

	/**
	 * this method will scroll up vertically
	 */
	public void scrollUpVertically() {
		log.info("scrolling up vertically..");
		TestBase.logExtentReport("scrolling up vertically..");
		executeScript("window.scrollTo(0,-document.body.scrollHeight)");
	}

	/**
	 * this method will scroll till given pixel(e.g=1500)
	 * 
	 * @param pixel
	 */
	public void scrollDownByPixel(int pixel) {
		executeScript("window.scrollBy(0," + pixel + ")");
	}

	public void scrollUpByPixel(int pixel) {
		executeScript("window.scrollBy(0,-" + pixel + ")");
	}

	/**
	 * this method zoom screen by 100%
	 */
	public void zoomIn100Percentage() {
		executeScript("document.body.style.zoom='100%'");
		log.info("screen zoomed by 100%");
		TestBase.logExtentReport("screen zoomed by 100%");

	}

	/**
	 * this method zoom screen by 60%
	 */
	public void zoomIn60Percentage() {
		executeScript("document.body.style.zoom='60%'");
		log.info("screen zoomed by 60%");
		TestBase.logExtentReport("screen zoomed by 60%");
	}

	/**
	 * this method zoom screen by 40%
	 */
	public void zoomIn40Percentage() {
		executeScript("document.body.style.zoom='40%'");
		log.info("screen zoomed by 40%");
		TestBase.logExtentReport("screen zoomed by 40%");

	}

}
