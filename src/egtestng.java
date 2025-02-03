import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class egtestng {

    WebDriver driver;

    @BeforeClass
    public void setup() {
    	System.setProperty("org.openqa.selenium.chrome.ChromeDriver", "D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    	//System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://example.com");
    }

    // Test case 1: Verify the page title
    @Test
    public void verifyPageTitle() {
        String expectedTitle = "Example Domain";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page title does not match!");
    }

    // Test case 2: Verify an element is present on the page
    @Test
    public void verifyElementIsPresent() {
        WebElement element = driver.findElement(By.tagName("h1"));
        Assert.assertTrue(element.isDisplayed(), "Element not found!");
    }

    // Test case 3: Verify clicking a link redirects to the correct page
    @Test
    public void verifyLinkRedirection() {
        WebElement link = driver.findElement(By.xpath("//a[text()='More information...']"));
        link.click();
        String expectedUrl = "https://www.iana.org/domains/example";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl, "URL redirection failed!");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
