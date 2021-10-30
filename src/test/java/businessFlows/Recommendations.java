package businessFlows;

import objects.ObjectsRecommendations;
import objects.ObjectsViewRecommendations;
import org.junit.Test;
import step_definitions.Hooks;
import util.Action;

import static org.junit.Assert.assertEquals;

public class Recommendations extends Hooks {
    public static String recommendedCard;

//    Below method helps the user to view the recommendations as per the filled up questionnaire
    @Test
    public void viewRecommendations() {
        try {
            Action.explicitWaitTobeVisible(ObjectsViewRecommendations.txtDeineEmpfehlungenSindVerfugbar);
            String pageHeader = Action.getTextEle(ObjectsViewRecommendations.lblPageHeader);
            assertEquals("verifying navigation to Deine Empfehlungen sind verfügbar page", "Deine Empfehlungen sind verfügbar", pageHeader);
            Action.click(ObjectsViewRecommendations.btnEmpfehlungenAnsehen);
            Action.explicitWaitTobeVisible(ObjectsViewRecommendations.btnClose);
            Action.click(ObjectsViewRecommendations.btnClose);
        } catch (Exception e) {
            System.out.println("Could not view recommendations " + e.getMessage());
        }
    }

    //    Below method helps the user to select the recommendations as per the filled up questionnaire
    public void selectRecommendedCard(String card) {
        try {
            recommendedCard = card;
            Action.explicitWaitTobeVisible(ObjectsRecommendations.txtUnsereEmpfehlungenFurDich);
            String pageHeader = Action.getTextEle(ObjectsRecommendations.lblPageHeader);
            assertEquals("verifying navigation to Unsere Empfehlungen für dich page", "Unsere Empfehlungen für dich", pageHeader);
            Action.click(ObjectsRecommendations.lnkRecommendationCard);
            Action.explicitWaitTobeVisible(ObjectsRecommendations.btnMehrInformationen);
            Action.click(ObjectsRecommendations.btnMehrInformationen);
        } catch (Exception e) {
            System.out.println("Could not select any recommended card " + e.getMessage());
        }
    }

}
