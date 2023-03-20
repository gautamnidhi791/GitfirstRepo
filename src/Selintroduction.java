import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selintroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// invoking browser 
		// chrome browser- chrome driver= method - close
		//firefox browser - firefox driver = method-close
		//safari browser - Safari driver = method-close
		//webdriver  close get 
		// webdriver methods + class methods 
		// chromedriver.exe-> chromedriver 
		//webdriver.chrome.driver>value of that path 
		
		// Selenium manager(beta phase)
		
		
		
		
		//Firefox lunch 
		//geckodriver
		// webdriver.gecko.driver
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\fam2306\\Downloads\\geckodriver-v0.32.0-win32.zip\\geckodriver.exe");
	   //	WebDriver driver1 = new FirefoxDriver();
		
		//System.setProperty("webdriver.edage.driver", "C:\\Users\\fam2306\\Downloads\\chromedriver_win32\\edagedriver.exe");
		//WebDriver driver = new edageDriver(); 
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\fam2306\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.close();
        //driver.quit();
		
	}

}
