package PageFactory.Steps;

import PageFactory.Pages.DashboardPage;
import io.qameta.allure.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class DashboardPageSteps extends DashboardPage {

    JavascriptExecutor js;

    public DashboardPageSteps(WebDriver driver) {
        super(driver);
        js = (JavascriptExecutor) driver;
    }

    @Step("Clicking on forms button")
    public DashboardPageSteps clickOnFormsButton() {

        js.executeScript("arguments[0].scrollIntoView();", formsButton);
        formsButton.click();
        return this;
    }

}
