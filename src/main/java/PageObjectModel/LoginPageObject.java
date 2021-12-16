package PageObjectModel;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {
	public WebDriver driver;
	By username=By.xpath("//input[@id='user_email']");
	By password=By.xpath("//input[@id='user_password']");
	By login=By.xpath("//input[@type='submit']");
	
	
	public LoginPageObject(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}
	public WebElement enterusername() {
		return driver.findElement(username);
	}
	public WebElement enterpassword() {
		return driver.findElement(password);
	}
	public WebElement clicklogin() {
		return driver.findElement(login);
	}
	

}