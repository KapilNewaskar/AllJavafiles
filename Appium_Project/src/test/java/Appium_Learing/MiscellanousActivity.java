package Appium_Learing;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class MiscellanousActivity extends Test_Base1 {

	@Test
	public void SwipeTest() {

		// App PAckages and App Activity
		// use for windows in cmd =>> adb shell dumpsys window | find "mCurrentFocus"

		Activity activity = new Activity("io.appium.android.apis",
				"io.appium.android.apis.preference.PreferenceDependencies");
		driver.startActivity(activity);
		// We can reduse below two steps by using above activity
//		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
//		driver.findElement(AppiumBy.accessibilityId("3. Preference dependencies")).click();
		driver.findElement(By.id("android:id/checkbox")).click();

		// Landscape rotation code
		DeviceRotation landscape = new DeviceRotation(0, 0, 90);
		driver.rotate(landscape);
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();

		String title = driver.findElement(By.id("android:id/alertTitle")).getText();
		assertEquals(title, "WiFi settings");

		// Copy to clipboard

		driver.setClipboardText("Kapil123456789");
		driver.findElement(By.id("android:id/edit")).sendKeys(driver.getClipboardText());

		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		driver.findElement(By.id("android:id/button1")).click();
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.pressKey(new KeyEvent(AndroidKey.HOME));

	}
}
