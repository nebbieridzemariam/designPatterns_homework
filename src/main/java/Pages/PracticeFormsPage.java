package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static Data.DataClass.gender;
import static com.codeborne.selenide.Selenide.$;

public class PracticeFormsPage {

   public  SelenideElement practiceForm = $(By.xpath("//span[text()=\"Practice Form\"]"));
   public SelenideElement firstName = $(By.id("firstName"));

   public SelenideElement lastNameFill = $(By.id("lastName"));

   public SelenideElement genderOption = $(By.xpath("//label[text()='" + gender + "']"));

   public SelenideElement phoneNumberInput = $(By.id("userNumber"));

   public SelenideElement submitButton = $(By.id("submit"));

   public SelenideElement ads = $(By.id("fixedban"));

   public SelenideElement footer = $(By.xpath("//footer"));

}
