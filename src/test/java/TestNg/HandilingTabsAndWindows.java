package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandilingTabsAndWindows {
	WebDriver driver;
	
	@Test(description="Window handiling")
	public void SwitchingWindows() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com");
		String Default=driver.getWindowHandle();
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com");
		
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(Default);
		driver.switchTo().newWindow(WindowType.WINDOW);
	    driver.get("https://www.myntra.com");
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.Ajio.com");
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.meesho.com");
	}

}
