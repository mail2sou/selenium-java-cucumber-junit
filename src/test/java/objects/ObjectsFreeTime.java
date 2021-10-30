package objects;

import businessFlows.BedarfQuestionnaire;
import org.openqa.selenium.By;
import step_definitions.Hooks;

public class ObjectsFreeTime extends Hooks {
    public static By chkfreeTime = By.xpath("//label[text()='" + BedarfQuestionnaire.freeTime + "']");
    public static By btnWeiter = By.xpath("//span[text()='Weiter']");
}
