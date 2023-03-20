import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fam2306\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver(); 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys("nidhigautam");
        driver.findElement(By.name("pass")).sendKeys("12345");
        driver.findElement(By.name("login")).click();
        System.out.println(driver.findElement(By.cssSelector("div[class='_9ay7']")).getText());
        driver.findElement(By.linkText("Forgot password?")).click();
        driver.findElement(By.xpath("//a[@role='button'][1]")).click();
        driver.findElement(By.cssSelector("input[type='text']")).sendKeys("gautamnidhi791@gmail.com");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        System.out.println(driver.findElement(By.xpath("//div[@ class=\"_4-i2 _pig  _50f4\"]")).getText());
    

		
		
		
	
	
	
	
	
	}

}
