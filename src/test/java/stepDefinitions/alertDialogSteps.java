package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AlertDialogPage;
import pages.ContextMenuPage;

public class alertDialogSteps {

    AlertDialogPage alertDialogPage = new AlertDialogPage();

    @Then("should see List Dialog Panel on the Alert Dialog Page")
    public void shouldSeeListDialogPanelOnTheAlertDialogPage() {alertDialogPage.checkListDialogPanel();}

    @When("taps to random option List Dialog Panel on the Alert Dialog Page")
    public void tapsToRandomOptionListDialogPanelOnTheAlertDialogPage() {alertDialogPage.clickRandomOptionListDialogPanel();}

    @Then("selected item should be correct in the alert message on the Alert Dialog Page")
    public void selectedItemShouldBeCorrectInTheAlertMessageOnTheAlertDialogPage() {alertDialogPage.checkSelectedItemAlertMessage();}


    @When("taps to {string} menu on the Alert Dialog Page")
    public void tapsToMenuOnTheAlertDialogPage(String arg0) {alertDialogPage.clickMenu(arg0);
    }
}
