



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMTest {
public static void main(String[] args) {
System.setProperty("org.openqa.selenium.chrome.ChromeDriver", "D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

WebDriver driver=new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

//to find locator of the user name

driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");

//find password and enter invalid password 
driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");//wrong password

//login button click
driver.findElement(By.xpath("//button[@type='submit']")).submit();

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




//driver.quit(); 

}

}