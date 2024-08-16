package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ContextMenuPage;

public class contextMenuSteps {

    ContextMenuPage contextMenuPage = new ContextMenuPage();

    @Then("should see long press me button on the Context Menu Page")
    public void shouldSeeLongPressMeButtonOnTheContextMenuPage() {contextMenuPage.checkLongPressMeButton();}

    @When("long click to long press me button on the Context Menu Page")
    public void longClickToLongPressMeButtonOnTheContextMenuPage() {contextMenuPage.longPressLongPressMeButton();}

    @Then("should see Menu A layout on the Context Menu Page")
    public void shouldSeeMenuALayoutOnTheContextMenuPage() {contextMenuPage.checkMenuALayout();}

    @Then("should see Menu B layout on the Context Menu Page")
    public void shouldSeeMenuBLayoutOnTheContextMenuPage() {contextMenuPage.checkMenuBLayout();}
}
