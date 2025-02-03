

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
        driver.findElement(By.xpath("//input[@name='agree']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();

        
        // Close the browser
        driver.quit();
    }

    // Method to generate a random alphanumeric string of specified length
    public static String randomString(int length) {
        return RandomStringUtils.randomAlphanumeric(length);
    }
}