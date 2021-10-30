package objects;

import businessFlows.BedarfQuestionnaire;
import org.openqa.selenium.By;
import step_definitions.Hooks;

public class ObjectsGender extends Hooks {
    public static By rbtnGender = By.xpath("//label[text()='" + BedarfQuestionnaire.gender + "']");
}
