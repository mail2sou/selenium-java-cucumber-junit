package objects;

import businessFlows.BedarfQuestionnaire;
import org.openqa.selenium.By;
import step_definitions.Hooks;

public class ObjectsProfession extends Hooks {
    public static By rbtnprofession = By.xpath("//label[text()='" + BedarfQuestionnaire.profession + "']");
    public static By btnWeiter = By.xpath("//span[text()='Weiter']");
}
