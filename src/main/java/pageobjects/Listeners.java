package pageobjects;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import resource.Basicprop;

public class Listeners extends Basicprop implements ITestListener {

	
	@Override
	public void onTestFailure(ITestResult result) {
		
		try {
			getScreenShotPath(result.getMethod().getMethodName() + ".png");
		} catch (IOException e) {
			e.printStackTrace();
		}
	
			}
	

}