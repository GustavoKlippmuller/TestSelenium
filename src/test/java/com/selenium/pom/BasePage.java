package com.selenium.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.reflect.Field;
import java.time.Duration;

public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void waitForVisibility(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitToBeClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void clickWithWait(WebElement element) {
        waitToBeClickable(element);
        element.click();
    }

    public void sendKeysWithWait(WebElement element, String text) {
        waitForVisibility(element);
        element.clear();
        element.sendKeys(text);
    }

    public String getTextWithWait(WebElement element) {
        waitForVisibility(element);
        return element.getText();
    }

    public String getAttributeWithWait(WebElement element, String attribute) {
        waitForVisibility(element);
        return element.getDomAttribute(attribute);
    }

    public void waitForPresent(By locator) {
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public WebElement getElementByName(String name) {
        try {
            Field field = this.getClass().getDeclaredField(name);
            field.setAccessible(true);
            return (WebElement) field.get(this);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            System.out.println("Field " + name + " not found");
            return null;
        }
    }

    public boolean isElementPresent(String name) {
        WebElement element = getElementByName(name);
        try { return element != null && element.isDisplayed(); }
        catch (Exception e) { return false; }
    }

    public boolean isElementEnabled(String name) {
        WebElement element = getElementByName(name);
        try { return element != null && element.isEnabled(); }
        catch (Exception e) { return false; }
    }

    public String getTextFromElement(String name) {
        WebElement element = getElementByName(name);
        return element != null ? getTextWithWait(element) : "";
    }

    public String getAttributeFromElement(String name, String attribute) {
        WebElement element = getElementByName(name);
        return element != null ? getAttributeWithWait(element, attribute) : "";
    }
}
