package steps;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass extends AbstractTestNGCucumberTests {

	public static ChromeDriver driver;//initial value of driver is null
	@BeforeMethod
	public void preCondition() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();//initializing the driver
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println(driver);
		driver.get("http://leaftaps.com/opentaps");


	}
	@AfterMethod
	public void postCondition() {
		driver.close();

}
}
