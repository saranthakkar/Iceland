package IcelandMultiple.StepDefinitionPackage;

import IcelandMultiple.PageObjectPackage.CrispsPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CrispsPageSteps {
    CrispsPage crispsPage = new CrispsPage();

    @When("^user wants to search for Crisps$")
    public void user_wants_to_search_for_Crisps() throws Throwable {
    crispsPage.doSearch();
    }

    @Then("^user should able to see all Crisps$")
    public void user_should_able_to_see_all_Crisps() throws Throwable {
    Thread.sleep(3000);
    crispsPage.crispsAssertion();
    }
}
