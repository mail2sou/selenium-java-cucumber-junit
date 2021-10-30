package objects;

import businessFlows.BedarfQuestionnaire;
import org.openqa.selenium.By;
import step_definitions.Hooks;

public class ObjectsVehicles extends Hooks {
    public static By chkvehicles = By.xpath("//label[text()='" + BedarfQuestionnaire.vehicles + "']");
    public static By btnWeiter = By.xpath("//span[text()='Weiter']");
}
