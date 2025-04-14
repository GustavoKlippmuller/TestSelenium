package com.selenium.excercise3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.nio.file.Paths;

public class XPathTest {
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
        btnCancelarTest(driver);
        driver.quit();

    }

    public static void inputNombreTest(WebDriver driver){
        WebElement inputNombre = driver.findElement(By.xpath("//input[@id='inputNombre']"));
        if(inputNombre != null){
            System.out.println("El elemento InputNombre existe");
        }else{
            System.out.println("El elemento InputNombre no existe");
        }
    }

    public static void radioMasculinoTest(WebDriver driver){
        WebElement radioMasculino = driver.findElement(By.xpath("//input[@id='radioMasculino']"));
        if(radioMasculino != null){
            System.out.println("El elemento radioMasculino existe");
        }else{
            System.out.println("El elemento radioMasculino no existe");
        }
    }


    public static void radioFemeninoTest(WebDriver driver){
        WebElement radioFemenino = driver.findElement(By.xpath("//input[@id='radioFemenino']"));
        if(radioFemenino != null){
            System.out.println("El elemento radioFemenino existe");
        }else{
            System.out.println("El elemento radioFemenino no existe");
        }
    }



    public static void radioOtroTest(WebDriver driver){
        WebElement radioOtro = driver.findElement(By.xpath("//input[@id='radioOtro']"));
        if(radioOtro != null){
            System.out.println("El elemento radioOtro existe");
        }else{
            System.out.println("El elemento radioOtro no existe");
        }
    }



    public static void radioPrefieroNoDecirloTest(WebDriver driver){
        WebElement radioPrefieroNoDecirlo = driver.findElement(By.xpath("//input[@id='radioPrefieroNoDecirlo']"));
        if(radioPrefieroNoDecirlo != null){
            System.out.println("El elemento radioPrefieroNoDecirlo existe");
        }else{
            System.out.println("El elemento radioPrefieroNoDecirlo no existe");
        }
    }


    public static void checkDeportesTest(WebDriver driver){
        WebElement checkDeportes = driver.findElement(By.xpath("//input[@id='checkDeportes']"));
        if(checkDeportes != null){
            System.out.println("El elemento checkDeportes existe");
        }else{
            System.out.println("El elemento checkDeportes no existe");
        }
    }


    public static void checkMusicaTest(WebDriver driver){
        WebElement checkMusica = driver.findElement(By.xpath("//input[@id='checkMusica']"));
        if(checkMusica != null){
            System.out.println("El elemento checkMusica existe");
        }else{
            System.out.println("El elemento checkMusica no existe");
        }
    }


    public static void checkLecturaTest(WebDriver driver){
        WebElement checkLectura = driver.findElement(By.xpath("//input[@id='checkLectura']"));
        if(checkLectura != null){
            System.out.println("El elemento checkLectura existe");
        }else{
            System.out.println("El elemento checkLectura no existe");
        }
    }


    public static void textareaComentariosTest(WebDriver driver){
        WebElement textareaComentarios = driver.findElement(By.xpath("//textarea[@id='textareaComentarios']"));
        if(textareaComentarios != null){
            System.out.println("El elemento textareaComentarios existe");
        }else{
            System.out.println("El elemento textareaComentarios no existe");
        }
    }


    public static void btnAceptarTest(WebDriver driver){
        WebElement btnAceptar = driver.findElement(By.xpath("//button[@id='btnAceptar']"));
        if(btnAceptar != null){
            System.out.println("El elemento btnAceptar existe");
        }else{
            System.out.println("El elemento btnAceptar no existe");
        }
    }

    public static void btnCancelarTest(WebDriver driver){
        WebElement btnCancelar = driver.findElement(By.xpath("//button[@id='btnCancelar']"));
        if(btnCancelar != null){
            System.out.println("El elemento btnCancelar existe");
        }else{
            System.out.println("El elemento btnCancelar no existe");
        }
    }
}
