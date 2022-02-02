package TrainingSample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dataProviderTestNGOrangeHRM {

	 WebDriver driver;

	    @BeforeMethod	
	public void Launchapp() {
	    WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    driver.get("https://en-gb.facebook.com/");
	}

	@Test(dataProvider="facebooklogin")
	public void Logintofacebook(String username,String password) {
	driver.findElement(By.id("email")).sendKeys(username);
	driver.findElement(By.id("pass")).sendKeys(password);
	driver.findElement(By.name("login")).click();
	 
	}
	 
	@AfterMethod
	public void teardown() {
	    driver.quit();
	    // TODO Auto-generated method stub
	 
	}
	@DataProvider(name="facebooklogin")
	public Object[][] passData() {
	    Object[][] data=new Object[3][2];
	    data[0][0]="shobiya";
	    data[0][1]="password";
	    data[1][0]="joshi";
	    data[1][1]="franklin";
	    data[2][0]="seela";
	    data[2][1]="hemima";
	    return data;
	 

	}
	}


