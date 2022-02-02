package TrainingSample;

 
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import io.cucumber.messages.internal.com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse.File;

public class WriteDataToExcel {

//	public static void Write() throws IOException
//	{
//	File f = new File("C:\\Users\\shwethaksk\\eclipse-workspace\\Selenium\\Login.xlsx");
//	FileInputStream fis = new FileInputStream(f);
//	Workbook wb = new XSSFWorkbook(fis);
//	wb.createSheet("CreatedDatainExcel");
//	wb.getSheet("CreatedDatainExcel").createRow(0).createCell(0).setCellValue("e-mail");
//	wb.getSheet("CreatedDatainExcel").getRow(0).createCell(1).setCellValue("password");
//	wb.getSheet("CreatedDatainExcel").createRow(1).createCell(0).setCellValue("abcd@gmail.com");
//	wb.getSheet("CreatedDatainExcel").getRow(1).createCell(1).setCellValue("abcd@1234");
//	FileOutputStream fos = new FileOutputStream(f);
//	wb.write(fos); wb.close();
//	System.out.println("created");
//	}
//	public static void main(String[] args) throws IOException
//	{
//	Write();

 //}
}
