package objects;

import businessFlows.AddInsurance;
import org.openqa.selenium.By;

public class ObjectsInsuranceManager {
    public static By lblDeineVertrage = By.xpath("//h4[text()='Deine Verträge']");
    public static By txtInsuranceType = By.xpath("//div[text()='" + AddInsurance.insuranceType + "']");
    public static By txtInsuranceCompany = By.xpath("//div[text()='" + AddInsurance.insuranceType + "']/parent::div/div[text()='" + AddInsurance.insuranceCompany + "']");
}
