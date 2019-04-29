package Test_Steps;

import Utilities.MyLibrary;
import Utilities.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSearchSteps extends TestBase {

    @When("user Enters {string} and click search")
    public void user_Enters_and_click_search(String string) {
        google.searchbox.sendKeys(string);
        System.out.println("Searched the iotem "+ string);
    }

    @Then("page titile should change")
    public void page_titile_should_change() {
        System.out.println("Title has changed");

    }

}
