package util;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import step_definitions.Hooks;

import java.util.Iterator;
import java.util.Set;

public class Action extends Hooks {

    public static boolean isElementDisplayed(By ele) {

        boolean flag = true;
        try {

            flag = driver.findElement(ele).isDisplayed();
            Action.highlight(ele);

        } catch (Exception e) {
            flag = false;
        }

        return flag;

    }

    public static void click(By ele) {

        try {
            driver.findElement(ele).click();
            Action.highlight(ele);
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

    }

    public static int getSizeEle(By ele) {
        int elesize = 0;
        try {
            elesize = driver.findElements(ele).size();
            Action.highlight(ele);
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
        return elesize;

    }

    public static String getTextEle(By ele) {

        String textele = "";
        try {
            textele = driver.findElement(ele).getText();
            Action.highlight(ele);
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
        return textele;

    }

    public static String getAttri(By ele, String str) {

        String textattri = null;
        try {
            textattri = driver.findElement(ele).getAttribute(str);
            Action.highlight(ele);
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
        return textattri;

    }

    public static void jsClick(By ele) {

        WebElement element = driver.findElement(ele);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("argument[0].click;", element);
        Action.highlight(ele);

    }

    public static void clear(By ele) {

        try {
            driver.findElement(ele).clear();
            Action.highlight(ele);
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }

    public static void sendKeys(By ele, String string) {

        try {
            driver.findElement(ele).sendKeys(string);
            Action.highlight(ele);
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }

    public static void explicitWaitElementToBeClickable(By ele) {

        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(ele));
        Action.highlight(ele);

    }


    public static void explicitWaitTobeVisible(By ele) {

        WebDriverWait wait = new WebDriverWait(driver, 40);
        wait.until(ExpectedConditions.visibilityOfElementLocated(ele));
        Action.highlight(ele);
    }

    public static void explicitWaitTobeVisible_PollingStale(By ele) {

        int i = 0;
        for (int retry = 0; i <= 5; i++) {

            try {
                WebDriverWait wait = new WebDriverWait(driver, 30);
                WebElement elem = driver.findElement(ele);
                wait.until(ExpectedConditions.visibilityOf(elem));
                Action.highlight(ele);
            } catch (StaleElementReferenceException e) {

                System.out.println(e.toString());
            }

        }

    }

    public static void highlight(By ele) {

        JavascriptExecutor jse = (JavascriptExecutor) driver;

        WebElement elem = driver.findElement(ele);

        jse.executeScript("arguments[0].setAttribute('style','background : yellow;border: 2px solid red;');", elem);

        try {

            Thread.sleep(750);

        } catch (InterruptedException e) {

            System.out.println(e.getMessage());
        }

        jse.executeScript("arguments[0].setAttribute('style','border : solid 2px white')", elem);

    }

    public static void switchWindowFirstTab() {
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> i1 = s1.iterator();
        String mainWindow = i1.next();
        System.out.println("Main Window is" + mainWindow);
        driver.switchTo().window(mainWindow);
//		driver.close();
    }

    public static void switchWindowSecondTab() {
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> i1 = s1.iterator();
        String mainWindow = i1.next();
        String ChildWindw = i1.next();
        System.out.println("Child Window is" + ChildWindw);
//		driver.close();
        driver.switchTo().window(ChildWindw);
    }

    public static void navigateToURL(String URL) {

        try {
            driver.get(URL);

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

    }

    public static void acceptAlert() {

        try {

            Alert alert = driver.switchTo().alert();
            alert.accept();

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

    }

    public static void arrowDown(By ele) {

        WebElement elem = driver.findElement(ele);

        elem.sendKeys(Keys.ARROW_DOWN);

    }

    public static void arrowUp() {

        Actions act = new Actions(driver);
        act.sendKeys(Keys.ARROW_UP).build().perform();

    }

    public static void arrowDwn() {

        Actions act = new Actions(driver);
        act.sendKeys(Keys.ARROW_DOWN).build().perform();

    }

    public static void pageUp() {
        Actions act = new Actions(driver);
        act.sendKeys(Keys.PAGE_UP).build().perform();
    }

    public static void pressEnter() {

        Actions act = new Actions(driver);
        act.sendKeys(Keys.ENTER).build().perform();

    }

    public static void explicitWaitElementToBeClickable_SoftAssert(By ele) {

        try {
            WebDriverWait wait = new WebDriverWait(driver, 50);
            wait.until(ExpectedConditions.elementToBeClickable(ele));
            Action.highlight(ele);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static String getPageTitle() {
        String pageTitle = null;
        try {
            pageTitle = driver.getTitle();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return pageTitle;
    }
}
