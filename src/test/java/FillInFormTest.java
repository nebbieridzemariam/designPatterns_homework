import Data.DataClass;
import Steps.Config;
import Steps.DashboardSteps;
import Steps.PracticeFormsSteps;
import Steps.SubmitFormsSteps;
import org.testng.annotations.Test;

public class FillInFormTest extends DataClass {

    Config configBrowser = new Config();

    DashboardSteps dashboardSteps = new DashboardSteps();
    PracticeFormsSteps practiceFormsSteps = new PracticeFormsSteps();

    SubmitFormsSteps submitFormsSteps = new SubmitFormsSteps();

    public FillInFormTest(){
        configBrowser.configureBrowser();
    }

    @Test
    public void fillInForm() {

        dashboardSteps
                .navigateToDashboardPage()
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

}
