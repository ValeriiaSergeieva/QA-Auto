import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MyPage {
    WebDriver driver;

    public MyPage(WebDriver driver){
    this.driver = driver;
    }

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/a/strong")
    @CacheLookup
    WebElement english;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[1]/a/strong")
    @CacheLookup
    WebElement russian;

    @FindBy(how = How.XPATH,using = "/html/body/div[1]/div[3]/a/strong")
    @CacheLookup
    WebElement spanish;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[4]/a/strong")
    @CacheLookup
    WebElement japanese;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[5]/a/strong")
    @CacheLookup
    WebElement german;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[6]/a/strong")
    @CacheLookup
    WebElement french;

    @FindBy(how = How.XPATH,using = "/html/body/div[1]/div[7]/a/strong")
    @CacheLookup
    WebElement italian;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[8]/a/strong")
    @CacheLookup
    WebElement chinese;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[9]/a/strong")
    @CacheLookup
    WebElement portuguese;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[10]/a/strong")
    @CacheLookup
    WebElement polish;

    @FindBy(how = How.XPATH, using = "//*[@id=\"searchInput\"]")
    @CacheLookup
    WebElement search;

    @FindBy(how = How.XPATH, using = "//*[@id=\"searchLanguage\"]")
    @CacheLookup
    WebElement searchLanguage;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/form/fieldset/button/i")
    @CacheLookup
    WebElement buttonSearch;

    public void chooseLanguage(String language){
        if(language.equalsIgnoreCase("english")){
            english.click();
        }else if(language.equalsIgnoreCase("russian")){
            russian.click();
        }else if(language.equalsIgnoreCase("spanish")){
            spanish.click();
        }else if(language.equalsIgnoreCase("japanese")){
            japanese.click();
        }else if(language.equalsIgnoreCase("german")){
            german.click();
        }else if(language.equalsIgnoreCase("french")){
            french.click();
        }else if(language.equalsIgnoreCase("italian")){
            italian.click();
        }else if(language.equalsIgnoreCase("chinese")){
            chinese.click();
        }else if(language.equalsIgnoreCase("portuguese")){
            portuguese.click();
        }else if(language.equalsIgnoreCase("polish")){
            polish.click();
        }
    }
}
