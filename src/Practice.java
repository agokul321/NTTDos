

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\SeleniumPractice\\driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.amazon.in");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//select[@name='url']")).click();
	
	Actions click = new Actions(driver);
	
	WebElement option = driver.findElement(By.xpath("//option[@value='search-alias=computers']"));
	
	click.moveToElement(option).click().perform();
	
	System.out.println("gokul");
	System.out.println("ojsdnajn");
	System.out.println("ojn");
	
	
	
	
	}

}
