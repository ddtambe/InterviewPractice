package selenium_basics;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.security.KeyStoreException;
import java.time.Duration;

public class TestActionClass {
    WebDriver driver;
    WebDriverWait wait;

    Actions action;
    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-infobars");

        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
//        options.setPageLoadTimeout(Duration.ofSeconds(30));

        driver = new ChromeDriver(options);

        action = new Actions(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.get("https://creativemarket.com/");

    }
    public void actionClass(){
        WebElement logo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a.upper-nav__logo")));
        WebElement outdoor = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[href='/search/outdoor']")));
        WebElement src = null, dest = null;
        action = new Actions(driver);

        action.contextClick(outdoor).build().perform();//For right click
        action.doubleClick(logo).build().perform(); // Double Click
        action.moveToElement(outdoor).build().perform(); //Move mouse arrow to element
        action.dragAndDrop(src, dest).build().perform(); // Drag and drop operation
        action.dragAndDropBy(logo, 100, 100); // Drag and drop element to particular x and y axis
        action.moveByOffset(100, 100); // Move the mouse cursor
        action.scrollByAmount(100,0); //scroll to X and Y amount
        action.keyDown(Keys.SHIFT).sendKeys("a").perform(); //Keyboard operation
        action.sendKeys("dev_endra").perform(); // Sends key
    }

    public void robotclass() throws AWTException {
        Robot robot = new Robot();
        robot.mouseMove(25, 25); // Move mouse and x and y axis
        robot.keyPress(KeyEvent.VK_Q); // Pressing key
        robot.keyRelease(KeyEvent.VK_Q);// releasing key
        robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK); // Mouse Left Click
        robot.mousePress(MouseEvent.BUTTON2_DOWN_MASK); // Mouse Middle Click
        robot.mousePress(MouseEvent.BUTTON3_DOWN_MASK); // Mouse Right Click
        robot.getPixelColor(12, 12);
    }
}
