package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.AcadiaPage;

public class tests {
    private String city = "Paris";
    AcadiaPage acadia = new AcadiaPage();
    @Given("The user is in the web$")
    public void the_user_is_in_the_web() {
        acadia.navigateToUrl();
    }
    @When("The user select destination$")
    public void the_user_select_destination() throws InterruptedException {
        acadia.clickSelect();
        Thread.sleep(3000);
        acadia.setEnterCity();
        Thread.sleep(3000);
    }
    @And("The user choose checkin and checkout$")
    public void the_user_check_in() throws InterruptedException {
        acadia.listAll();
        System.out.println("iufgdudsygfuigdsf");
    }

    @When("The user select rooms$")
    public void the_user_select_rooms() {
        System.out.println("************");
    }
}
