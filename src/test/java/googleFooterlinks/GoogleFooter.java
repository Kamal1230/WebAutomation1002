package googleFooterlinks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleFooter {

	
		
		    public static void main(String[] args) throws Throwable {
		        System.setProperty("webdriver.chrome.driver","C:\\Users\\kamal\\Utilities\\chromedriver.exe");
		        
		        WebDriver driver = new ChromeDriver();  // You can use any other web browser.
		        driver.get("https://www.google.com");
		        
		        
		        driver.findElement(By.xpath("//*[@id=\"gb_70\"]"));
		        driver.manage().window().maximize();
		        driver.get("https://accounts.google.com/ServiceLogin?");
		        driver.findElement(By.id("identifierId")).sendKeys("kamal@gmail.com");
		        driver.findElement(By.id("identifierNext")).click();
		        driver.findElement(By.xpath("//input[@aria-label='Enter your password' and @name='password']")).sendKeys("password656");
		     
		        
		        Thread.sleep(2000);
		        driver.quit();
		    }
		}
