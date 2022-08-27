package tests;

import static org.testng.Assert.*;

import java.awt.List;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjects.Homepage;
import pageobjects.LoginTC;
import resource.Basicprop;

public class TestsExecution extends Basicprop {

	@BeforeTest
	public void invokeBrowser() throws IOException {
		gotoApp();
	}

	@Test(dataProvider = "sendData", dataProviderClass = Dataproviders.class)
	public void gotoApps(String uname, String pwd) throws IOException, InterruptedException {

		String acttitle = driver.getTitle();
		String exptitle = "Rummy Online | Play Indian Rummy Games & Win Real Money In Prizes";
		System.out.println(acttitle);
		assertEquals(acttitle, exptitle, "title is passed");

		LoginTC ln = new LoginTC(driver);
		ln.username().sendKeys(uname);
		ln.password().sendKeys(pwd);
		ln.submitButton().click();
		Thread.sleep(2000);
		getScreenShotPath("test");

		Homepage hp = new Homepage(driver);
		hp.homepage().click();
		getScreenShotPath("home");
		driver.switchTo().frame("flash-frame");
		java.util.List<WebElement> count = driver.findElements(By.cssSelector(" div.checkmark"));
		count.get(0).click();
		count.size();
		getScreenShotPath("frame");

	}

	@AfterTest
	public void closeBrowser() {

		driver.quit();

	}
}
