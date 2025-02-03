import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumOptions;

public class incognitochrome 
{
public static void main(String args[]) 
{
	
	ChromeOptions options=new ChromeOptions();
	
	options.addArguments("--incognito");
	
	
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.google.com");

}
}
