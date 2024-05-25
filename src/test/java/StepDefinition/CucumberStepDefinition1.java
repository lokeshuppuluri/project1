package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;

public class CucumberStepDefinition1 {
	
@Given("Launch the Application from the given URL")
public void launchtheapplication()
{
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		
}
}