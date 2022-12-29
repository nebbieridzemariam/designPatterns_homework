package PageFactory.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticeFormsPage {

    private WebDriver driver;

    public PracticeFormsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()=\"Practice Form\"]")
    public WebElement practiceForm;

    @FindBy(id = "firstName")
    public WebElement firstName;

    @FindBy(id = "lastName")
    public WebElement lastNameFill;

    @FindBy(xpath = "//label[text()='Female']")
    public WebElement genderOption;

    @FindBy(id = "userNumber")
    public WebElement phoneNumberInput;

    @FindBy(id = "submit")
    public WebElement submitButton;

    @FindBy(id = "fixedban")
    public WebElement ads;

    @FindBy(xpath = "//footer")
    public WebElement footer;

}
