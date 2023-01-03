package PageFactory.Steps;

import PageFactory.Pages.PracticeFormsPage;
import io.qameta.allure.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class PracticeFormsPageSteps extends PracticeFormsPage {

    JavascriptExecutor js;

    public PracticeFormsPageSteps(WebDriver driver) {
        super(driver);
        js = (JavascriptExecutor) driver;
    }

    @Step("Clicking on practice form")
    public PracticeFormsPageSteps clickOnPracticeForm() {
        practiceForm.click();
        return this;
    }

    @Step("Inputting the name: {0}")
    public PracticeFormsPageSteps nameInput(String name) {
        firstName.sendKeys(name);
        return this;
    }

    @Step("Inputting the last name: {0}")
    public PracticeFormsPageSteps lastNameInput(String lastName) {
        lastNameFill.sendKeys(lastName);
        return this;
    }

    @Step("Selecting gender")
    public PracticeFormsPageSteps selectGenderFemale() {
        genderOption.click();
        return this;
    }

    @Step("Inputting phone number: {0}")
    public PracticeFormsPageSteps fillPhoneNumber(String phoneNumber) {
        phoneNumberInput.sendKeys(phoneNumber);
        return this;

    }

    @Step("Removing ads")
    public PracticeFormsPageSteps removeAds() {
        js.executeScript("return arguments[0].remove();", ads);
        return this;
    }

    @Step("Deleting footer")
    public PracticeFormsPageSteps deleteFooter() {
        js.executeScript("return arguments[0].remove();", footer);
        return this;
    }

    @Step("Clicking submit button")
    public PracticeFormsPageSteps submitButtonClick() {
        js.executeScript("arguments[0].scrollIntoView();", submitButton);
        submitButton.click();
        return this;
    }


}
