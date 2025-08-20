
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
public class Abhi 
{
@SuppressWarnings("deprecation")
public static void main(String[] args) throws IOException 
{
//configure your browser
	
	System.setProperty("webdriver.manager", "false");

	//WebDriver driver = new ChromeDriver(options);

	System.setProperty("webdriver.chrome.driver","E:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	//System.setProperty("org.openqa.selenium.chrome.ChromeDriver ", "E:\\chromedriver-win32\\chromedriver_win32\\chromedriver.exe");
	//System.setProperty("org.openqa.selenium.chrome.ChromeDriver" , "C:\Users\ADMIN\.cache\selenium\chromedriver\win64\133.0.6943.141\\chromedriver.exe");
	//Instantiate for webdrivers

//System.setProperty("webdriver.manager", "false");

WebDriver driver=(WebDriver) new ChromeDriver();
//to maximize browser

driver.manage().window().maximize();
//to launch given url

driver.get("https://www.facebook.com");
//to get the title of the webpage launched
String title = driver.getTitle();
System.out.println(title);
//to get the url of the current page
String url = driver.getCurrentUrl();
System.out.println(url);
//to quit the browser

File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
FileUtils.copyFile(scrFile, new File("E:\\testScreenShot.jpg")); 



driver.quit();
}
}