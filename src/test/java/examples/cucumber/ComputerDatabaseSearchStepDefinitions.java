package examples.cucumber;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ComputerDatabaseSearchStepDefinitions {
    private String name;

    @When("^enter a name (.*) in filter field$")
    public void enterFilterByName(String name) {
        this.name = name;
        $("#searchbox").val(name).pressEnter();
    }

    @Then("^top (\\d+) matches should be shown$")
    public void topNMatchedItemsShouldBeShown(int resultsCount) {
        $$("table.computers.zebra-striped tbody tr").shouldHave(size(resultsCount));
    }

    @Then("^the header should contain (.*)$")
    public void theHeaderShouldContainKeyword(String expectedText) {
        $("section h1").shouldHave(text(expectedText));
    }

    @Then("^an item should be found$")
    public void anItemShouldBeFound() {
        $$("tbody tr td a").findBy(text(name)).shouldBe(visible);
    }
}
