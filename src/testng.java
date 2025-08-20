

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testng {

    WebDriver driver;

    @BeforeClass
    public void setup() {
        System.setProperty("org.openqa.selenium.chrome.ChromeDriver", "D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
    }

    @Test
    public void searchTest() throws InterruptedException {
        // Locate the search box and type a query
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("selenium");

        // Submit the search form
        searchBox.submit();

        // Assert that the results page contains the search term "TestNG"
        Assert.assertTrue(driver.getTitle().contains("selenium"));
        Thread.sleep(3000);
    }

    @AfterClass
    public void tearDown() {
        //driver.quit();
    }
}