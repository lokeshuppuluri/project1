package Naukari;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NaukariJobs {
	@Test
	public void Naukari() throws Exception {
		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.findElement(By.xpath("//*[@id='APjFqb']")).sendKeys("Naukari.com",Keys.ENTER);
	driver.findElement(By.xpath("//*[text()='Naukri.com: Jobs - Recruitment - Job Search - Employment ...']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id='login_Layer']")).click();
	Thread.sleep(3000);
	driver.close();
	
	
	}
}
