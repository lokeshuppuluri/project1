package Browser;


import java.io.IOException;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Launch {

	public static void main(String[] args) throws InterruptedException, IOException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\lokes\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//driver.get("https://www.instagram.com/techjobsolution/");
		//driver.get("https://www.myntra.com/");
		//driver.findElement(By.className("desktop-searchBar")).sendKeys("Shirts",Keys.ENTER);
		//driver.findElement(By.className("img-responsive")).click();
		
    driver.get("www.myntra.com");
  // File screenshotFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
  // FileUtils.copyFile(screenshotFile, new File(".//screenshot//"+".png"));
   driver.get("https://www.sugarcrm.com/au/solutions/?utm_source=google.com&utm_medium=organic");
 WebElement dropdown =  driver.findElement(By.className("class=\"dropdown-toggle nav-link\""));
   
  Select select = new Select (dropdown);
  
  select.selectByValue("menu-item-206");
  //this will be change for git

	}

}

