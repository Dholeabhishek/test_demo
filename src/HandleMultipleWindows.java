
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;


public class HandleMultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        
        // Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        // Open the main URL
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        // Click the link that opens a new window
        driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();

        // Get the current window handle
        String mainWindowHandle = driver.getWindowHandle();
        
        // Get all window handles
        Set<String> windowHandles = driver.getWindowHandles();

        // Switch to the new window
        for (String winid : windowHandles) {
            String title = driver.switchTo().window(winid).getTitle();
            // Print the title of the new window
            System.out.println(title);

            // Close the window if it matches the expected title
            if (title.equals("Human Resources Management Software | OrangeHRM") || title.equals("some other title")) {
                driver.close();
            }
        }
       // Switch back to the main window
        driver.switchTo().window(mainWindowHandle);
        
        Thread.sleep(3000);
        // Close the main window
        driver.quit();

	}

}
