import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestCssSelectors {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-infobars");

        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
//        options.setPageLoadTimeout(Duration.ofSeconds(30));

        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.get("https://creativemarket.com/");

    }

    @Test
    public void classSelecotr() {
        //Selects elements based on their class attribute.
        //Example: .my-class selects all elements with class="my-class".

        wait.until(ExpectedConditions.elementToBeClickable(driver
                .findElement(By.cssSelector("li.trending-category--fonts")))).click();

    }

    @Test
    public void idSelecotr() {
        //ID Selector: Selects elements based on their id attribute.
        //Example: #my-id selects the element with id="my-id".
        wait.until(ExpectedConditions.elementToBeClickable(driver
                        .findElement(By.cssSelector("section#popular-graphics [data-description='Chroma Grainy Gradient Textures by kuro on @creativemarket']"))))
                .click();
    }

    @Test
    public void descendentSelector() {
        //Descendant Selector ( or a space) selects all descendants of an element, including its children, grandchildren, and so on.
        List<WebElement> list = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.
                cssSelector("section#trending-categories li")));

        System.out.println("List of Descendent Elements");
        for (WebElement element : list) {
            System.out.println(element.getText());
        }
    }

    @Test
    public void childSelector() {
        //The Child Selector (>) selects only the direct children of an element.
        List<WebElement> elements = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.
                cssSelector("section#trending-categories > div > ul > li")));

        System.out.println("List of Child Elements");
        for (WebElement element : elements) {
            System.out.println(element.getText());
        }
    }

    @Test
    public void adjecnetSiblingSelector() {
        //Adjacent Sibling Selector: Selects the element that comes immediately after another element.
        //Example: h2 + p selects the first <p> element that comes immediately after an <h2> element.

        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By
                .cssSelector("li.trending-category--fonts + li")));

        System.out.println("adjecnt Siblings: " + element.getText());
    }

    @Test
    public void generalSiblingSelector() {
        //General Sibling Selector: Selects all elements that come after another element.
        //Example: h2 ~ p selects all <p> elements that come after an <h2> element.

        List<WebElement> elements = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("li.trending-category--fonts ~ li")));

        System.out.println("List of General Sibling Elements Elements");
        for (WebElement element : elements) {
            System.out.println(element.getText());
        }
    }

    @Test
    public void nthChild() {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By
                .cssSelector("section#trending-categories li:nth-child(3)")));

        System.out.println(":nth-child(3) " + element.getText());
    }

    @AfterClass
    public void close() throws InterruptedException {
        driver.quit();
    }
}
