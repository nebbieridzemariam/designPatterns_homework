package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class DashboardPage {
    public SelenideElement formsButton = $(By.xpath("//h5[text()=\"Forms\"]"));
}
