package com.selenium.excercise1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.Paths;

public class FindByIdTest {
    private static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        String path = Paths.get("C:\\Users\\UMonteverde\\Desktop\\ejercicios java\\ejercicios selenium\\TestSelenium-main\\target\\classes\\findElements.html").toUri().toString();
        driver.get(path);
        radioMasculinoTest(driver);
        inputNombreTest(driver);
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

    public static void radioPrefieroNoDecirloTest(WebDriver driver){
        WebElement radioPrefieroNoDecirlo = driver.findElement(By.id("radioPrefieroNoDecirlo"));
        if(radioPrefieroNoDecirlo!=null){
            System.out.println("El elemento radioPrefieroNoDecirlo existe");
        }else{
            System.out.println("El elemento radioPrefieroNoDecirlo NO existe");
        }
    }


    public static void inputNombreTest(WebDriver driver){

        WebElement inputNombre = driver.findElement(By.id("inputNombre"));
        if(inputNombre!=null){
            System.out.println("El elemento inputNombre existe");
        }else{
            System.out.println("El elemento inputNombre NO existe");
        }
    }

    public static void radioMasculinoTest(WebDriver driver){

        WebElement radioMasculino = driver.findElement(By.id("radioMasculino"));
        if(radioMasculino!=null){
            System.out.println("El elemento radioMasculino existe");
        }else{
            System.out.println("El elemento radioMasculino NO existe");
        }
    }

    public static void radioFemeninoTest(WebDriver driver){

        WebElement radioFemenino = driver.findElement(By.id("radioFemenino"));
        if(radioFemenino!=null){
            System.out.println("El elemento radioFemenino existe");
        }else{
            System.out.println("El elemento radioFemenino NO existe");
        }
    }



    public static void radioOtroTest(WebDriver driver){

        WebElement radioOtro = driver.findElement(By.id("radioOtro"));
        if(radioOtro!=null){
            System.out.println("El elemento radioOtro existe");
        }else{
            System.out.println("El elemento radioOtro NO existe");
        }
    }

    public static void checkDeportesTest(WebDriver driver){

        WebElement checkDeportes = driver.findElement(By.id("checkDeportes"));
        if(checkDeportes!=null){
            System.out.println("El elemento checkDeportes existe");
        }else{
            System.out.println("El elemento checkDeportes NO existe");
        }
    }

    public static void checkMusicaTest(WebDriver driver){

        WebElement checkMusica = driver.findElement(By.id("checkMusica"));
        if(checkMusica!=null){
            System.out.println("El elemento checkMusica existe");
        }else{
            System.out.println("El elemento checkMusica NO existe");
        }
    }

    public static void checkLecturaTest(WebDriver driver){

        WebElement checkLectura = driver.findElement(By.id("checkLectura"));
        if(checkLectura!=null){
            System.out.println("El elemento checkLectura existe");
        }else{
            System.out.println("El elemento checkLectura NO existe");
        }
    }

    public static void textareaComentariosTest(WebDriver driver){
        WebElement textareaComentarios = driver.findElement(By.id("textareaComentarios"));
        if(textareaComentarios!=null){
            System.out.println("El elemento textareaComentarios existe");
        }else{
            System.out.println("El elemento textareaComentarios NO existe");
        }

    }

    public static void btnAceptarTest(WebDriver driver){

        WebElement btnAceptar = driver.findElement(By.id("btnAceptar"));
        if(btnAceptar!=null){
            System.out.println("El elemento btnAceptar existe");
        }else{
            System.out.println("El elemento btnAceptar NO existe");
        }
    }


    public static void btnCancelarTest(WebDriver driver){

        WebElement btnCancelar = driver.findElement(By.id("btnCancelar"));
        if(btnCancelar!=null){
            System.out.println("El elemento btnCancelar existe");
        }else{
            System.out.println("El elemento btnCancelar NO existe");
        }
    }


}
