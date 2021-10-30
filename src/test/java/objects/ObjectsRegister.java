package objects;

import org.openqa.selenium.By;

public class ObjectsRegister {
    public static By txtEmail = By.xpath("//input[@type='email']");
    public static By txtPassword = By.xpath("//input[@type='password']");
    public static By btnJetztRegistrieren = By.xpath("//span[text()='Jetzt registrieren']");
}
