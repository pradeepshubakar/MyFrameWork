package com.uiFrameWork.CompanyName.ProjectName.helper.resource;

public class ResourceHelper {

	public static String getResourcePath(String path) {
		
		String basePath = System.getProperty("user.dir");
		//System.out.println(basePath);
		return basePath+"/"+path;
	}
	
	/*public static void main(String[] args) {
		
		String path = ResourceHelper.getResourcePath("src/main/resources/configfile/log4j.properties");
		System.out.println(path);
	}
*/}
