package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.GoibiboPage;

public class StepsGoibibo {
    GoibiboPage goibibo = new GoibiboPage();
    @Given("The user is positioned on the web$")
    public void the_user_is_in_the_web() {
        goibibo.navigate();
    }
    @When("The user search city From$")
    public void the_user_search_destin() throws InterruptedException {
        goibibo.clickInSearch();
        goibibo.listAll();

    }
    @And("The user search city To$")
    public void the_user_check_destination() throws InterruptedException {
        goibibo.listAllTwo();

    }
}
