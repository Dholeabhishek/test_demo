

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demologin {
public static void main(String[] args) {
System.setProperty("org.openqa.selenium.chrome.ChromeDriver", "D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

WebDriver driver=new ChromeDriver();
driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

//to find locator of the user name
WebElement txtUserName = driver.findElement(By.id("Email"));
//to pass values in the text box
//txtUserName.sendKeys("admin@yourstore.com");
//to find locator of the password field
WebElement txtPassword = driver.findElement(By.name("Password"));
//txtPassword.sendKeys("admin");
//to find locator of login button
//WebElement txt = driver.findElement(By.className("inputtext _55r1 _6luy"));


driver.findElement(By.xpath("//button[text()='Log in']")).click();

//WebElement button = driver.findElement(By.id("main"));

//driver.findElement(By.className("button-1 login-button")).click();
//to click button
//button.click();

//*[@id="main"]/div/div/div/div[2]/div[1]/div/form/div[3]/button

try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}





/*WebElement button2 = driver.findElement(By.id("logout_sidebar_link"));
//to click button
button2.click();*/




driver.quit(); 

}

}