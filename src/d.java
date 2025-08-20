



import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//public class handlingCheckBoxes 

public class d 
{

    public static void main(String[] args) throws InterruptedException {

        // Initialize a new Chrome browser instance
        
        System.setProperty("webdriver.chrome.driver","E:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        // Navigate to the specified URL
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://testautomationpractice.blogspot.com/");

        // Set an implicit wait timeout
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Maximize the browser window
           driver.manage().window().maximize();

        // Find all checkbox elements with the specified class and type
          List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));

         // Loop through the checkboxes and click those with odd indices
            for (int i = 0; i < checkboxes.size(); i++) {
         // Check if the index (0-based) is odd by using the modulo operation
                if ((i + 1) % 2 == 1) {// Adding 1 to make it 1-based index
                    WebElement checkbox = checkboxes.get(i);
                     checkbox.click();
                    
                }
            }

            // Pause for a while to observe the results
            Thread.sleep(5000);
      
            
            driver.quit();
       
    }
}