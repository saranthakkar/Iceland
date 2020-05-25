package IcelandMultiple.StepDefinitionPackage;

import IcelandMultiple.PageObjectPackage.OffersPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OffersPageSteps {
    OffersPage offersPage = new OffersPage();

    @Given("^user is on Homepage of Iceland$")
    public void user_is_on_Homepage_of_Iceland() throws Throwable {
    Thread.sleep(4000);
    offersPage.homepageAssertion();         //homepage assertion
    }

    @When("^user clicks on Offers icon$")
    public void user_clicks_on_Offers_icon() throws Throwable {
    offersPage.offersMethod();
    }

    @Then("^user should able to see Offers page$")
    public void user_should_able_to_see_Offers_page() throws Throwable {
    Thread.sleep(3000);
    offersPage.offerspageAssertion();       //Offers page assertion
    }
}
