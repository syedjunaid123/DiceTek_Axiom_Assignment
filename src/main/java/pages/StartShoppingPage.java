package pages;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import object_repository.GetLocators;

public class StartShoppingPage extends GetLocators{
	
	public AndroidDriver<MobileElement> start_shopping(AndroidDriver<MobileElement> driver, String param ) throws InterruptedException, IOException
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Properties props = this.gettingLocator();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(props.getProperty(param)))).click();
		return  driver;
	}

}
