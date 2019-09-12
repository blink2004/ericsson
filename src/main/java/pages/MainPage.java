package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {

    private WebDriver driver;
    private By inputSearch = By.cssSelector("input[name='q']");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setQuery(String query){
        driver.findElement(inputSearch).sendKeys(query);
    }

    public void search(){
        driver.findElement(inputSearch).submit();
    }

}
