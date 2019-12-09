package Util;

import org.openqa.selenium.JavascriptExecutor;

import BaseTest.BaseTest;

public class TestUtil extends BaseTest{
	
	
	//public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 20;
	
	public void switchToWindow() {
		for (String winHandle : driver.getWindowHandles()) {
		    driver.switchTo().window(winHandle); 
		}
	}
	
	public void Scroll() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("javascript:window.scrollBy(270,500)");
	}
	
	
}
