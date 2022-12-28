package Steps;

import Pages.PracticeFormsPage;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.executeJavaScript;

public class PracticeFormsSteps extends PracticeFormsPage {
    @Step
    public PracticeFormsSteps clickOnPracticeForm() {
        practiceForm.click();
        return this;
    }

    @Step
    public PracticeFormsSteps nameInput(String name) {
        firstName.sendKeys(name);
        return this;
    }

    @Step
    public PracticeFormsSteps lastNameInput(String lastName) {
        lastNameFill.sendKeys(lastName);
        return this;
    }

    @Step
    public PracticeFormsSteps selectGenderFemale() {
        genderOption.click();
        return this;
    }

    @Step
    public PracticeFormsSteps fillPhoneNumber(String phoneNumber) {
        phoneNumberInput.sendKeys(phoneNumber);
        return this;

    }

    @Step
    public PracticeFormsSteps removeAds() {
        executeJavaScript("return arguments[0].remove();", ads);
        return this;
    }

    @Step
    public PracticeFormsSteps deleteFooter() {
        executeJavaScript("return arguments[0].remove();", footer);
        return this;
    }

    @Step
    public PracticeFormsSteps submitButtonClick() {
        submitButton.scrollTo();
        submitButton.click();
        return this;
    }


}
