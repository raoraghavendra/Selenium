package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
	
	
	
	WebDriver driver;
	
	By home =By.xpath("//div/div[1]/nav/div/div/ul/li[1]/a");
	
	public Homepage(WebDriver driver) {
		
		this.driver=driver;
		
	}

	public WebElement homepage() {
		
		return driver.findElement(home);
		
		
		
	
	}
	
	
	
	
	
	
	

}
