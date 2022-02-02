package TrainingSample;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {


	public static void main(String[] args) throws IOException { 
			
			  WebDriverManager.chromedriver().setup();
			  WebDriver driver=new ChromeDriver();
			  driver.manage().window().maximize();
			  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			  driver.get("https://jqueryui.com/droppable/");
			  driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
			  String text=driver.findElement(By.xpath("//*[@id='draggable']/p")).getText();
			  
			  System.out.println(text); WebElement
			  drag=driver.findElement(By.xpath("//*[@id='draggable']/p")); WebElement
			  drop=driver.findElement(By.xpath("//*[@id='droppable']")); Actions action=new
			  Actions(driver); action.dragAndDrop(drag, drop).build().perform(); 
			  System.out.println("dropped");
			  
			  //xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
			
			driver.get("https://demo.guru99.com/test/drag_drop.html");
			WebElement src = driver.findElement(By.xpath("//body/section[@id='g-container-main']/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]"));
			WebElement dest = driver.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/ol[1]/li[1]"));
			Actions act = new Actions(driver);
			act.dragAndDrop(src, dest).build().perform();
			System.out.println("dropped");
			driver.close();
			
	}
	
}
