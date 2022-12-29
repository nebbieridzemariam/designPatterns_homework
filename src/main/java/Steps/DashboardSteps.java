package Steps;

import Pages.DashboardPage;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.open;

public class DashboardSteps extends DashboardPage {

    @Step
    public DashboardSteps navigateToDashboardPage() {
        open("https://demoqa.com/");
        return this;
    }

    @Step
    public DashboardSteps clickOnFormsButton(){

        formsButton.scrollTo();
        formsButton.click();
        return this;
    }

}
