package step_definitions;

import businessFlows.Recommendations;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class RecommendationSteps {
    Recommendations recommendations = new Recommendations();

    @Then("The user views recommendations")
    public void the_user_views_recommendations() {
        recommendations.viewRecommendations();
    }

    @And("click on recommendation card {string}")
    public void click_on_recommendation_card(String card) {
        recommendations.selectRecommendedCard(card);
    }
}
