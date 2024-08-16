package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AlertDialogPage;
import pages.ScrollablePage;

public class scrollableSteps {

    ScrollablePage scrollablePage = new ScrollablePage();


    @Then("scroll to {string} on the Scrollable Page")
    public void scrollToOnTheScrollablePage(String arg0) {scrollablePage.scrollToTab(arg0);}

    @When("taps to {string} on the Scrollable Page")
    public void tapsToOnTheScrollablePage(String arg0) {scrollablePage.clickTab(arg0);}

    @Then("should see Tab 30 text {string} on the Scrollable Page")
    public void shouldSeeTabTextOnTheScrollablePage(String arg0) {scrollablePage.checkTab30Text(arg0);}
}
