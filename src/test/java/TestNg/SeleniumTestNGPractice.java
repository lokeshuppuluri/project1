package TestNg;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SeleniumTestNGPractice {
	WebDriver driver;
	@BeforeSuite(groups="sanity")		
	public void BeforeSuite() {
		//Kill all the Existing Browsers
		try {
			Runtime.getRuntime().exec("TASKKILL -f -im chrome.exe");
			Runtime.getRuntime().exec("TASKKILL -f -im chromeDriver.exe");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}
	@BeforeClass(groups="sanity")
	public void initializeDriver() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(200));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	@Parameters("URL")
	@BeforeMethod(groups="sanity")
	public void lanuching(String url) {
		driver.get(url);
		
	}

@Test(description="HandilingFrames",groups="smoke",enabled=false)
public void handilingFrames() {
	driver.switchTo().frame("frame-top");
	driver.switchTo().frame("frame-left");
	String text=driver.findElement(By.xpath("//*[normalize-space (text())='LEFT']")).getText();
	System.out.println(text);
	driver.switchTo().defaultContent();
	driver.switchTo().frame("frame-top");
	driver.switchTo().frame("frame-middle");
	String s=driver.findElement(By.xpath("//*[normalize-space(text())='MIDDLE']")).getText();
	System.out.println(s);
	driver.switchTo().defaultContent();
	driver.switchTo().frame("frame-top");
	driver.switchTo().frame("frame-right");
	String s1=driver.findElement(By.xpath("//*[normalize-space(text())='RIGHT']")).getText();
	System.out.println(s1);
	driver.switchTo().newWindow(WindowType.WINDOW);
	
	
	
}
@Test(description="Window handiling",groups="sanity")
public void SwitchingWindows() throws InterruptedException {
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://www.amazon.com");
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://www.google.com");
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://www.myntra.com");
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://www.Ajio.com");
	String browser=driver.getWindowHandle();
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://www.meesho.com");
	driver.close();
	driver.switchTo().window(browser);
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.get("https://www.amazon.com");
	Thread.sleep(2000);
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.get("https://www.google.com");
	Thread.sleep(2000);
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.get("https://www.myntra.com");
	Thread.sleep(2000);
	Set<String> s1=driver.getWindowHandles();
	for(String s:s1)
	{
		Thread.sleep(1000);
		driver.switchTo().window(s);
	}
}
int counter=0;
@AfterMethod(groups="sanity")
public void Countnoofmethods() {
	counter++;
	
}
@AfterClass(groups="sanity")
public void QuitBrowsers() throws InterruptedException {
	Thread.sleep(2000);
	driver.quit();
}
@AfterSuite(groups="sanity")
public void GenerateReports() {
	System.out.println("Total number of test cases are Executed "+counter);
}

}
