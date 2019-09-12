import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.ResultPage;

import java.util.concurrent.TimeUnit;

public class SearchTests {

    private WebDriver driver;
    private String baseUrl = "http://google.com";

    @BeforeSuite
    public void beforeSuite(){
        System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void SearchingTest(){
        MainPage mainPage = new MainPage(driver);
        ResultPage resultPage = new ResultPage(driver);

        driver.navigate().to(baseUrl);
        mainPage.setQuery("Global Logic");
        mainPage.search();
        resultPage.navigateToPage(4);
        resultPage.clickResultLinkByNumber(5);
    }

    @AfterSuite
    public void afterSuite(){
        driver.quit();
    }

}
