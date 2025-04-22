package com.selenium.exercise1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.nio.file.Paths;

public class FindByIdTest {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        String path = Paths.get("src/main/resources/findElements.html").toUri().toString();
        driver.get(path);

        validateElementById(driver, "inputNombre");
        validateElementById(driver, "radioMasculino");
        validateElementById(driver, "radioFemenino");
        validateElementById(driver, "radioOtro");
        validateElementById(driver, "radioPrefieroNoDecirlo");
        validateElementById(driver, "checkDeportes");
        validateElementById(driver, "checkMusica");
        validateElementById(driver, "checkLectura");
        validateElementById(driver, "textareaComentarios");
        validateElementById(driver, "btnAceptar");
        validateElementById(driver, "btnCancelar");


        driver.quit();

    }

    private static void validateElementById(WebDriver driver, String id) {
        WebElement element = driver.findElement(By.id(id));
        if (element != null)
            System.out.println("El elemento '" + id + "' está presente");
        else
            System.out.println("El elemento '" + id + "' NO está presente");
    }
}
