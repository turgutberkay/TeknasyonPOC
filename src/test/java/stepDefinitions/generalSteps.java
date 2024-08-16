package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.General;
import io.cucumber.java.en.Given;
import pages.HomePage;

public class generalSteps {

    General general = new General();

    @When("taps to {string} menu")
    public void tapsToMenu(String arg0) {general.clickMenu(arg0);}

    @Then("open to Notification Panel")
    public void openToNotificationPanel(){general.openNotificationPanel();}

    @Then("should see App Notification Title Text {string}")
    public void shouldSeeAppNotificationTitleText(String arg0) {general.checkAppNotificationTitleText(arg0);}

    @When("taps to App Notification")
    public void tapsToAppNotification() {general.clickAppNotification();}


}
