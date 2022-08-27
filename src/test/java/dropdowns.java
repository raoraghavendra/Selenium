import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdowns {

	@Test
	public void dropDowns() throws InterruptedException {
		ChromeOptions options=new ChromeOptions();

		Map<String, Object> prefs=new HashMap<String,Object>();

		prefs.put("profile.default_content_setting_values.notifications", 1);

		//1-Allow, 2-Block, 0-default

		options.setExperimentalOption("prefs",prefs);

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.spicejet.com");

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		Thread.sleep(2000);
	WebElement el =	driver.findElement(By.xpath("//div[5]/div[2]/div[1]/div[2]"));
		
		Select sl= new Select(el);
		sl.selectByIndex(2);
		
		
		
		
		
		
		driver.close();
		
		
		
		
		
		
		
	}
}
