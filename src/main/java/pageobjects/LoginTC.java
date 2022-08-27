package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginTC {

	public WebDriver driver;

	public LoginTC(WebDriver driver) {

		this.driver = driver;
	}

	By uname = By.xpath("//*[@id='email']");
	By pwd = By.xpath("//*[@id='password']");
	By submit = By.cssSelector("button[type='submit']");

	public WebElement username() {

		return driver.findElement(uname);

	}

	public WebElement password() {

		return driver.findElement(pwd);

	}

	public WebElement submitButton() {

		return driver.findElement(submit);
	}
	
	

	
	
	
	
	
	
	

}
