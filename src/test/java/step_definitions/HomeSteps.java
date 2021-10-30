package step_definitions;

import businessFlows.Home;
import io.cucumber.java.en.Given;

public class HomeSteps {
    Home home = new Home();

    @Given("An user navigates to the home page")
    public void an_user_navigates_to_the_home_page() {
        home.navigateToHome();
    }
}
