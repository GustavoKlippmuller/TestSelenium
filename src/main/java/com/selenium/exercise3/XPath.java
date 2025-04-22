package com.selenium.exercise3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.nio.file.Paths;

public class XPath {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();

        String path = Paths.get("src/main/resources/findElements.html").toUri().toString();
        driver.get(path);

        validateElementByXPath(driver, "//*[@id='inputNombre']");
        validateElementByXPath(driver, "//*[@id='radioMasculino']");
        validateElementByXPath(driver, "//*[@id='radioFemenino']");
        validateElementByXPath(driver, "//*[@id='radioOtro']");
        validateElementByXPath(driver, "//*[@id='radioPrefieroNoDecirlo']");
        validateElementByXPath(driver, "//*[@id='checkDeportes']");
        validateElementByXPath(driver, "//*[@id='checkMusica']");
        validateElementByXPath(driver, "//*[@id='checkLectura']");
        validateElementByXPath(driver, "//*[@id='textareaComentarios']");
        validateElementByXPath(driver, "//*[@id='btnAceptar']");
        validateElementByXPath(driver, "//*[@id='btnCancelar']");

        driver.quit();
    }

    private static void validateElementByXPath(WebDriver driver, String xpath) {
        WebElement element = driver.findElement(By.xpath(xpath));
        if (element != null)
            System.out.println("El elemento con XPath '" + xpath + "' está presente");
        else
            System.out.println("El elemento con XPath '" + xpath + "' NO está presente");
    }
}
