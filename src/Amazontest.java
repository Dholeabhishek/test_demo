


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Amazontest 
{

	public static void main(String[] args) throws InterruptedException  
	{
	
    //WebDriver driver;
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        //System.setProperty("org.openqa.selenium.chrome.ChromeDriver", "E:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        //E:\chromedriver-win64\chromedriver-win64
        WebDriver driver=(WebDriver) new ChromeDriver();
        
        driver.manage().window().maximize();
        
        //driver.get("https://www.google.com");
    
        driver.get("https://www.amazon.in/?tag=googhydrabk-21&ref_=pd_mn_ABKror1112");
        


        // Locate the search box and type a query
        //WebElement searchBox = driver.findElement(By.name("q"));
        
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        
        searchBox.sendKeys("iPhone 13");

        // Submit the search form
        searchBox.submit();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)", "");
        
        
        WebElement button = driver.findElement(By.id("a-autoid-1-announce"));
        //to click button
        button.click(); 
        
        //WebElement link = driver.findElement(By.linkText("a-size-mini a-link-normal s-underline-text s-underline-link-text s-link-style"));

     // click on the hyperlink
     //link.click();
        Thread.sleep(2000);
        
        js.executeScript("window.scrollBy(0,-250)");
        
        WebElement button1 = driver.findElement(By.id("nav-cart-text-container"));
        //to click button
        button1.click(); 
        
        
        // Assert that the results page contains the search term "TestNG"
//        Assert.assertTrue(driver.getTitle().contains("TestNG"));

        
        
       // driver.findElement(By.xpath("//link[text()='See more like this']")).click();
        
        
       //Thread.sleep(2700);
        driver.quit();
    
}
}