package com.selenium.exercise2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.NoSuchElementException;

import java.nio.file.Paths;

public class FindByCssSelectorTest {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String path = Paths.get("src/main/resources/findElements.html").toUri().toString();
        driver.get(path);

        validarInputNombre(driver);
        validarRadioMasculino(driver);
        validarRadioFemenino(driver);
        validarRadioOtro(driver);
        validarRadioPrefieroNoDecirlo(driver);
        validarCheckDeportes(driver);
        validarCheckMusica(driver);
        validarCheckLectura(driver);
        validarTextareaComentarios(driver);
        validarBtnAceptar(driver);
        validarBtnCancelar(driver);

        driver.quit();
    }

    public static void validarInputNombre(WebDriver driver) {
        try {
            driver.findElement(By.cssSelector("#inputNombre"));
            System.out.println("El elemento inputNombre está presente");
        } catch (NoSuchElementException e) {
            System.out.println("El elemento inputNombre NO está presente");
        }
    }

    public static void validarRadioMasculino(WebDriver driver) {
        try {
            driver.findElement(By.cssSelector("#radioMasculino"));
            System.out.println("El elemento radioMasculino está presente");
        } catch (NoSuchElementException e) {
            System.out.println("El elemento radioMasculino NO está presente");
        }
    }

    public static void validarRadioFemenino(WebDriver driver) {
        try {
            driver.findElement(By.cssSelector("#radioFemenino"));
            System.out.println("El elemento radioFemenino está presente");
        } catch (NoSuchElementException e) {
            System.out.println("El elemento radioFemenino NO está presente");
        }
    }

    public static void validarRadioOtro(WebDriver driver) {
        try {
            driver.findElement(By.cssSelector("#radioOtro"));
            System.out.println("El elemento radioOtro está presente");
        } catch (NoSuchElementException e) {
            System.out.println("El elemento radioOtro NO está presente");
        }
    }

    public static void validarRadioPrefieroNoDecirlo(WebDriver driver) {
        try {
            driver.findElement(By.cssSelector("#radioPrefieroNoDecirlo"));
            System.out.println("El elemento radioPrefieroNoDecirlo está presente");
        } catch (NoSuchElementException e) {
            System.out.println("El elemento radioPrefieroNoDecirlo NO está presente");
        }
    }

    public static void validarCheckDeportes(WebDriver driver) {
        try {
            driver.findElement(By.cssSelector("#checkDeportes"));
            System.out.println("El elemento checkDeportes está presente");
        } catch (NoSuchElementException e) {
            System.out.println("El elemento checkDeportes NO está presente");
        }
    }

    public static void validarCheckMusica(WebDriver driver) {
        try {
            driver.findElement(By.cssSelector("#checkMusica"));
            System.out.println("El elemento checkMusica está presente");
        } catch (NoSuchElementException e) {
            System.out.println("El elemento checkMusica NO está presente");
        }
    }

    public static void validarCheckLectura(WebDriver driver) {
        try {
            driver.findElement(By.cssSelector("#checkLectura"));
            System.out.println("El elemento checkLectura está presente");
        } catch (NoSuchElementException e) {
            System.out.println("El elemento checkLectura NO está presente");
        }
    }

    public static void validarTextareaComentarios(WebDriver driver) {
        try {
            driver.findElement(By.cssSelector("#textareaComentarios"));
            System.out.println("El elemento textareaComentarios está presente");
        } catch (NoSuchElementException e) {
            System.out.println("El elemento textareaComentarios NO está presente");
        }
    }

    public static void validarBtnAceptar(WebDriver driver) {
        try {
            driver.findElement(By.cssSelector("#btnAceptar"));
            System.out.println("El elemento btnAceptar está presente");
        } catch (NoSuchElementException e) {
            System.out.println("El elemento btnAceptar NO está presente");
        }
    }

    public static void validarBtnCancelar(WebDriver driver) {
        try {
            driver.findElement(By.cssSelector("#btn\\ Cancelar")); // porque el ID tiene un espacio
            System.out.println("El elemento btnCancelar está presente");
        } catch (NoSuchElementException e) {
            System.out.println("El elemento btnCancelar NO está presente");
        }
    }
}
