import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Failure {
    public static void main(String[] args) {
        // ✅ Disable Selenium Manager (optional but recommended here)
        System.setProperty("webdriver.manager", "false");

        // ✅ Set the path to your downloaded ChromeDriver executable
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\.cache\\selenium\\chromedriver\\win64\\135.0.7049.84\\chromedriver.exe");
        
        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        
        //System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe"); // <-- update this path!
//org.openqa.selenium.chrome.ChromeDriver
        
        //C:\Users\ADMIN\.cache\selenium\chromedriver\win64\135.0.7049.84>chromedriver.exe
        // ✅ Optional: ChromeOptions (if needed)
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        // ✅ Create WebDriver instance
        WebDriver driver = new ChromeDriver(options);

        // ✅ Test: Open a website
        driver.get("https://www.google.com");

        // ✅ Print the page title
        System.out.println("Page title is: " + driver.getTitle());

        // ✅ Quit browser
        driver.quit();
    }
}









