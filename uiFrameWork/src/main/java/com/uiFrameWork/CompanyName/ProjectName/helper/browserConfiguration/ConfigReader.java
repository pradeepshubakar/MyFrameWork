package com.uiFrameWork.CompanyName.ProjectName.helper.browserConfiguration;


public interface ConfigReader {

	public int getImplicitWait();
	public int getExplicitWait();
	public int getPageLoadTime();
	public BrowserType getBrowserType();
	public String getUrl();
	public String getUserName();
	public String getPassWord();

}
