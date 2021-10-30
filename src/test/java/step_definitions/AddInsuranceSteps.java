package step_definitions;

import businessFlows.AddInsurance;
import io.cucumber.java.en.Then;

public class AddInsuranceSteps {
    AddInsurance addInsurance = new AddInsurance();

    @Then("the user adds insurance with {string} and {string}")
    public void the_user_adds_insurance(String insuranceCompany, String insuranceType) {
        addInsurance.addInsurance(insuranceCompany, insuranceType);
    }

    @Then("the user verifies the added insurance")
    public void the_user_verifies_the_added_insurance() {
        addInsurance.verifyInsurance();
    }
}
