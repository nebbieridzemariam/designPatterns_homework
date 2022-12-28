package Steps;

import Data.DataClass;
import Pages.SubmitForms;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

public class SubmitFormsSteps extends SubmitForms {

    @Step
    public SubmitFormsSteps validateThankYouText() {
        submitFormText.shouldBe(Condition.visible);
        submitFormText.shouldHave(Condition.text("Thanks for submitting the form"));
        return this;
    }

    @Step
    public SubmitFormsSteps validateName() {
        studentName.shouldHave(Condition.text(DataClass.name + " " + DataClass.lastName));
        return this;
    }

    @Step
    public SubmitFormsSteps validateGender() {
        studentGender.shouldHave(Condition.text(DataClass.gender));
        return this;
    }

    @Step
    public SubmitFormsSteps validateNumber() {
        studentPhoneNumber.shouldHave(Condition.text(DataClass.phoneNumber));
        return this;
    }
}
