package PageFactory.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubmitFormsPage {

    private WebDriver driver;

    public SubmitFormsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "example-modal-sizes-title-lg")
    public WebElement submitFormText;

    @FindBy(xpath = "//td[text()='Student Name']/following-sibling::td")
    public WebElement studentName;

    @FindBy(xpath = "//td[text()='Gender']/following-sibling::td")
    public WebElement studentGender;

    @FindBy(xpath = "//td[text()='Mobile']/following-sibling::td")
    public WebElement studentPhoneNumber;

}
