



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class linktest 
{
public static void main(String[] args) 
{
//configure your browser
	System.setProperty("webdriver.chrome.driver","E:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//System.setProperty("org.openqa.selenium.chrome.ChromeDriver ", "D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//Instantiate for webdrivers

WebDriver driver=new ChromeDriver();
//to maximize browser

driver.manage().window().maximize();
//to launch given url

driver.get("https://www.Google.com");
//to get the title of the webpage launched

WebElement element = driver.findElement(By.linkText("हिन्दी"));
element.click();



//*[@id="SIvCob"]/a[1]

//to quit the browser
//driver.quit();
}
}
