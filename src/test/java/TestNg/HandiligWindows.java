package TestNg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class HandiligWindows {
	public class SeleniumTestNGPractice {
		WebDriver driver;
		@BeforeSuite
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
		@BeforeClass
		public void initializeDriver() {
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(200));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
		}
		@Test(description="Window handiling")
		public void SwitchingWindows() throws InterruptedException {
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.amazon.com");
			Thread.sleep(2000);
			driver.switchTo().newWindow(WindowType.WINDOW);
			driver.get("https://www.google.com");
			Thread.sleep(2000);
			driver.switchTo().newWindow(WindowType.WINDOW);
			driver.get("https://www.myntra.com");
			Thread.sleep(2000);
			driver.switchTo().newWindow(WindowType.WINDOW);
			driver.get("https://www.Ajio.com");
			Thread.sleep(2000);
			driver.switchTo().newWindow(WindowType.WINDOW);
			driver.get("https://www.meesho.com");
		}
		@Test
		(description="Window handiling")
		public void SwitchingWindows1() throws InterruptedException {
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.amazon.com");
			Thread.sleep(2000);
		}

		@AfterClass
		public void QuitBrowsers() throws InterruptedException {
			Thread.sleep(2000);
			driver.close();
		}
		@AfterSuite
		public void GenerateReports() {
			driver.quit();
		}


	}
	
	}
