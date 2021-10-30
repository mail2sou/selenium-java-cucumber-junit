package objects;

import org.openqa.selenium.By;

public class ObjectsViewRecommendations {
    public static By lblPageHeader = By.xpath("//div/h1");
    public static By txtDeineEmpfehlungenSindVerfugbar = By.xpath("//h1[text()='Deine Empfehlungen sind verfügbar']");
    public static By btnEmpfehlungenAnsehen = By.xpath("//span[text()='Empfehlungen ansehen']");
    public static By btnClose = By.xpath("//button[contains(@class,'close')]");
}
