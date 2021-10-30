package businessFlows;

import objects.*;
import org.junit.Test;
import step_definitions.Hooks;
import util.Action;

import static org.junit.Assert.*;

public class AddInsurance extends Hooks {
    public static String insuranceCompany, insuranceType;

    // Below method will add in insurance
    public void addInsurance(String SelectedInsuranceCompany, String SelectedInsuranceType) {
        try {
            Action.explicitWaitTobeVisible(ObjectsRecommendedCard.btnBestehendenVertragHinzufugen);
            Action.click(ObjectsRecommendedCard.btnBestehendenVertragHinzufugen);
            chooseInsuranceCompany(SelectedInsuranceCompany);
            chooseInsuranceType(SelectedInsuranceType);
            chooseInsuranceCompany(SelectedInsuranceCompany);
            confirmSelection();
            selectionConfirmation();
            System.out.println("test");
        } catch (Exception e) {
            System.out.println("Could not add insurance " + e.getMessage());
        }
    }

    // Below method chooses insurance company
    public void chooseInsuranceCompany(String company) {
        insuranceCompany = company;
        try {
            Action.explicitWaitTobeVisible(ObjectsChooseInsuranceCompany.lnkInsuranceCompany);
            Action.click(ObjectsChooseInsuranceCompany.lnkInsuranceCompany);
        } catch (Exception e) {
            System.out.println("Could not choose insurance company " + e.getMessage());
        }
    }

    // Below method chooses insurance type
    public void chooseInsuranceType(String type) {
        insuranceType = type;
        try {
            Action.explicitWaitTobeVisible(ObjectsChooseInsuranceType.lnkInsuranceType);
            Action.click(ObjectsChooseInsuranceType.lnkInsuranceType);
        } catch (Exception e) {
            System.out.println("Could not choose insurance type " + e.getMessage());
        }
    }

    @Test
    public void confirmSelection() {
        try {
            Action.explicitWaitTobeVisible(ObjectsConfirmInsuranceSelection.btnAuswahlBestatigen);
            Action.click(ObjectsConfirmInsuranceSelection.btnAuswahlBestatigen);
        } catch (Exception e) {
            System.out.println("Could not confirm selection " + e.getMessage());
        }
    }

    @Test
    public void selectionConfirmation() {
        try {
            Action.explicitWaitTobeVisible(ObjectsSelectionConfirmation.lblGeschafft);
            String pageHeader = Action.getTextEle(ObjectsSelectionConfirmation.lblPageHeader);
            assertEquals("verifying navigation to Geschafft! page", "Geschafft!", pageHeader);
            Action.click(ObjectsSelectionConfirmation.btnZuDeinenVertragen);
        } catch (Exception e) {
            System.out.println("Issue with selection confirmation " + e.getMessage());
        }
    }

//    Below method verifies the insurance which was added earlier
    @Test
    public void verifyInsurance() {
        try {
            Action.explicitWaitTobeVisible(ObjectsInsuranceManager.lblDeineVertrage);
            Action.explicitWaitTobeVisible(ObjectsInsuranceManager.txtInsuranceType);
            String type = Action.getTextEle(ObjectsInsuranceManager.txtInsuranceType);
            String company = Action.getTextEle(ObjectsInsuranceManager.txtInsuranceCompany);
            assertEquals("verifying insurance type", insuranceType, type);
            assertEquals("verifying insurance company", insuranceCompany, company);
        } catch (Exception e) {
            assertFalse("Verification of added insurance failed", false);
        }
    }
}
