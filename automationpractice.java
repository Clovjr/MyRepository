package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Automationpractice {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://automationpractice.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testAutomationpractice() throws Exception {
    driver.get("http://automationpractice.com/index.php?");
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (driver.findElement(By.xpath("//div[6]/ul/li[3]/a")).isDisplayed()) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.xpath("//div[6]/ul/li[3]/a")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (driver.findElement(By.xpath("//li/div/div/div/a/img")).isDisplayed()) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.xpath("//li/div/div/div/a/img")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (driver.findElement(By.xpath("//div[3]/div/p/button")).isDisplayed()) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.xpath("//div[3]/div/p/button")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (driver.findElement(By.xpath("//div[4]/a/span")).isDisplayed()) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.xpath("//div[4]/a/span")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (driver.findElement(By.xpath("//h1/span/span")).isDisplayed()) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    assertEquals("1 Product", driver.findElement(By.xpath("//h1/span/span")).getText());
    driver.findElement(By.xpath("//div[3]/div/p[2]/a/span")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (driver.findElement(By.xpath("//div[2]/input")).isDisplayed()) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    // ERROR: Caught exception [ERROR: Unsupported command [getEval |  | ]]
    driver.findElement(By.xpath("//div[2]/input")).clear();
    driver.findElement(By.xpath("//div[2]/input")).sendKeys(email);
    driver.findElement(By.xpath("//div[3]/button")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (driver.findElement(By.id("id_gender1")).isDisplayed()) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.id("id_gender1")).click();
    driver.findElement(By.xpath("//div[2]/input")).clear();
    driver.findElement(By.xpath("//div[2]/input")).sendKeys("automation");
    driver.findElement(By.xpath("//div[3]/input")).clear();
    driver.findElement(By.xpath("//div[3]/input")).sendKeys("practice");
    driver.findElement(By.xpath("//div[5]/input")).clear();
    driver.findElement(By.xpath("//div[5]/input")).sendKeys("automationpractice");
    driver.findElement(By.xpath("//p/input")).clear();
    driver.findElement(By.xpath("//p/input")).sendKeys("automation");
    driver.findElement(By.xpath("//p[2]/input")).clear();
    driver.findElement(By.xpath("//p[2]/input")).sendKeys("practice");
    driver.findElement(By.xpath("//p[4]/input")).clear();
    driver.findElement(By.xpath("//p[4]/input")).sendKeys("Street");
    driver.findElement(By.xpath("//p[6]/input")).clear();
    driver.findElement(By.xpath("//p[6]/input")).sendKeys("City");
    new Select(driver.findElement(By.xpath("//select[@id='id_state']"))).selectByIndex(5);
    driver.findElement(By.xpath("//p[8]/input")).clear();
    driver.findElement(By.xpath("//p[8]/input")).sendKeys("00000");
    driver.findElement(By.xpath("//p[13]/input")).clear();
    driver.findElement(By.xpath("//p[13]/input")).sendKeys("202-555-0168");
    driver.findElement(By.xpath("//div[4]/button")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (driver.findElement(By.xpath("//div[2]/div/ul/li[2]")).isDisplayed()) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    assertEquals("automation practice", driver.findElement(By.xpath("//div[2]/div/ul/li[2]")).getText());
    assertEquals("Street", driver.findElement(By.xpath("//div[2]/div/ul/li[3]")).getText());
    assertEquals("City, California 00000", driver.findElement(By.xpath("//div[2]/div/ul/li[4]")).getText());
    assertEquals("United States", driver.findElement(By.xpath("//div[2]/div/ul/li[5]")).getText());
    assertEquals("202-555-0168", driver.findElement(By.xpath("//li[6]")).getText());
    driver.findElement(By.xpath("//p/button")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (driver.findElement(By.xpath("//p[2]/div/span/input")).isDisplayed()) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.xpath("//p[2]/div/span/input")).click();
    driver.findElement(By.xpath("//p/button")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (driver.findElement(By.xpath("//td/span")).isDisplayed()) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    assertEquals("$18.51", driver.findElement(By.xpath("//td[2]/span")).getText());
    driver.findElement(By.xpath("//div[3]/div/div/p/a")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (driver.findElement(By.xpath("//p/button")).isDisplayed()) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.xpath("//p/button")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (driver.findElement(By.xpath("//div[3]/div/p/a")).isDisplayed()) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    assertEquals("Your order on My Store is complete.", driver.findElement(By.xpath("//p/strong")).getText());
    driver.findElement(By.xpath("//div[2]/a")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
