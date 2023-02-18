package hw.steps;

import hw.config.BaseClass;
import hw.pages.MainPage;
import io.cucumber.java.AfterAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckElementsSteps extends BaseClass {

    MainPage page = new MainPage(getDriver());



    @AfterAll
    public static void after(){
        getDriver().quit();
    }


    @When("I open page {string}")
    public void iOpenPage(String url) throws InterruptedException {
        getDriver().get(url);
    }

    @And("check if {string} contains {string}")
    public void checkIfContains(String locator, String text) {
        page.verifyElementText(locator, text);
    }
}
