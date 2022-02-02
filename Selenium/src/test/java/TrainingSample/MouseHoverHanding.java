package TrainingSample;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHoverHanding {
	
	public static void main(String[] args) throws IOException {
		 WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get("https://opensource-demo.orangehrmlive.com");
			driver.findElement(By.id("txtUsername")).sendKeys("admin");
			driver.findElement(By.id("txtPassword")).sendKeys("admin123");
			driver.findElement(By.name("Submit")).click();
			driver.findElement(By.id("menu_admin_viewAdminModule")).click();
			
			WebElement	jobs =driver.findElement(By.id("menu_admin_Job"));
			WebElement	jobsCategory =driver.findElement(By.id("menu_admin_jobCategory"));
			
			Actions ac = new Actions(driver);
			ac.moveToElement(jobs).perform();
			ac.moveToElement(jobsCategory).click().build().perform();
			
			TakesScreenshot ts= (TakesScreenshot)driver;
			
			File sourse = ts.getScreenshotAs(OutputType.FILE);
			
			File ex=new File ("src/test/java/facebook.png");
			FileUtils.copyFile(sourse, ex);
			driver.close();
			 
			
			
	}
	
}
			
			