

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testng2 {

    WebDriver driver;

    @BeforeClass
    public void setup() {
    	
    	System.setProperty("org.openqa.selenium.chrome.ChromeDriver", "D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        //System.setProperty("org.openqa.selenium.chrome.ChromeDriver\", "D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
    }

    @Test
    public void pageTitleTest() {
        // Get the page title
        String title = driver.getTitle();

        // Verify the title
        Assert.assertEquals(title, "Expected Page Title", "Page title does not match!");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
