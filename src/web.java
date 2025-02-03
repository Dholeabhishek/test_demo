

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class web 
{
public static void main(String[] args) throws InterruptedException 
{
//configure your browser

System.setProperty("org.openqa.selenium.chrome.ChromeDriver ", "D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//Instantiate for webdrivers

WebDriver driver=new ChromeDriver();
//to maximize browser

driver.manage().window().maximize();
//to launch given url

driver.get("https://testpages.eviltester.com/styled/challenges/hard-selectors.html");
//to get the title of the webpage launched

/*String title = driver.getTitle();
System.out.println(title);
//to get the url of the current page
String url = driver.getCurrentUrl();
System.out.println(url);
//to quit the browser
//driver.quit();*/

WebElement button = driver.findElement(By.id("select.me.by.id"));
//to click button
button.click();

Thread.sleep(10000);

driver.quit();

}
}