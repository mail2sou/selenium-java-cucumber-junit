package objects;

import businessFlows.BedarfQuestionnaire;
import org.openqa.selenium.By;
import step_definitions.Hooks;

public class ObjectsFamilySituation extends Hooks {
    public static By rbtnfamilySituation = By.xpath("//label[text()='" + BedarfQuestionnaire.familySituation + "']");
}
