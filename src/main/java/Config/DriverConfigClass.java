package Config;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverConfigClass {

    static WebDriver driver;
    private static String PAGE_URL = "https://demoqa.com/";

    public void driverInit() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(PAGE_URL);
    }

    public WebDriver getDriver() {
        return driver;
    }



}
