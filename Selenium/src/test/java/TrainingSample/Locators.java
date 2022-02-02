package TrainingSample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	
public static void main(String[] args) throws InterruptedException {
	System.err.println("Open OrangeHRM Demo page");
	 WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	driver.findElement(By.xpath("//div[@id = 'divLogo']")); 
	Thread.sleep(1000);	
	System.out.println("Logo Present on screen");
	
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");	
	System.out.println("User name enetered");	 
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.findElement(By.name("txtPassword")).sendKeys("admin123");	
	System.out.println("Password enetered"); 
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.findElement(By.className("button")).click();
	System.out.println("Login Button clicked");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.quit(); 
 
 }
	
}


 
