package objects;

import businessFlows.BedarfQuestionnaire;
import org.openqa.selenium.By;
import step_definitions.Hooks;

public class ObjectsChildDetails extends Hooks {
    public static By rbtnchildDetails = By.xpath("//label[text()='" + BedarfQuestionnaire.childDetails + "']");
}
