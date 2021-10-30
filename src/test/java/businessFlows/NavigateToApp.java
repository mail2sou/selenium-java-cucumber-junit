package businessFlows;

import objects.ObjectsNavigateToApp;
import step_definitions.Hooks;
import util.Action;

public class NavigateToApp extends Hooks {
    public static String app;

//    Below method helps the user navigate to the right app
    public void navigateToApp(String appName) {
        try {
            app = appName;
            Action.explicitWaitTobeVisible(ObjectsNavigateToApp.lnkAppName);
            Action.click(ObjectsNavigateToApp.lnkAppName);
            Action.explicitWaitTobeVisible(ObjectsNavigateToApp.btnJetztStarten);
            Action.click(ObjectsNavigateToApp.btnJetztStarten);
        } catch (Exception e) {
            System.out.println("Could not navigate to the app: " + e.getMessage());
        }
    }
}
