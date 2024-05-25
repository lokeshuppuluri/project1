package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class amzon {
	WebDriver driver;
@Test
public void Search() {
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.amazon.in/");
	
}
}
