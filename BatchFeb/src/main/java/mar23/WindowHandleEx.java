package mar23;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kapil Newaskar\\eclipse-workspace\\BatchFeb\\Drivers\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Windows.html");
		
		driver.findElement(By.xpath("(//button[@class='btn btn-info'])[1]")).click();
		
		System.out.println(driver.getTitle());
		
		String mainwindow = driver.getWindowHandle(); // return the parent window name
		System.out.println(mainwindow);
		
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows);
		
		Iterator<String> it = windows.iterator();
		
		while(it.hasNext()) {
			String window = it.next();
			if(window.equalsIgnoreCase(mainwindow)) {
				driver.switchTo().window(window);
				System.out.println("Child window tile" + driver.getTitle());
				driver.findElement(By.linkText("Downloads")).click();
				System.out.println("Child window download page title" + driver.getTitle());
				driver.close();
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
