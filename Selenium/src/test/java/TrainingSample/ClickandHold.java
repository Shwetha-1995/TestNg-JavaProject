package TrainingSample;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickandHold {

	public static void main(String[] args) throws IOException {
		 WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			
			  driver.manage().window().maximize();
			  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			  driver.get("https://jqueryui.com/selectable/");
			  driver.switchTo().frame(driver.findElement(By.className("demo-frame"))); 
			  
			  WebElement item1 =driver.findElement(By.xpath("//li[@class = 'ui-widget-content ui-selectee'][1]")); 
			  WebElement item2 =driver.findElement(By.xpath("//li[@class = 'ui-widget-content ui-selectee'][2]"));
			  WebElement item3 =driver.findElement(By.xpath("//li[@class = 'ui-widget-content ui-selectee'][3]"));
			  WebElement item4 =driver.findElement(By.xpath("//li[@class = 'ui-widget-content ui-selectee'][4]"));
			  
			  Actions ac = new Actions(driver);
			  ac.clickAndHold(item1).clickAndHold(item2).clickAndHold(item3).clickAndHold(item4).build().perform();
			  
			  driver.close(); 
			  
			  //xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
			
			  driver.manage().window().maximize(); driver.get("https://jqueryui.com/");
			  
			  driver.findElement(By.xpath("//a[contains(text(),'Selectable')]")).click();
			  driver.switchTo().frame(driver.findElement(By.className("demo-frame"))); 
			  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); WebElement i1
			  = driver.findElement(By.
			  xpath("//li[@class = 'ui-widget-content ui-selectee'][1]")); WebElement i2 =
			  driver.findElement(By.xpath("//li[text()='Item 2']")); WebElement i3 =
			  driver.findElement(By.xpath("//li[text()='Item 3']")); WebElement i5 =
			  driver.findElement(By.xpath("//li[text()='Item 5']")); WebElement i6 =
			  driver.findElement(By.xpath("//li[text()='Item 6']")); WebElement i7 =
			  driver.findElement(By.xpath("//li[text()='Item 7']")); Actions act = new
			  Actions(driver); act.moveToElement(i1).clickAndHold().build().perform(); //
			  act.moveToElement(i1).clickAndHold().release().build().perform();
			  driver.close();		
			
			
	}
}
