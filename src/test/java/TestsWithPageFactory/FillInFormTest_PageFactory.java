package TestsWithPageFactory;

import Config.AllureConfigClass;
import Config.DriverConfigClass;
import Data.DataClass;
import PageFactory.Steps.DashboardPageSteps;
import PageFactory.Steps.PracticeFormsPageSteps;
import PageFactory.Steps.SubmitFormsPageSteps;
import io.qameta.allure.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(AllureConfigClass.class)
public class FillInFormTest_PageFactory extends DataClass {

    WebDriver driver;

    @Description("This is allure description")
    @Epic("This is EPIC")
    @Feature("This is Feature")
    @Story("This is Story")
    @Test(description = "This test fills a form")
    @Severity(SeverityLevel.CRITICAL)
    public void fillInForm() {

        AllureConfigClass allureConfigClass = new AllureConfigClass();
        allureConfigClass.setAllureEnvironment();

        DriverConfigClass driverConfigClass = new DriverConfigClass();
        driverConfigClass.driverInit();
        driver = driverConfigClass.getDriver();

        DashboardPageSteps dashboardSteps = new DashboardPageSteps(driver);
        PracticeFormsPageSteps practiceFormsSteps = new PracticeFormsPageSteps(driver);
        SubmitFormsPageSteps submitFormsSteps = new SubmitFormsPageSteps(driver);

        dashboardSteps
                .clickOnFormsButton();

        practiceFormsSteps
                .clickOnPracticeForm()
                .nameInput(name)
                .lastNameInput(lastName)
                .selectGenderFemale()
                .fillPhoneNumber(phoneNumber)
                .removeAds()
                .deleteFooter()
                .submitButtonClick();

        submitFormsSteps.validateThankYouText()
                .validateName()
                .validateGender()
                .validateNumber();
    }

    @AfterSuite
    public void closeBrowser() {
        driver.close();
    }

}
