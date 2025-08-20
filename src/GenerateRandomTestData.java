/*

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenerateRandomTestData {

    public static void main(String[] args) {
        // Set up WebDriver
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/en-gb?route=account/register");

        // Generate random test data
        String firstName = randomString(8); // Adjust length as needed
        String lastName = randomString(8); // Adjust length as needed
        String email = randomString(10) + "@gmail.com"; // Adjust length as needed
        String password = randomString(8) + "123"; // Adjust length as needed

        // Fill out the registration form
        driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys(firstName);
        driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys(lastName);
        driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
        driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(password);
        //driver.findElement(By.xpath("//input[@name='agree']")).click();
        //driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();
      //button[normalize-space()='Continue']
      //input[@name='agree']
        
        WebElement agreeCheckbox = driver.findElement(By.xpath("//input[@type='checkbox' and @name='agree']"));
        agreeCheckbox.click();  // Click on the checkbox to agree

        // Locate the 'Continue' button
        WebElement continueButton = driver.findElement(By.xpath("//input[@type='submit' and @value='Continue']"));
        continueButton.click();  // Click the Continue button
        
        
        
        
        // Close the browser
        driver.quit();
    }

    // Method to generate a random alphanumeric string of specified length
    public static String randomString(int length) {
        return RandomStringUtils.randomAlphanumeric(length);
    }
}
*/


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class GenerateRandomTestData {
    public static void main(String[] args) {
        // Set up WebDriver (Update the path to chromedriver)
        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
    	System.setProperty("webdriver.chrome.driver","E:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    	//System.setProperty("org.openqa.selenium.chrome.ChromeDriver", "D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        try {
            // Open the OpenCart Registration Page
            driver.get("https://demo.opencart.com/en-gb?route=account/register");

            // Maximize the browser window
            driver.manage().window().maximize();

            // Set implicit wait
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            // Fill in registration details
            driver.findElement(By.id("input-firstname")).sendKeys("John");
            driver.findElement(By.id("input-lastname")).sendKeys("Doe");
            driver.findElement(By.id("input-email")).sendKeys("johndoe123@example.com");
            driver.findElement(By.id("input-password")).sendKeys("Test@1234");

            // Select the 'Agree' checkbox
            WebElement agreeCheckbox = driver.findElement(By.xpath("//input[@type='checkbox' and @name='agree']"));
            agreeCheckbox.click();

            // Click the 'Continue' button
            WebElement continueButton = driver.findElement(By.xpath("//input[@type='submit' and @value='Continue']"));
            continueButton.click();

            // Wait and validate (you can add assertions here)

            // Print success message
            System.out.println("Registration form submitted successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}


