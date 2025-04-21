package com.selenium.exercise1;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.Paths;

public class FindByIdTest {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String path = Paths.get("src/main/resources/findElements.html").toUri().toString();
        driver.get(path);

        validateInputNombre(driver);
        validateRadioMasculino(driver);
        validateRadioFemenino(driver);
        validateRadioOtro(driver);
        validateRadioPrefieroNoDecirlo(driver);
        validateCheckDeportes(driver);
        validateCheckMusica(driver);
        validateCheckLectura(driver);
        validateTextareaComentarios(driver);
        validateBtnAceptar(driver);
        validateBtnCancelar(driver);

        driver.quit();
    }

    public static void validateInputNombre(WebDriver driver) {
        try {
            driver.findElement(By.id("inputNombre"));
            System.out.println("El elemento inputNombre está presente");
        } catch (NoSuchElementException e) {
            System.out.println("El elemento inputNombre NO está presente");
        }
    }

    public static void validateRadioMasculino(WebDriver driver) {
        try {
            driver.findElement(By.id("radioMasculino"));
            System.out.println("El elemento radioMasculino está presente");
        } catch (NoSuchElementException e) {
            System.out.println("El elemento radioMasculino NO está presente");
        }
    }

    public static void validateRadioFemenino(WebDriver driver) {
        try {
            driver.findElement(By.id("radioFemenino"));
            System.out.println("El elemento radioFemenino está presente");
        } catch (NoSuchElementException e) {
            System.out.println("El elemento radioFemenino NO está presente");
        }
    }

    public static void validateRadioOtro(WebDriver driver) {
        try {
            driver.findElement(By.id("radioOtro"));
            System.out.println("El elemento radioOtro está presente");
        } catch (NoSuchElementException e) {
            System.out.println("El elemento radioOtro NO está presente");
        }
    }

    public static void validateRadioPrefieroNoDecirlo(WebDriver driver) {
        try {
            driver.findElement(By.id("radioPrefieroNoDecirlo"));
            System.out.println("El elemento radioPrefieroNoDecirlo está presente");
        } catch (NoSuchElementException e) {
            System.out.println("El elemento radioPrefieroNoDecirlo NO está presente");
        }
    }

    public static void validateCheckDeportes(WebDriver driver) {
        try {
            driver.findElement(By.id("checkDeportes"));
            System.out.println("El elemento checkDeportes está presente");
        } catch (NoSuchElementException e) {
            System.out.println("El elemento checkDeportes NO está presente");
        }
    }

    public static void validateCheckMusica(WebDriver driver) {
        try {
            driver.findElement(By.id("checkMusica"));
            System.out.println("El elemento checkMusica está presente");
        } catch (NoSuchElementException e) {
            System.out.println("El elemento checkMusica NO está presente");
        }
    }

    public static void validateCheckLectura(WebDriver driver) {
        try {
            driver.findElement(By.id("checkLectura"));
            System.out.println("El elemento checkLectura está presente");
        } catch (NoSuchElementException e) {
            System.out.println("El elemento checkLectura NO está presente");
        }
    }

    public static void validateTextareaComentarios(WebDriver driver) {
        try {
            driver.findElement(By.id("textareaComentarios"));
            System.out.println("El elemento textareaComentarios está presente");
        } catch (NoSuchElementException e) {
            System.out.println("El elemento textareaComentarios NO está presente");
        }
    }

    public static void validateBtnAceptar(WebDriver driver) {
        try {
            driver.findElement(By.id("btnAceptar"));
            System.out.println("El elemento btnAceptar está presente");
        } catch (NoSuchElementException e) {
            System.out.println("El elemento btnAceptar NO está presente");
        }
    }

    public static void validateBtnCancelar(WebDriver driver) {
        try {
            driver.findElement(By.id("btnCancelar"));
            System.out.println("El elemento btnCancelar está presente");
        } catch (NoSuchElementException e) {
            System.out.println("El elemento btnCancelar NO está presente");
        }
    }
}
