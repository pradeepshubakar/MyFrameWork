package com.uiFrameWork.CompanyName.ProjectName.helper.browserConfiguration.config;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import com.uiFrameWork.CompanyName.ProjectName.helper.browserConfiguration.BrowserType;
import com.uiFrameWork.CompanyName.ProjectName.helper.browserConfiguration.ConfigReader;
import com.uiFrameWork.CompanyName.ProjectName.helper.resource.ResourceHelper;

public class PropertyReader implements ConfigReader {

	private static FileInputStream file;
	public static Properties OR;

	public PropertyReader() {
		try {
			String filePath = ResourceHelper.getResourcePath("src/main/resources/configfile/config.properties");
			file = new FileInputStream(new File(filePath));
			OR = new Properties();
			OR.load(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int getImplicitWait() {
		return Integer.parseInt(OR.getProperty("implicitwait"));
	}

	public int getExplicitWait() {
		return Integer.parseInt(OR.getProperty("explicitwait"));
	}

	public int getPageLoadTime() {
		return Integer.parseInt(OR.getProperty("pageloadtime"));
	}

	public BrowserType getBrowserType() {
		return BrowserType.valueOf(OR.getProperty("browserType"));
	}

	public String getUrl() {
		return OR.getProperty("applicationUrl");
	}

	public String getUserName() {
		return OR.getProperty("userName");
	}

	public String getPassWord() {
		return OR.getProperty("password");
	}

}
