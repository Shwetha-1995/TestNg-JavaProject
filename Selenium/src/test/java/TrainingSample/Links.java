package TrainingSample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Links {

	public static void main(String[] args) {
		links();
	}
	public static void links()
	{
	 WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get("https://www.flipkart.com/");
	driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	List<WebElement> links = driver.findElements(By.tagName("a"));
	System.out.println("The number of links is " + links.size());
	driver.close();
	}
}
