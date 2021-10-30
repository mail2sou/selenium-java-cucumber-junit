package objects;

import businessFlows.AddInsurance;
import org.openqa.selenium.By;

public class ObjectsChooseInsuranceCompany {
    public static final By lnkInsuranceCompany = By.xpath("//span[text()='" + AddInsurance.insuranceCompany + "']");
    ////h3[text()='Private Altersvorsorge']/parent::div/parent::div/parent::div/parent::div/div[2]/button
}
