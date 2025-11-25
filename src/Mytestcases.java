import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Mytestcases {
    String Mywebsit = "https://my.hakeem.jo/index.php/ar";
    WebDriver driver = new ChromeDriver();
    String username = "standard_user";
    String pas = "secret_sauce";
	@BeforeTest
	public void  mysetup () {
	driver.get(Mywebsit);	
		
	}
	
	
	
	
	
	@Test	
    public void  mytest () {
	driver.findElement(By.id("user-name")).sendKeys(username);	
	driver.findElement(By.id("password")).sendKeys(pas);
	driver.findElement(By.id("login-button")).click();
	
	
	}
	
	
	
	
	@AfterTest
    public void  aftermytest () {
		
		
	}
	
}
