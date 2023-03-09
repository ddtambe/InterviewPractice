package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class TestCheckBox {
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
    public void checkBoxSelection(){
        List<WebElement> elements = driver
                .findElements(By
                .cssSelector("div.multiselect__content-wrapper[style='max-height:420px;display:none;'] > ul > li > span > span"));
        System.out.println("Checkboxes");
        int i=1;
        System.out.println(elements.size());
        for(WebElement element : elements){
            System.out.println((i++)+element.getAttribute("title"));
            element.click();
        }
        System.out.println("Finish");
        driver.quit();
    }
}
