package objects;

import businessFlows.NavigateToApp;
import org.openqa.selenium.By;
import step_definitions.Hooks;

public class ObjectsNavigateToApp extends Hooks {
    public static By lnkBedarf = By.xpath("//li/a[contains(@href,'recommendations')]");
    public static By lnkAppName = By.xpath("//a[text()='" + NavigateToApp.app + "']");
    public static By btnJetztStarten = By.xpath("//span[text()='Jetzt starten']");
}
