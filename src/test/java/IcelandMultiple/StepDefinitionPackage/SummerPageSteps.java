package IcelandMultiple.StepDefinitionPackage;

import IcelandMultiple.PageObjectPackage.OffersPage;
import IcelandMultiple.PageObjectPackage.SummerPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;

public class SummerPageSteps {
    SummerPage summerPage = new SummerPage();

    @When("^user clicks on Summer icon$")
    public void user_clicks_on_Summer_icon() throws Throwable {
    summerPage.summerIconMethod();
    }

    @Then("^user should able to see Summer page$")
    public void user_should_able_to_see_Summer_page() throws Throwable {
    Thread.sleep(2000);
    summerPage.summerPageAssertion();
    }
}
