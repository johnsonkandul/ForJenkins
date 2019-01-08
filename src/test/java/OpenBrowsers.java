
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenBrowsers {
  WebDriver driver;
	@BeforeTest	
	public void browsermethod()
	{
		 
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
	}
	
	@AfterTest
	public void browserclose()
	{
		driver.quit();
	}
	
	@Test
  public void OpenMavenRepo() {
		
		driver.get("https://mvnrepository.com/artifact/org.testng/testng/6.14.3");
  }
	@Test
	 public void OpenJSONviewer() {
			
			driver.get("http://jsonviewer.stack.hu/");
	  }
	@Test
	 public void OpenairtelCare() {
			
			driver.get("https://www.airtel.in/s/selfcare/");
	  }
		
}
