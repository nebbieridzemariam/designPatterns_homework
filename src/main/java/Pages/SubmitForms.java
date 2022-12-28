package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SubmitForms {

    public SelenideElement submitFormText = $(By.id("example-modal-sizes-title-lg"));
    public SelenideElement studentName = $(By.xpath("//td[text()='Student Name']/following-sibling::td"));
    public SelenideElement studentGender = $(By.xpath("//td[text()='Gender']/following-sibling::td"));
    public SelenideElement studentPhoneNumber = $(By.xpath("//td[text()='Mobile']/following-sibling::td"));
}
