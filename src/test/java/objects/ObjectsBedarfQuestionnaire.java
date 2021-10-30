package objects;

import org.openqa.selenium.By;
import step_definitions.Hooks;

public class ObjectsBedarfQuestionnaire extends Hooks {
    public static By txtWannBistDuGeboren = By.xpath("//span[text()='Wann bist du geboren?']");
    public static By txtBirthDate = By.cssSelector("#mandate_birthdate");
    public static By btnWeiter = By.xpath("//span[text()='Weiter']");
}
