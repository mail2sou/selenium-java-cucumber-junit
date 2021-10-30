package objects;

import businessFlows.BedarfQuestionnaire;
import org.openqa.selenium.By;
import step_definitions.Hooks;

public class ObjectsLivingSituation extends Hooks {
    public static By rbtnlivingSituation = By.xpath("//label[text()='" + BedarfQuestionnaire.livingSituation + "']");
}
