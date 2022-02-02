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
import org.openqa.selenium.firefox.FirefoxDriver;

public class DataDrivenExcel2 {
	
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
	FirefoxDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("http://facebook.com");
	driver.findElement(By.id("email")).sendKeys(un);
	driver.findElement(By.id("pass")).sendKeys(pwd);
	driver.findElement(By.id("u_0_w")).click();
	driver.findElement(By.id("userNavigationLabel")).click();
	driver.findElementByXPath(".//*[@id='u_f_1']/div/div/div[1]/div/div/ul/li[12]/a/span/span");
	driver.close();
	}
	}
}
