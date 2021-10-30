package businessFlows;

import objects.ObjectsHome;
import org.junit.Test;
import step_definitions.Hooks;
import util.Action;

import java.io.FileInputStream;
import java.util.Properties;

public class Home extends Hooks {
    public static Properties property = new Properties();
    public static FileInputStream fis;

    //select the OS and read the global properties file to load it
    @Test
    public static void loadPropertyFile() {
        try {
            if (System.getProperty("os.name").toLowerCase().contains("win")) {
                fis = new FileInputStream(System.getProperty("user.dir") + "\\GlobalProperties.properties");
            } else {
                fis = new FileInputStream(System.getProperty("user.dir") + "/GlobalProperties.properties");
            }
            property.load(fis);
        } catch (Exception e) {
            System.out.println("Could not load property file: " + e.getMessage());
        }

    }

//    Below method helps the user navigate to the home page
    @Test
    public void navigateToHome() {
        try {
            //call loadPropertyFile() to load properties
            loadPropertyFile();
            String env = property.getProperty("Env");
            //navigate to the home page (start page)
            Action.navigateToURL(env);
            Action.explicitWaitTobeVisible(ObjectsHome.btnPopUp);
            Action.click(ObjectsHome.btnPopUp);
        } catch (Exception e) {
            System.out.println("Could not navigate to start page: " + e.getMessage());
        }
    }
}
