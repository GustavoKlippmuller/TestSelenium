package com.selenium.exercise4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.Paths;

public class UseXPath {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String path = Paths.get("src/main/resources/useXPATH.html").toUri().toString();
        driver.get(path);


        validateByXPath(driver, "//input[@id='inputNombre']", "inputNombre");
        validateByXPath(driver, "//input[@id='radioMasculino']", "radioMasculino");
        validateByXPath(driver, "//input[@id='radioFemenino']", "radioFemenino");
        validateByXPath(driver, "//input[@id='radioOtro']", "radioOtro");
        validateByXPath(driver, "//input[@id='radioPrefieroNoDecirlo']", "radioPrefieroNoDecirlo");
        validateByXPath(driver, "//input[@id='checkDeportes']", "checkDeportes");
        validateByXPath(driver, "//input[@id='checkMusica']", "checkMusica");
        validateByXPath(driver, "//input[@id='checkLectura']", "checkLectura");
        validateByXPath(driver, "//textarea[@id='textareaComentarios']", "textareaComentarios");
        validateByXPath(driver, "//button[@id='btnAceptar']", "btnAceptar");
        validateByXPath(driver, "//button[@id='btnCancelar']", "btnCancelar");

        driver.quit();
    }

    public static void validateByXPath(WebDriver driver, String xpath, String elementName) {
        try {
            WebElement element = driver.findElement(By.xpath(xpath));
            if (element != null) {
                System.out.println("El elemento '" + elementName + "' está presente");
            }
        } catch (Exception e) {
            System.out.println("El elemento '" + elementName + "' NO está presente");
        }
    }
}
