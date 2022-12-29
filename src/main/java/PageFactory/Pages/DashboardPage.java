package PageFactory.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
    private WebDriver driver;
    JavascriptExecutor js;
    private static String PAGE_URL = "https://demoqa.com/";

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
        driver.get(PAGE_URL);
        PageFactory.initElements(driver, this);
        js = (JavascriptExecutor) driver;

    }

    @FindBy(xpath = "//h5[text()=\"Forms\"]")
    public WebElement formsButton;


}
