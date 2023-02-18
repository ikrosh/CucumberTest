package hw.pages;

import hw.config.Delay;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage {

    private WebDriverWait wait;
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(Delay.PAGE_LOAD_TIMEOUT.getSeconds()) );
        this.driver = driver;
    }

    public void verifyElementText(String locator, String text) {
       wait.until(ExpectedConditions.textToBe(By.xpath(locator), text));
    }
}
