package Seleniumbasics;



//import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SearchingProduct {
 @Test
 public void sampletest() throws Exception
{
WebDriver driver = new ChromeDriver();
driver.get("https://www.flipkart.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(20));
//Searching Laptop.
driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Laptop");
driver.findElement(By.xpath("//*[@name='q']")).sendKeys(Keys.ENTER);
driver.findElement(By.xpath("//*[@class='MIXNux']")).click();
Thread.sleep(4000);
//Adding Product to the cart
driver.findElement(By.tagName("Add to cart")).click();
Thread.sleep(4000);
//login flipkart.
driver.findElement(By.xpath("//*[@class='_1_3w1N']")).click();
driver.findElement(By.xpath("//*[@class='_2IX_2- VJZDxU']")).click();
//Place Order
driver.findElement(By.xpath("//*[@class='_2KpZ6l _2ObVJD _3AWRsL']")).click();
//Address
driver.findElement(By.tagName("Delivery Address")).click();
driver.findElement(By.xpath("//*[@class='_1lRtwc _1Jqgld']")).sendKeys("nani");
driver.findElement(By.xpath("//*[@name='phone']")).sendKeys("9192938393");
driver.findElement(By.xpath("//*[@name='addressLine2']")).sendKeys("Hyderabad");
driver.findElement(By.xpath("//*[@name='addressLine1']")).sendKeys("3-42A, Krishnanager");
driver.findElement(By.xpath("//*[@name='city']")).sendKeys("Hyderabad");
driver.findElement(By.xpath("//*[@name='State']")).sendKeys("Telangana");
driver.findElement(By.xpath("//*[@name='_2Fn-Ln _3iI7Qn\']")).click();
driver.findElement(By.xpath("//*[@name='Save and Deliver Here']")).click();
//Order Summary
driver.findElement(By.xpath("//*[@name='_2ksRRJ']")).sendKeys("mylove@gmail.com");
driver.findElement(By.tagName("CONTINUE")).click();
//Proceed to payment
driver.findElement(By.xpath("//*[@name='Cash on delivery']")).click();
driver.close();







//
//driver.findElement(By.xpath("//span[text()='Smartphones & Basic Mobiles']")).click();
//Thread.sleep(2000);
//driver.findElement(By.xpath("//span[text()='Samsung']")).click();
//Thread.sleep(2000);
//driver.findElement(By.xpath("//li[@id='p_89/OnePlus']/descendant::i[@class='a-icon a-icon-checkbox']")).click();
//int noofElements=driver.findElements(By.xpath("//div[starts-with(@cel_widget_id,'MAIN-SEARCH_RESULTS-2')]/descendant::img")).size();
//driver.findElements(By.xpath("//div[starts-with(@cel_widget_id,'MAIN-SEARCH_RESULTS-2')]/descendant::img")).get(ThreadLocalRandom.current().nextInt(noofElements-1)).click();

}
}
