import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BrowserFactory {
    static WebDriver driver;

    public static WebDriver startBrowser(String browserName, String url){
        if(browserName.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver", "F:\\EpamJava\\Libraries\\MozilaGeko\\geckodriver.exe");
            driver = new FirefoxDriver();
        }else if(browserName.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","F:\\EpamJava\\Libraries\\Chrome\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
        driver.get(url);
        return driver;
    }

}
