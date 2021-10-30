package objects;

import businessFlows.Recommendations;
import org.openqa.selenium.By;

public class ObjectsRecommendations {
    public static By lblPageHeader = By.xpath("//div/h1");
    public static By txtUnsereEmpfehlungenFurDich = By.xpath("//h1[text()='Unsere Empfehlungen für dich']");
    public static By lnkRecommendationCard = By.xpath("//button[@data-cucumber-ellipses-link='" + Recommendations.recommendedCard + "']");
    public static By btnMehrInformationen = By.xpath("//span[text()='Mehr Informationen']");
}
