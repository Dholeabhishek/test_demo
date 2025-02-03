

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TPAuto {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

        System.setProperty("org.openqa.selenium.chrome.ChromeDriver ", "D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        //org.openqa.selenium.chrome.ChromeDriver ", "D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe
        // Create a new instance of ChromeDriver (opens the Chrome browser)
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://testpages.eviltester.com/styled/alerts/alert-test.html");

        // 2. Maximize the browser window
        driver.manage().window().maximize();
        
        // Handling Simple Alert
        // ------------------------------------
        // Locate and click the button that triggers a simple alert
       // driver.findElement(By.xpath("//button[value()=Show alert box']")).click();
        
        WebElement button = driver.findElement(By.id("confirmexample"));
      //to click button
      button.click();
        
        // Switch to the alert
        //Alert simpleAlert = driver.switchTo().alert();
        Alert confirmationAlert = driver.switchTo().alert();
        confirmationAlert.accept();
        
        
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //Scroll down till the bottom of the page
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        
        // Get the text of the alert
        //System.out.println("Simple Alert text: " + simpleAlert.getText());
        
        // Accept the alert (click OK)
        //simpleAlert.accept();

        // Handling Confirmation Alert (OK/Cancel)
        // ------------------------------------
        // Locate and click the button that triggers a confirmation alert
        
        
                

		
		
	}

}
