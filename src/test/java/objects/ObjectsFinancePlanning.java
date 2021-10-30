package objects;

import businessFlows.BedarfQuestionnaire;
import org.openqa.selenium.By;
import step_definitions.Hooks;

public class ObjectsFinancePlanning extends Hooks {
    public static By rbtnfinancePlanning = By.xpath("//label[text()='" + BedarfQuestionnaire.financePlanning + "']");
}
