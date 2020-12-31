package com.yesm.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.yesm.businessfunctions.BaseUtil;
import com.yesm.businessfunctions.CommonBussinessUtils;
import com.yesm.configuration.prop;
import com.yesm.pagerepository.HomePage;
import com.yesm.pagerepository.LoginPage;
import com.yesm.utilityfunctions.ExcelUtil;





public class LoginLogout extends BaseUtil{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rowcount=ExcelUtil.getRowCount();
		for (int i=1;i<rowcount;i++) {
			BaseUtil.openApp();
			CommonBussinessUtils.login(ExcelUtil.getData(1,0),ExcelUtil.getData(1,1));
			CommonBussinessUtils.logout();
			driver.close();
			driver.quit();
		}

		//	System.setProperty("webdriver.chrome.driver","C:\\Users\\priya\\eclipse-framework\\Framework\\Drivers\\chromedriver.exe");

		//WebDriver driver=new ChromeDriver();
		//driver.get("https://opensource-demo.orangehrmlive.com/");

		//driver.findElement(By.id("txtUsername")).sendKeys(prop.get("username"));
		//driver.findElement(By.id("txtPassword")).sendKeys(prop.get("password"));
		//driver.findElement(By.id("btnLogin")).click();

		//LoginPage.enterUserName(prop.get("username"));
		//LoginPage.enterPassWord(prop.get("password"));
		//LoginPage.clickSubmit();
		//driver.findElement(By.id("welcome")).click();
		//driver.findElement(By.linkText("Logout")).click();

		//HomePage.clickWelcome();
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//HomePage.clickLogout();

	}

}
