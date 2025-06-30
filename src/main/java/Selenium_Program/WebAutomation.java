package Selenium_Program;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebAutomation {

	@Test
	public void ValidateLoginPage() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yessinfotech.com/");
		 
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Software training classes institute in Hadapsar Pune")) {
			System.out.println("TC Passed");
		}else {
			System.out.println("TC failed");
			
		}
		     System.out.println("Build Succesfully run");
		
		driver.close();
		
	}
	
}
