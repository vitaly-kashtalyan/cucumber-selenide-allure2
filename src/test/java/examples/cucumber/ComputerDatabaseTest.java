package examples.cucumber;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/examples.cucumber/"
)
public class ComputerDatabaseTest {
    final static String BASE_URL = "http://computer-database.gatling.io/computers";

    @BeforeClass
    public static void initSettings() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver-windows-32bit.exe");
        Configuration.baseUrl = BASE_URL;
        Configuration.browser = "chrome";
        Configuration.reportsFolder = "target/reports";
    }
}
