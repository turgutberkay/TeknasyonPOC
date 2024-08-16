package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CustomTitlePage;

public class customTitleSteps {

    CustomTitlePage activityPage = new CustomTitlePage();
    @Then("should see default left textBox text {string} on the Activity Page")
    public void shouldSeeDefaultLeftTextBoxText(String arg0) {activityPage.checkLeftTextboxText(arg0);
    }
    @Then("should see default right textBox text {string} on the Activity Page")
    public void shouldSeeDefaultRightTextBoxText(String arg0) {activityPage.checkRightTextboxText(arg0);}

    @Then("should see default left navigationBar text {string} on the Activity Page")
    public void shouldSeeDefaultLeftNavigationBarText(String arg0) {activityPage.checkLeftNavigationBarText(arg0);
    }
    @Then("should see default right navigationBar text {string} on the Activity Page")
    public void shouldSeeDefaultRightNavigationBarText(String arg0) {activityPage.checkRightNavigationBarText(arg0);}

    @When("change to left textBox value to {string} on the Activity Page")
    public void changeToLeftTextBoxValueTo(String arg0) {
        activityPage.sendKeyLeftTextbox(arg0);
        activityPage.clickChangeLeftButton();
    }

    @Then("should see the left navigationBar text updated to {string} on the Activity Page")
    public void shouldSeeTheLeftNavigationBarTextUpdatedTo(String arg0) {activityPage.checkLeftNavigationBarText(arg0);}

    @When("change the right textBox value to {string} on the Activity Page")
    public void changeTheRightTextBoxValueTo(String arg0) {
        activityPage.sendKeyRightTextbox(arg0);
        activityPage.clickChangeRightButton();
    }

    @Then("should see the right navigationBar text updated to {string} on the Activity Page")
    public void shouldSeeTheRightNavigationBarTextUpdatedTo(String arg0) {activityPage.checkRightNavigationBarText(arg0);}

}
