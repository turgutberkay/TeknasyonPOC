package stepDefinitions;

import pages.General;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class homeSteps {

    HomePage homePage = new HomePage();

    @Then("should see Home Page")
    public void shouldSeeHomePage() {
        homePage.checkHomePage();}

}
