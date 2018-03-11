package examples.cucumber;

import cucumber.api.java.en.Given;

import static com.codeborne.selenide.Selenide.open;
import static examples.cucumber.ComputerDatabaseTest.BASE_URL;

public class BaseStepDefinitions {

    @Given("^an open browser with computer-database$")
    public void openComputerDataBase() {
        open(BASE_URL);
    }
}
