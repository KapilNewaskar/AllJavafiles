package Appium_Learing;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AppiumBasics {

	
	@Test
	public void AppiumTest() throws MalformedURLException {
		
		//Code to start the server
		AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\newas\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();
				
		service.start();
		
		//Appium code => Appium server => Mobile
		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Kapil_Mobile");
		options.setApp("C:\\Users\\newas\\eclipse-workspace\\Appium_Project\\src\\test\\java\\Resources\\API Demos for Android_1.9.0_Apkpure.apk");
		
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options); //select argument Appium driver local service, capabilities
		
		driver.findElement(AppiumBy.id("android:id/button1")).click();
		
		driver.findElement(AppiumBy.id("com.coolbase.androidprograming:id/button")).click();
		driver.findElement(AppiumBy.id("com.coolbase.androidprograming:id/firstout")).click();
		driver.findElement(AppiumBy.id("com.coolbase.androidprograming:id/secondout")).click();
		driver.findElement(AppiumBy.id("com.coolbase.androidprograming:id/thirdout")).sendKeys("Test Pass");
		
		driver.quit();
		
		
		//Locators => Xpath, Id, accessibility, className, androidUiAutomator 
		
		//Stop server
		service.stop();
	}
}
