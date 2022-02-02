package TrainingSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenOragneHRMDemoPage {

	
public static void main(String[] args) throws InterruptedException {
	System.err.println("Open OrangeHRM Demo page");
	 WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.findElement(By.xpath("//div[@id = 'divLogo']"));
	Thread.sleep(1000);	
	System.out.println("Logo Present on screen");
	driver.quit(); 
	//https://opensource-demo.orangehrmlive.com/
}
	
}


 
