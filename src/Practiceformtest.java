


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Practiceformtest {
    @SuppressWarnings("deprecation")
	public static void main(String[] args) {
        // Set the path to your WebDriver (Make sure you have the correct WebDriver)
    	System.setProperty("webdriver.chrome.driver","E:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    	//System.setProperty("org.openqa.selenium.chrome.ChromeDriver", "D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    	//System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Open the practice page
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");

        // 1. Fill the "First Name" and "Last Name" text fields
        WebElement firstName = driver.findElement(By.name("name"));
        firstName.sendKeys("John");

        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("Dholeabhishek9@gmail.com");

        // 2. Select the "Male" radio button
        WebElement maleRadioBtn = driver.findElement(By.xpath("//input[@id='gender']"));
        maleRadioBtn.click();
        
        
        WebElement MoNo = driver.findElement(By.id("mobile"));
        MoNo.sendKeys("8698454293");
        
        
        
        
        WebElement subject = driver.findElement(By.id("subjects"));
        subject.sendKeys("ABC,DEF,FFF");
        
        
        

        // 3. Check "Manual Tester" and "Automation Tester" checkboxes
		
		  WebElement manualTesterCheckbox =
		  driver.findElement(By.xpath("//input[@id='hobbies']"));
		  manualTesterCheckbox.click();
		  
		 /* WebElement Checkbox =
				  driver.findElement(By.xpath("//input[@name='dob']"));
				  Checkbox.click();*/
				  
				  
				  
Select continentSelect = new Select(driver.findElement(By.name("state")));
				        continentSelect.selectByVisibleText("Uttar Pradesh");

Select continentSelect1 = new Select(driver.findElement(By.name("city")));
                        continentSelect1.selectByVisibleText("Meerut");
				        

      /*  // 4. Select "Asia" from the continents drop-down
        Select continentSelect = new Select(driver.findElement(By.id("continents")));
        continentSelect.selectByVisibleText("Asia");

        // 5. Select "Browser Commands" and "Switch Commands" from Selenium Commands drop-down
        Select seleniumCommands = new Select(driver.findElement(By.id("selenium_commands")));
        seleniumCommands.selectByVisibleText("Browser Commands");
        seleniumCommands.selectByVisibleText("Switch Commands");*/

        // 6. Upload a file (replace with your file path)
/*        WebElement fileUpload = driver.findElement(By.id("picture"));
        fileUpload.sendKeys("‪C:\\Users\\ADMIN\\Desktop\\abc.jpg");
*/
                        WebElement CurrentAddress = driver.findElement(By.id("picture"));
                        CurrentAddress.sendKeys("C:\\Users\\ADMIN\\Desktop\\abc.jpg"); 
                        
                        
                        // 7. Click the "Submit" button
       
        WebElement submitButton =
      		  driver.findElement(By.xpath("//input[@id='practiceForm']"));
        submitButton.click();

        // Optional: Wait for a few seconds to observe the result
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close the browser
        driver.quit();
    }
}
//*[@id="practiceForm"]/div[11]/input

