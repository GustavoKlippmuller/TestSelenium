

package com.selenium.excercise2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.nio.file.Paths;

public class CssPathTest {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        String path = Paths.get("C:\\Users\\UMonteverde\\Desktop\\ejercicios java\\ejercicios selenium\\TestSelenium-main\\target\\classes\\findElements.html").toUri().toString();
        driver.get(path);
        inputNombreTest(driver);
        radioMasculinoTest(driver);
        radioFemeninoTest(driver);
        radioOtroTest(driver);
        radioPrefieroNoDecirloTest(driver);
        checkDeportesTest(driver);
        checkMusicaTest(driver);
        checkLecturaTest(driver);
        textareaComentariosTest(driver);
        btnAceptarTest(driver);
        btnAceptarTest(driver);
        driver.quit();


    }


    public static void checkDeportesTest(WebDriver driver){
        WebElement checkDeportes =  driver.findElement(By.cssSelector("#checkDeportes"));
        if(checkDeportes != null){
            System.out.println("El checkDeportes existe");
        }else {
            System.out.println("El checkDeportes NO existe");
        }
    }


    public static void textareaComentariosTest(WebDriver driver){
        WebElement textareaComentarios =  driver.findElement(By.cssSelector("#textareaComentarios"));
        if(textareaComentarios != null){
            System.out.println("El textareaComentarios existe");
        }else {
            System.out.println("El textareaComentarios NO existe");
        }
    }

    public static void checkMusicaTest(WebDriver driver){
        WebElement checkMusica =  driver.findElement(By.cssSelector("#checkMusica"));
        if(checkMusica != null){
            System.out.println("El checkMusica existe");
        }else {
            System.out.println("El checkMusica NO existe");
        }
    }


    public static void checkLecturaTest(WebDriver driver){
        WebElement checkLectura =  driver.findElement(By.cssSelector("#checkLectura"));
        if(checkLectura != null){
            System.out.println("El checkMusica existe");
        }else {
            System.out.println("El checkMusica NO existe");
        }
    }

    public static void radioFemeninoTest(WebDriver driver){
        WebElement radioFemenino =  driver.findElement(By.cssSelector("#radioFemenino"));
        if(radioFemenino != null){
            System.out.println("El radioFemenino existe");
        }else {
            System.out.println("El radioFemenino NO existe");
        }
    }

    public static void radioMasculinoTest(WebDriver driver){
        WebElement radioMasculino =  driver.findElement(By.cssSelector("#radioMasculino"));
        if(radioMasculino != null){
            System.out.println("El radioMasculino existe");
        }else {
            System.out.println("El radioMasculino NO existe");
        }
    }

    public static void inputNombreTest(WebDriver driver){
        WebElement inputNombre =  driver.findElement(By.cssSelector("#inputNombre"));
        if(inputNombre != null){
            System.out.println("El inputNombre existe");
        }else {
            System.out.println("El inputNombre NO existe");
        }
    }

    public static void radioOtroTest(WebDriver driver){
        WebElement radioOtro =  driver.findElement(By.cssSelector("#radioOtro"));
        if(radioOtro != null){
            System.out.println("El radioOtro existe");
        }else {
            System.out.println("El radioOtro NO existe");
        }
    }


    public static void radioPrefieroNoDecirloTest(WebDriver driver){
        WebElement radioPrefieroNoDecirlo =  driver.findElement(By.cssSelector("#radioPrefieroNoDecirlo"));
        if(radioPrefieroNoDecirlo != null){
            System.out.println("El radioPrefieroNoDecirlo existe");
        }else {
            System.out.println("El radioPrefieroNoDecirlo NO existe");
        }
    }


    public static void btnAceptarTest(WebDriver driver){
        WebElement btnAceptar =  driver.findElement(By.cssSelector("#btnAceptar"));
        if(btnAceptar != null){
            System.out.println("El btnAceptar existe");
        }else {
            System.out.println("El btnAceptar NO existe");
        }
    }


    public static void btnCancelar(WebDriver driver){
        WebElement btnCancelar =  driver.findElement(By.cssSelector("#btnCancelar"));
        if(btnCancelar != null){
            System.out.println("El btnCancelar existe");
        }else {
            System.out.println("El btnCancelar NO existe");
        }
    }
}