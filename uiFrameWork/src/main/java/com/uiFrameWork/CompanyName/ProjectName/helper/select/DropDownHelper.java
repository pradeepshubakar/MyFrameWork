package com.uiFrameWork.CompanyName.ProjectName.helper.select;

import java.util.LinkedList;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.uiFrameWork.CompanyName.ProjectName.helper.logger.LoggerHelper;
import com.uiFrameWork.CompanyName.ProjectName.testBase.TestBase;

public class DropDownHelper {

	private Logger log = LoggerHelper.getLogger(DropDownHelper.class);
	private WebDriver driver;
	
	public DropDownHelper(WebDriver driver) {
		this.driver = driver;
		log.info("DropDownHelper object is created");
		TestBase.logExtentReport("DropDownHelper object is created");
	}
	/**
	 * this method will use to select the dropDown using value
	 * @param element
	 * @param value
	 */
	public void selectUsingValue(WebElement element, String value) {
		Select select = new Select(element);
		log.info("select using value and value is: "+value);
		TestBase.logExtentReport("select using value and value is: "+value);
		select.selectByValue(value);
	}
	/**
	 * this method will use to select the dropDown using index
	 * @param element
	 * @param index
	 */
	public void selectUsingIndex(WebElement element, int index) {
		Select select = new Select(element);
		log.info("select using index and index is: "+index);
		TestBase.logExtentReport("select using index and index is: "+index);
		select.selectByIndex(index);
	}
	/**
	 * this method will use to select the dropDown using visible text
	 * @param element
	 * @param visibleText
	 */
	public void selectUsingVisibleText(WebElement element, String visibleText) {
		Select select = new Select(element);
		log.info("select using visibleText and visibleText is: "+visibleText);
		TestBase.logExtentReport("select using visibleText and visibleText is: "+visibleText);
		select.selectByVisibleText(visibleText);
	}
	/**
	 * this method will use to deSelect the dropDown using value
	 * @param element
	 * @param value
	 */
	public void deSelectUsingValue(WebElement element, String value) {
		Select select = new Select(element);
		log.info("deselect using value and value is: "+value);
		TestBase.logExtentReport("deselect using value and value is: "+value);
		select.deselectByValue(value);
	}
	/**
	 * this method will use to deSelect the dropDown using index
	 * @param element
	 * @param index
	 */
	public void deSelectUsingIndex(WebElement element, int index) {
		Select select = new Select(element);
		log.info("deselect using index and index is: "+index);
		TestBase.logExtentReport("deselect using index and index is: "+index);
		select.deselectByIndex(index);
	}
	/**
	 * this method will use to deSelect the dropDown using visibleText
	 * @param element
	 * @param visibleText
	 */
	public void deSelectUsingVisibleText(WebElement element, String visibleText) {
		Select select = new Select(element);
		log.info("deselect using visibleText and visibleText is: "+visibleText);
		TestBase.logExtentReport("deselect using visibleText and visibleText is: "+visibleText);
		select.deselectByVisibleText(visibleText);
	}
	/**
	 * this method will use to get all dropDown data
	 * @param element
	 * @return
	 */
	public List<String> getAllDropDownData(WebElement element) {
		Select select = new Select(element);
		List<WebElement> elementList = select.getOptions();
		List<String> valueList = new LinkedList<String>();
		for(WebElement ele:elementList) {
			valueList.add(ele.getText());
		}
		return valueList;
	}
}
