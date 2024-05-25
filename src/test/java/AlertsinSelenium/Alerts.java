package AlertsinSelenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Alerts {
	//Browser related pop-up
	@Test(description="Alerts")
	public void handleAlerts() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
	driver.findElement(By.xpath("//input[@id='alertexamples']")).click();
	System.out.println(driver.switchTo().alert().getText());
	Thread.sleep(2000);
	//Accepting the pop ups
	driver.switchTo().alert().accept();
	Thread.sleep(2000);
	//Dismiss the alerts
	driver.findElement(By.xpath("//input[@id='confirmexample']")).click();
	System.out.println(driver.switchTo().alert().getText());
	Thread.sleep(2000);
	driver.switchTo().alert().dismiss();
	//Write the text on pop-up
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	driver.findElement(By.xpath("//button[@onClick='jsPrompt()']")).click();
	Thread.sleep(2000);
	driver.switchTo().alert().sendKeys("This is lokesh");
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	Thread.sleep(2000);
	
	
	}
	@Test(description="dropdowns")
	public void dropdowns()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/dropdown");
		WebElement dd_option=driver.findElement(By.id("dropdown"));
		Select s=new Select(dd_option);
		s.selectByVisibleText("Option 1");
		s.selectByValue("2");
		System.out.println(s.getOptions().size());
		System.out.println(s.getFirstSelectedOption().getText());
		}
	@Test(description="Drag and drop")
	public void draganddrop()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		Actions a1=new Actions(driver);
		a1.dragAndDrop(driver.findElement(By.id("column-a")),driver.findElement(By.id("column-b"))).build().perform();
	}
	
@Test
public void Quit() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.quit();
	
}

}
