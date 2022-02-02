package TrainingSample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrivenExcel {
	
public static void main(String[] args) throws IOException {
	
	FileInputStream fil = new FileInputStream(new File("C:\\Users\\shwethaksk\\eclipse-workspace\\Selenium\\Login.xlsx"));
	XSSFWorkbook workbook = new XSSFWorkbook(fil);
	XSSFSheet sheet=workbook.getSheet("data");
	int count=sheet.getLastRowNum();
	System.out.println(count);
	for (int i = 1; i<=count; i++) {
	XSSFRow row = sheet.getRow(i);
	XSSFCell cell = row.getCell(0);
	String un= cell.getStringCellValue();
	XSSFCell cell1 = row.getCell(1);
	String pwd = cell.getStringCellValue();
	 WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get("http://facebook.com");
	driver.findElement(By.id("email")).sendKeys(un);
	driver.findElement(By.id("pass")).sendKeys(pwd);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//button[@type = 'submit']")).click();
	 driver.close();

	}
	}
}
