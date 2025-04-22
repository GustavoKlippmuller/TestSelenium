package com.selenium.exercise2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.nio.file.Paths;

public class FindByCssSelectorTest {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        String path = Paths.get("src/main/resources/findElements.html").toUri().toString();
        driver.get(path);

        validateElementByCssSelector(driver, "#inputNombre");
        validateElementByCssSelector(driver, "#radioMasculino");
        validateElementByCssSelector(driver, "#radioFemenino");
        validateElementByCssSelector(driver, "#radioOtro");
        validateElementByCssSelector(driver, "#radioPrefieroNoDecirlo");
        validateElementByCssSelector(driver, "#checkDeportes");
        validateElementByCssSelector(driver, "#checkMusica");
        validateElementByCssSelector(driver, "#checkLectura");
        validateElementByCssSelector(driver, "#textareaComentarios");
        validateElementByCssSelector(driver, "#btnAceptar");
        validateElementByCssSelector(driver, "#btnCancelar");


        driver.quit();

    }

    private static void validateElementByCssSelector(WebDriver driver, String selector) {
        WebElement element = driver.findElement(By.cssSelector(selector));
        if (element != null)
            System.out.println("El elemento '" + selector + "' está presente");
        else
            System.out.println("El elemento '" + selector + "' NO está presente");
    }
}
