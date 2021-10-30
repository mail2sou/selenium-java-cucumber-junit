package step_definitions;

import businessFlows.NavigateToApp;
import io.cucumber.java.en.When;

public class NavigateToAppSteps {
    NavigateToApp navigateToApp = new NavigateToApp();

    @When("The user clicks on {string} and starts")
    public void the_user_clicks_on_and_starts(String appName) {
        navigateToApp.navigateToApp(appName);
    }
}
