package AlertsinSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Popups_Dropdowns_DragDrop {
	@Test(description="popupa")
	public void popups() throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//*[text()='Checkboxes']")).click();
		driver.findElement(By.xpath("//*[@id='checkboxes']/input[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='checkboxes']/input[2]")).click();
	}
	@Test(description="draganddrop")
	public void draganddrop() throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[text()='Drag and Drop']")).click();
		Actions a1=new Actions(driver);
		a1.dragAndDrop(driver.findElement(By.xpath("//*[@id='column-a']")), driver.findElement(By.xpath("//*[@id='column-b']"))).build().perform();
		driver.navigate().back();
	}
	@Test(description="dropdowns")
	public void dropdowns() throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//*[text()='Dropdown']")).click();
		WebElement drop=driver.findElement(By.xpath("//*[@id='dropdown']"));
		Select s=new Select(drop);
		Thread.sleep(2000);
		s.selectByValue("2");
		Thread.sleep(2000);
		s.selectByVisibleText("Option 1");
		
		
	}
	

}
