package Resourses;
//just changes for git learning
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public WebDriver driver;
	
	public WebDriver initialisedriver() throws IOException {
		
	
     Properties prop=new Properties();
     
     FileInputStream fis = new FileInputStream
    		 ("C:\\Users\\nikit\\eclipse-workspace\\finaldemo\\src\\main\\java\\Resourses\\Data.properties");
     prop.load(fis);
      String browserName= prop.getProperty("browser");
      System.out.println(browserName);
      if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikit\\OneDrive\\Desktop\\Selinium\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			
		} else if (browserName.equals("firefox")) {
		System.out.println("firefox");
		}
     else {
    	 System.out.println("ie");
    	 //ie internal explorer code
     }
     return driver;
}
}
	
	
	
	
	