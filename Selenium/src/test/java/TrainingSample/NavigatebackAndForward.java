package TrainingSample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatebackAndForward {

	public static void url() throws Exception
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\gnaneswarns\\eclipse-workspace\\Training\\Driver\\chromedriver.exe");
	WebDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://www.guru99.com/drag-drop-selenium.html");
	String title = d.getTitle(); System.out.println(title);
	d.navigate().to("https://www.scientecheasy.com/2020/01/click-and-hold-in-selenium.html/");
	d.navigate().forward(); d.navigate().back(); Thread.sleep(1900); d.navigate().refresh();
	if(title.equalsIgnoreCase("How to Drag and Drop in Selenium WebDriver (EXAMPLE)"))
	{
	System.out.println("Valid");
	}
	else
	{
	System.out.println("Invalid");
	}
	}
}
