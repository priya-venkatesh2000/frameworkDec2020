package testngtest;

import org.testng.annotations.Test;

import com.yesm.businessfunctions.BaseUtil;
import com.yesm.businessfunctions.CommonBussinessUtils;
import com.yesm.configuration.prop;


public class Test2 extends BaseUtil{
  @Test (groups= {"smoke"})
  public void loginlogout() {
	  
	  BaseUtil.openApp();
		CommonBussinessUtils.login(prop.get("username"),prop.get("password"));
		CommonBussinessUtils.logout();
		driver.close();
		driver.quit();  
  }
}
