package businessFlows;

import objects.*;
import org.junit.Test;
import step_definitions.Hooks;
import util.Action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import static org.junit.Assert.assertEquals;

public class BedarfQuestionnaire extends Hooks {
    public static String gender, livingSituation, financePlanning, vehicles, familySituation, childDetails, profession, freeTime, salary;

//    Below methods help the user in filling up the questionnaire

    @Test
    public void questionnaire() {

        try {
            Action.explicitWaitTobeVisible(ObjectsBedarfQuestionnaire.txtWannBistDuGeboren);
            String pageTitle = Action.getPageTitle();
            assertEquals("verifying navigation to Bedarf Check page", "Bedarfscheck | Clark", pageTitle);
        } catch (Exception e) {
            System.out.println("Could not fill up questionnaire " + e.getMessage());
        }
    }

    public void dob(String dob) {
        try {
            Action.explicitWaitTobeVisible(ObjectsBedarfQuestionnaire.txtBirthDate);
            Action.sendKeys(ObjectsBedarfQuestionnaire.txtBirthDate, dob);
            Action.click(ObjectsBedarfQuestionnaire.btnWeiter);
        } catch (Exception e) {
            System.out.println("Could not fill up date of birth " + e.getMessage());
        }
    }

    public void gender(String selectedGender) {
        try {
            gender = selectedGender;
            Action.explicitWaitTobeVisible(ObjectsGender.rbtnGender);
            Action.click(ObjectsGender.rbtnGender);
        } catch (Exception e) {
            System.out.println("Could not fill up gender " + e.getMessage());
        }
    }

    public void livingSituation(String selectedLivingSituation) {
        try {
            livingSituation = selectedLivingSituation;
            Action.explicitWaitTobeVisible(ObjectsLivingSituation.rbtnlivingSituation);
            Action.click(ObjectsLivingSituation.rbtnlivingSituation);
        } catch (Exception e) {
            System.out.println("Could not fill up living situation " + e.getMessage());
        }
    }

    public void financePlanning(String selectedFinancePlanning) {
        try {
            financePlanning = selectedFinancePlanning;
            Action.explicitWaitTobeVisible(ObjectsFinancePlanning.rbtnfinancePlanning);
            Action.click(ObjectsFinancePlanning.rbtnfinancePlanning);
        } catch (Exception e) {
            System.out.println("Could not fill up finance planning " + e.getMessage());
        }
    }

    public void vehicles(String selectedVehicles) {
        try {
            vehicles = selectedVehicles;
            Action.explicitWaitTobeVisible(ObjectsVehicles.chkvehicles);
            Action.click(ObjectsVehicles.chkvehicles);
            Action.click(ObjectsVehicles.btnWeiter);
        } catch (Exception e) {
            System.out.println("Could not fill up vehicle " + e.getMessage());
        }
    }

    public void familySituation(String selectedFamilySituation) {
        try {
            familySituation = selectedFamilySituation;
            Action.explicitWaitTobeVisible(ObjectsFamilySituation.rbtnfamilySituation);
            Action.click(ObjectsFamilySituation.rbtnfamilySituation);
        } catch (Exception e) {
            System.out.println("Could not fill up family situation " + e.getMessage());
        }
    }

    public void childDetails(String selectedChildDetails) {
        try {
            childDetails = selectedChildDetails;
            Action.explicitWaitTobeVisible(ObjectsChildDetails.rbtnchildDetails);
            Action.click(ObjectsChildDetails.rbtnchildDetails);
        } catch (Exception e) {
            System.out.println("Could not fill up child details " + e.getMessage());
        }
    }

    public void profession(String selectedProfession) {
        try {
            profession = selectedProfession;
            Action.explicitWaitTobeVisible(ObjectsProfession.rbtnprofession);
            Action.click(ObjectsProfession.rbtnprofession);
            Action.click(ObjectsProfession.btnWeiter);
        } catch (Exception e) {
            System.out.println("Could not fill up profession " + e.getMessage());
        }
    }

    public void freeTime(String selectedFreeTime) {
        try {
            freeTime = selectedFreeTime;
            Action.explicitWaitTobeVisible(ObjectsFreeTime.chkfreeTime);
            Action.click(ObjectsFreeTime.chkfreeTime);
            Action.click(ObjectsFreeTime.btnWeiter);
            Action.explicitWaitTobeVisible(ObjectsFreeTime.btnWeiter);
            Action.click(ObjectsFreeTime.btnWeiter);
        } catch (Exception e) {
            System.out.println("Could not fill up free time " + e.getMessage());
        }
    }

    public void salary(String selectedSalary) {
        try {
            salary = selectedSalary;
            Action.explicitWaitTobeVisible(ObjectsSalary.txtSalary);
            Action.sendKeys(ObjectsSalary.txtSalary, salary);
            Action.click(ObjectsSalary.btnSpeichern);
        } catch (Exception e) {
            System.out.println("Could not fill up salary " + e.getMessage());
        }
    }

//    Below method registers the user
    @Test
    public void register() {
        String time = new SimpleDateFormat("hh:mm:ss", Locale.getDefault()).format(new Date());
        time = time.replaceAll(":", "");
        try {
            Action.explicitWaitTobeVisible(ObjectsRegister.txtEmail);
            Action.sendKeys(ObjectsRegister.txtEmail, "Tomcat" + time + "@gmail.com");
            Action.sendKeys(ObjectsRegister.txtPassword, "Tom09876");
            Action.click(ObjectsRegister.btnJetztRegistrieren);
        } catch (Exception e) {
            System.out.println("Could not fill up questionnaire " + e.getMessage());
        }
    }

}
