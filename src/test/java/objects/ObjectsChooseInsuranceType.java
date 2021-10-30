package objects;

import businessFlows.AddInsurance;
import org.openqa.selenium.By;

public class ObjectsChooseInsuranceType {
    public static By lnkInsuranceType = By.xpath("//span[text()='" + AddInsurance.insuranceType + "']");
}
