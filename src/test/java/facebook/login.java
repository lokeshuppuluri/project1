package facebook;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class login {
	@Test
	public void facebook() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https:www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("Lokeshvarma@gmail.com");
	}

}
