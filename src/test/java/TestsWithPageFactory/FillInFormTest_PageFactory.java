package TestsWithPageFactory;

import Data.DataClass;
import PageFactory.Steps.DashboardPageSteps;
import PageFactory.Steps.PracticeFormsPageSteps;
import PageFactory.Steps.SubmitFormsPageSteps;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class FillInFormTest_PageFactory extends DataClass {

    WebDriver driver;

    public FillInFormTest_PageFactory() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void fillInForm() {
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
