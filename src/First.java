import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;  
  
public class First {  
  
    public static void main(String[] args) {  
        
    // declaration and instantiation of objects/variables  
    System.setProperty("org.openqa.selenium.chrome.ChromeDriver ", "D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");  
    WebDriver driver=new ChromeDriver();  
      
// Launch website  
    driver.navigate().to("http://www.google.com/");  
          
    // Click on the search text box and send value  
    driver.findElement(By.id("APjFqb")).sendKeys("javatpoint tutorials");  
   // driver.findElement(By.cssSelector("#search > input:nth-child(2)")).sendKeys("...");    
    // Click on the search button  
    driver.findElement(By.name("Google Search")).click();  
    //driver.findElement(By.id("APjFqb")).click();
   
    //WebElement button = driver.findElement(By.name("btnK"));
  //to click button
  //button.click();
    
    //driver.quit();  to quit the browser 
    
    
    }  
  
}  