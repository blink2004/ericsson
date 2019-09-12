package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultPage {

    private WebDriver driver;

    public ResultPage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToPage(int number){
        driver.findElement(By.xpath("//table[@id='nav']/tbody/tr/td[" + number + "]/a")).click();
    }

    public void clickResultLinkByNumber(int number){
        driver.findElement(By.xpath("//div[@class='g'][" + number + "]/div/div/div/a/h3/div")).click();
    }

}
