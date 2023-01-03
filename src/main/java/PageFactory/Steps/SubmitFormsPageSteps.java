package PageFactory.Steps;

import Data.DataClass;
import PageFactory.Pages.SubmitFormsPage;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class SubmitFormsPageSteps extends SubmitFormsPage {

    public SubmitFormsPageSteps(WebDriver driver) {
        super(driver);
    }

    @Step("Validate  'Thanks for submitting the form' text")
    public SubmitFormsPageSteps validateThankYouText() {
        Assert.assertEquals(submitFormText.getText(), "Thanks for submitting the form");
        return this;
    }

    @Step("Validate input name")
    public SubmitFormsPageSteps validateName() {
        Assert.assertEquals(studentName.getText(), DataClass.name + " " + DataClass.lastName);
        return this;
    }

    @Step("Validate selected gender")
    public SubmitFormsPageSteps validateGender() {
        Assert.assertEquals(studentGender.getText(), DataClass.gender);
        return this;
    }

    @Step("Validate input number")
    public SubmitFormsPageSteps validateNumber() {
        Assert.assertEquals(studentPhoneNumber.getText(), DataClass.phoneNumber);
        return this;
    }
}
