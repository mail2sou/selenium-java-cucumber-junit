package step_definitions;

import businessFlows.BedarfQuestionnaire;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class BedarfQuestionnaireSteps {
    BedarfQuestionnaire bedarfQuestionnaire = new BedarfQuestionnaire();

    @Then("The user is redirected to the questionnaire page")
    public void the_user_is_redirected_to_the_questionnaire_page() {
        bedarfQuestionnaire.questionnaire();
    }

    @Then("The user fills up the questionnaire with dob {string}")
    public void the_user_fills_up_the_questionnaire_with_dob(String dob) {
        bedarfQuestionnaire.dob(dob);
    }

    @And("fills up gender {string}")
    public void fills_up_gender(String gender) {
        bedarfQuestionnaire.gender(gender);
    }

    @And("fills up living situation {string}")
    public void fills_up_living_situation(String livingSituation) {
        bedarfQuestionnaire.livingSituation(livingSituation);
    }

    @And("fills up finance planning {string}")
    public void fills_up_finance_planning(String financePlanning) {
        bedarfQuestionnaire.financePlanning(financePlanning);
    }

    @And("fills up vehicles {string}")
    public void fills_up_vehicles(String vehicles) {
        bedarfQuestionnaire.vehicles(vehicles);
    }

    @And("fills up family situation {string}")
    public void fills_up_family_situation(String familySituation) {
        bedarfQuestionnaire.familySituation(familySituation);
    }

    @And("fills up child details {string}")
    public void fills_up_child_details(String childDetails) {
        bedarfQuestionnaire.childDetails(childDetails);
    }

    @And("fills up profession {string}")
    public void fills_up_profession(String profession) {
        bedarfQuestionnaire.profession(profession);
    }

    @And("fills up free time details {string}")
    public void fills_up_free_time_details(String freeTime) {
        bedarfQuestionnaire.freeTime(freeTime);
    }

    @And("fills up salary {string}")
    public void fills_up_salary(String salary) {
        bedarfQuestionnaire.salary(salary);
    }

    @And("the user registers using email and password")
    public void the_user_registers_using_email_and_password() {
        bedarfQuestionnaire.register();
    }
}
