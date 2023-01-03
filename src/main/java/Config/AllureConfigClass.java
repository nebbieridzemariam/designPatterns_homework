package Config;

import com.google.common.collect.ImmutableMap;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import static com.github.automatedowl.tools.AllureEnvironmentWriter.allureEnvironmentWriter;

public class AllureConfigClass implements ITestListener {

    DriverConfigClass driverConfig = new DriverConfigClass();

    public void setAllureEnvironment() {
        allureEnvironmentWriter(
                ImmutableMap.<String, String>builder()
                        .put("Browser", "Chrome")
                        .put("Browser.Version", "108.0.5359.98")
                        .put("URL", "https://demoqa.com/")
                        .build(), System.getProperty("user.dir")
                        + "/allure-results/");
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        takeScreenshot(driverConfig.getDriver());
    }

    @Attachment(value = "Screenshot", type = "image/png")
    public static byte[] takeScreenshot(WebDriver driver) {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

}
