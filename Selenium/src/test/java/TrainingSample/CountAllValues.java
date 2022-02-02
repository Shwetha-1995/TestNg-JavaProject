package TrainingSample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CountAllValues {
	public static void main(String[] args) {
		allvalues();
	}

	public static void allvalues()
	{
		WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  driver.get("https://demo.guru99.com/test/newtours/register.php");
	  driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	Select s = new Select(driver.findElement(By.xpath("//select[@name='country']")));
	List<WebElement> op = s.getOptions();
	int size = op.size();
	for(int i =0; i<size ; i++)
	{
	String list = op.get(i).getText();
	System.out.println(list);
	}
	driver.quit();
	}
	
	
}
