package com.yesm.businessfunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.yesm.configuration.prop;

public class BaseUtil {
	
	public static WebDriver driver=null;
	
	public static void openApp() {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\priya\\eclipse-framework\\Framework\\Drivers\\chromedriver.exe");
	
	driver=new ChromeDriver();
	driver.get(prop.get("url"));
	}
}
