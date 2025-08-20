
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class One {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	//System.setProperty("org.openqa.selenium.chrome.ChromeDriver", "E:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

WebDriver driver=new ChromeDriver();
driver.get("https://www.saucedemo.com/");

//to find locator of the user name
WebElement txtUserName = driver.findElement(By.id("user-name"));
//to pass values in the text box
txtUserName.sendKeys("standard_user");
//to find locator of the password field
WebElement txtPassword = driver.findElement(By.name("password"));
txtPassword.sendKeys("secret_sauce");
//to find locator of login button
//WebElement txt = driver.findElement(By.className("inputtext _55r1 _6luy"));



WebElement button = driver.findElement(By.name("login-button"));
//to click button
button.click();

try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

WebElement button1 = driver.findElement(By.id("react-burger-menu-btn"));
//to click button
button1.click();



/*WebElement button2 = driver.findElement(By.id("logout_sidebar_link"));
//to click button
button2.click();*/

//driver.findElement(By.linkText("Logout")).click();


driver.quit(); 

}

}