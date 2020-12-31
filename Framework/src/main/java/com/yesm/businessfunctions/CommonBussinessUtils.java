package com.yesm.businessfunctions;

import java.util.concurrent.TimeUnit;


import com.yesm.pagerepository.HomePage;
import com.yesm.pagerepository.LoginPage;

public class CommonBussinessUtils extends BaseUtil {



	public static void login (String Username,String Password) {
 
		
		LoginPage.enterUserName(Username);
		LoginPage.enterPassWord(Password);
		LoginPage.clickSubmit();
	}

	public static void logout() {
		HomePage.clickWelcome();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		HomePage.clickLogout();
	}

}
