package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ContextMenuPage;
import pages.IncomingMessagePage;

public class incomingMessageSteps {

    IncomingMessagePage incomingMessagePage = new IncomingMessagePage();

    @When("taps to Show Notification button on the Incoming Message Page")
    public void tapsToShowNotificationButtonOnTheIncomingMessagePage() {incomingMessagePage.clickShowNotificationButton();
    }


    @Then("should see correct Notification Message on the Incoming Message Page")
    public void shouldSeeCorrectNotificationMessageOnTheIncomingMessagePage() {incomingMessagePage.checkCorrectNotificationMessage();
    }
}
