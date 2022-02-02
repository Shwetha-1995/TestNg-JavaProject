package TrainingSample;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingFrames {

	public static void main(String[] args) throws IOException {
		 WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get("https://jqueryui.com/droppable/");
			driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
			
			String getText = driver.findElement(By.xpath("//div[@id ='droppable']/p")).getText();
			System.out.println(" Get Text value : "+ getText);
		 
			driver.close();
				
	}
}
