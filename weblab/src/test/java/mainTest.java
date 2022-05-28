import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class mainTest {
    /*@Test
    public void x(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        WebElement form = driver.findElement(By.id("checkboxes"));
        List<WebElement> checks = form.findElements(By.tagName("input"));
        checks.get(0).click();
        checks.get(1).click();
        assertTrue(checks.get(0).isSelected());
        assertFalse(checks.get(1).isSelected());
        checks.get(0).click();
        checks.get(1).click();
        assertFalse(checks.get(0).isSelected());
        assertTrue(checks.get(1).isSelected());

    }*/
    @Test
    public void test() {
        //System.setProperty("webdriver.chrome.driver", "resources/windows/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/form");
        WebElement fn = driver.findElement(By.cssSelector("#first-name"));
        WebElement ln = driver.findElement(By.cssSelector("#last-name"));
        WebElement job = driver.findElement(By.cssSelector("#job-title"));
        WebElement hl = driver.findElement(By.cssSelector("#radio-button-2"));
        fn.sendKeys("Omar");
        ln.sendKeys("Alsayed");
        job.sendKeys("Engineer");
        hl.click();
        assertEquals(fn.getAttribute("value"),"Omar");
        assertEquals(ln.getAttribute("value"),"Alsayed");
        assertEquals(job.getAttribute("value"),"Engineer");
        assertTrue(hl.isSelected());
    }

}