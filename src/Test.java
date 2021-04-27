import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium\\\\SeleniumPractice\\\\driver\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
//		String text = driver.findElement(By.className("course-desc")).getText();
//		System.out.println(text);
		
		WebElement w = driver.findElement(By.xpath("(//p[contains(text(),'Placement ')])[1]"));
		String text1 = w.getText();
		System.out.println(text1);

	}

}
