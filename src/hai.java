

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class hai {
public static void main(String[] args) {
//System.setProperty("org.openqa.selenium.chrome.ChromeDriver", "D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
System.setProperty("webdriver.chrome.driver","E:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.instagram.com/");

//to find locator of the user name
WebElement txtUserName = driver.findElement(By.id("email"));
//to pass values in the text box
txtUserName.sendKeys("Dholeabhishek16@gmail.com");
//to find locator of the password field
WebElement txtPassword = driver.findElement(By.name("pass"));
txtPassword.sendKeys("123456789");
//to find locator of login button
//WebElement txt = driver.findElement(By.className("inputtext _55r1 _6luy"));



WebElement button = driver.findElement(By.name("login"));
//to click button
button.click();




}

}