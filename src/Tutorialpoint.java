
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tutorialpoint {
    public static void main(String[] args) {
        // Set up the ChromeDriver path (replace with your actual ChromeDriver path)
        System.setProperty("org.openqa.selenium.chrome.ChromeDriver ", "D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        //org.openqa.selenium.chrome.ChromeDriver ", "D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe
        // Create a new instance of ChromeDriver (opens the Chrome browser)
        WebDriver driver = new ChromeDriver();
        
        try {
            // 1. Navigate to a website with JavaScript alerts (use a testing website with alerts)
            driver.get("https://the-internet.herokuapp.com/javascript_alerts");

            // 2. Maximize the browser window
            driver.manage().window().maximize();
            
            // Handling Simple Alert
            // ------------------------------------
            // Locate and click the button that triggers a simple alert
            driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
            
            // Switch to the alert
            Alert simpleAlert = driver.switchTo().alert();
            
            // Get the text of the alert
            System.out.println("Simple Alert text: " + simpleAlert.getText());
            
            // Accept the alert (click OK)
            simpleAlert.accept();

            // Handling Confirmation Alert (OK/Cancel)
            // ------------------------------------
            // Locate and click the button that triggers a confirmation alert
            driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
            
            // Switch to the confirmation alert
            Alert confirmationAlert = driver.switchTo().alert();
            
            // Get the text of the confirmation alert
            System.out.println("Confirmation Alert text: " + confirmationAlert.getText());
            
            // Accept the alert (click OK)
            confirmationAlert.accept();
            
            // If you want to click Cancel instead, use: confirmationAlert.dismiss();
            
            // Handling Prompt Alert
            // ------------------------------------
            // Locate and click the button that triggers a prompt alert
            driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
            
            // Switch to the prompt alert
            Alert promptAlert = driver.switchTo().alert();
            
            // Get the text of the prompt alert
            System.out.println("Prompt Alert text: " + promptAlert.getText());
            
            // Send text to the prompt
            promptAlert.sendKeys("This is a test prompt input");
            
            // Accept the alert (click OK)
            promptAlert.accept();
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
           // driver.quit();
        }
    }
}






