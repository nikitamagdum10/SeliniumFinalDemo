package PageObjectModel;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObject {
	public WebDriver driver;
	
	By signin=By.xpath("a[href*='sign_in']");
	
	


	

	public HomePageObject(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}




	public WebElement clicksignin() {
		return driver.findElement(signin);
	}

}