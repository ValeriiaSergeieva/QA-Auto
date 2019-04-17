import org.junit.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;



public class VerifyLanguageChoose {


    @Test
    public void checkLanguageSwitch(){
        WebDriver driver= BrowserFactory.startBrowser("firefox","https://www.wikipedia.org/");

        MyPage startPage = PageFactory.initElements(driver,MyPage.class);

        startPage.chooseLanguage("english");

        driver.quit();
    }
}
