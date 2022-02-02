package TrainingSample;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakingScreenshot {
	
	public static void main(String[] args) throws IOException {
		 WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get("Https://facebook.com");
			
			TakesScreenshot ts= (TakesScreenshot)driver;
			
			File sourse = ts.getScreenshotAs(OutputType.FILE);
			
			File ex=new File ("src/test/java/facebook.png");
			FileUtils.copyFile(sourse, ex);
			driver.close();
			
			//FileUtils.copyFile(SrcFile, "src/test/java/facebook.png");
		//	FileUtils.copyFile(sourse, "")
	}

}
