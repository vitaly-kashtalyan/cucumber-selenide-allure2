package examples.cucumber;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class AddNewComputerStepDefinitions {
    private String name;

    @When("^click on 'Add a new computer' button$")
    public void clickAddNewComputer() {
        $("#add").click();
    }

    @When("^click on 'Create this computer' button$")
    public void clickCreateComputer() {
        $x("//input[@value='Create this computer']").click();
    }

    @When("^enter a new computer name (.*) in field$")
    public void enterComputerName(String name) {
        this.name = name;
        $("#name").val(name);
    }

    @Then("^computer has been created$")
    public void alertMessageContainName() {
        $("div.alert-message").shouldHave(text(name));
    }

    @And("^select (.*) from the list company$")
    public void selectCompanyFromList(String company) {
        $("#company").selectOptionContainingText(company);
    }
}
