package finaldemo;

import java.io.IOException;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjectModel.HomePageObject;
import PageObjectModel.LoginPageObject;
import Resourses.BaseClass;

public class login_TestCase extends BaseClass{
	
	@Test(dataProvider="getProvider")
			
	public void basepagenavigation(String username,String password) throws IOException {
		
		driver= initialisedriver();
		driver.get("http://www.qaclickacademy.com/");
		
		HomePageObject HPO=new HomePageObject(driver);
		HPO.clicksignin().click();
LoginPageObject LPO=new LoginPageObject(driver);
		LPO.enterusername().sendKeys(username);
		LPO.enterpassword().sendKeys(password);
		LPO.clicklogin().click();
	}
	
	@DataProvider
	public Object[][]getProvider() {
		Object[][] data=new Object[2][2];      //two rows n two columns
		       data[0][0]="test@1";
		       data[0][1]="nikita123";       // row n coloum nusar 0,0  0,1  1,0  1,1
		       data[1][0]="test@2";
		       data[1][1]="abcd";
			return data;
	}
	

}