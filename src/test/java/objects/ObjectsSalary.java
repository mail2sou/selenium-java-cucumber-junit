package objects;

import org.openqa.selenium.By;
import step_definitions.Hooks;

public class ObjectsSalary extends Hooks {
    public static By txtSalary = By.xpath("//div/input[@type='text']");
    public static By btnSpeichern = By.xpath("//span[text()='Speichern']");
}
