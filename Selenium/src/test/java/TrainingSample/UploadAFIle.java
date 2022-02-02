package TrainingSample;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadAFIle {
	
	public static void main(String[] args) 
	{ 
		upload();
	}
		private static void upload() {
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\shwethaksk\\chromedriver_win32\\chromedriver.exe");
			  WebDriver driver=new ChromeDriver();
			  driver.manage().window().maximize();
			  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			  driver.get("https://demo.guru99.com/test/upload/");
		WebElement up = driver.findElement(By.xpath("//input[@type='file']"));
		up.sendKeys("C:\\Users\\shwethaksk\\eclipse-workspace\\Selenium\\Upload.java");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//button[@type='button']")).click();
		driver.close();
		}
		}
//		private static void upload() {
//			{
//				 WebDriverManager.firefoxdriver().setup();
//				  WebDriver driver=new FirefoxDriver();
//				  driver.manage().window().maximize();
//				  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//				  driver.get("https://demo.guru99.com/test/upload/");
//			WebElement up = driver.findElement(By.xpath("//input[@type='file']"));
//			up.sendKeys("C:\\Users\\shwethaksk\\eclipse-workspace\\Selenium\\Upload.java");
//			driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//			driver.findElement(By.xpath("//button[@type='button']")).click();
//		//	driver.close();
			//}
			//}
		
	
}
