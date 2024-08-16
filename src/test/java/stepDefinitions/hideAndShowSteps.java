package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AlertDialogPage;
import pages.HideAndShowPage;

public class hideAndShowSteps {

    HideAndShowPage hideAndShowPage = new HideAndShowPage();


    @Then("should see first hide button on the Hide And Show Page")
    public void shouldSeeFirstHideButtonOnTheHideAndShowPage() {hideAndShowPage.checkFirstHideButton();
    }

    @Then("should see second hide button on the Hide And Show Page")
    public void shouldSeeSecondHideButtonOnTheHideAndShowPage() {hideAndShowPage.checkSecondHideButton();
    }

    @Then("should see first textbox on the Hide And Show Page")
    public void shouldSeeFirstTextboxOnTheHideAndShowPage() {hideAndShowPage.checkFirstTextbox();
    }

    @Then("should see second textbox on the Hide And Show Page")
    public void shouldSeeSecondTextboxOnTheHideAndShowPage() {hideAndShowPage.checkSecondTextbox();
    }

    @When("taps to first hide button on the Hide And Show Page")
    public void tapsToFirstHideButtonOnTheHideAndShowPage() {hideAndShowPage.clickFirstHideButton();
    }

    @Then("should see first textbox is hidden on the Hide And Show Page")
    public void shouldSeeFirstTextboxIsHiddenOnTheHideAndShowPage() {hideAndShowPage.checkFirstTextboxIsHidden();
    }

    @Then("should see first hide button text {string} on the Hide And Show Page")
    public void shouldSeeFirstHideButtonTextOnTheHideAndShowPage(String arg0) {hideAndShowPage.checkFirstHideButtonText(arg0);
    }
}
