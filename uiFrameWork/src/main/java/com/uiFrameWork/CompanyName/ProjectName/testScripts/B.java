package com.uiFrameWork.CompanyName.ProjectName.testScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class B {
	int i = 1;
	@Test
	public void testB() {
		if(i == 3) {
			Assert.assertTrue(true);
		}
		else {
			System.out.println(i);
			i++;
			Assert.assertTrue(false);
		}
	}
}
