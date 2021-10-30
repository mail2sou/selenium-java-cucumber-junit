package step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class Hooks {
    public static WebDriver driver;
    private final Properties property = new Properties();

    @Before
    public void baseCapabilities() throws IOException {
        FileInputStream fis;
        //select the OS and read the config file to choose browser
        if (System.getProperty("os.name").toLowerCase().contains("win")) {
            fis = new FileInputStream(System.getProperty("user.dir") + "\\config\\config.properties");
        } else {
            fis = new FileInputStream(System.getProperty("user.dir") + "/config/config.properties");
        }
        property.load(fis);
        //browser configuration setup
        if (property.getProperty("browser").equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.setExperimentalOption("useAutomationExtension", false);
            options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
            Map<String, Object> prefs = new HashMap<String, Object>();
            prefs.put("credentials_enable_service", false);
            prefs.put("profile.password_manager_enabled", false);
            options.setExperimentalOption("prefs", prefs);
            driver = new ChromeDriver(options);
            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();
        } else if (property.getProperty("browser").equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            FirefoxOptions options = new FirefoxOptions();
            driver = new FirefoxDriver(options);
            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();
        } else if (property.getProperty("browser").equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            EdgeOptions options = new EdgeOptions();
            driver = new EdgeDriver(options);
            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();
        } else {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.setExperimentalOption("useAutomationExtension", false);
            options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
            Map<String, Object> prefs = new HashMap<String, Object>();
            prefs.put("credentials_enable_service", false);
            prefs.put("profile.password_manager_enabled", false);
            options.setExperimentalOption("prefs", prefs);
            driver = new ChromeDriver(options);
            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();
        }
    }

    @After
    public void driverQuit(Scenario scenario) {
        //method to take failed screenshot
        if (scenario.isFailed()) {
            System.out.println("Scenario failed, taking screenShot which will be attached to the cucumber report");
            TakesScreenshot ts = (TakesScreenshot) driver;
            byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Failed Screenshot");
        }
        if (driver != null)
            driver.quit();
    }
}
