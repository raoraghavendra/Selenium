package resource;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basicprop {

	public WebDriver driver;
/*
	public Basicprop() {
		this.driver=driver;
	}
*/
	@Test
	public WebDriver gotoApp() throws IOException {

		Properties prop = new Properties();
		FileInputStream fi = new FileInputStream("D:\\test\\Tests\\src\\main\\java\\resource\\app.properties");
		prop.load(fi);
		String browser = prop.getProperty("browser");

		if (browser.equalsIgnoreCase("chrome")) {

			ChromeOptions options = new ChromeOptions();
			options.addArguments("disable-notifications");

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(options);
			driver.get(prop.getProperty("url"));
		}
		return driver;

	}

	public String getScreenShotPath(String testCaseName ) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
		FileUtils.copyFile(source,new File(destinationFile));
		return destinationFile;


	}
	

	}


