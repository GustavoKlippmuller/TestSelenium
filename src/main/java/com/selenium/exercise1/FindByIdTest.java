package com.selenium.exercise1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.nio.file.Paths;

public class FindByIdTest {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        String path = Paths.get("src/main/resources/findElements.html").toUri().toString();
        driver.get(path);
        Thread.sleep(5000); // Esta linea no debe estar en la entrega del ejercicio

        /*
        Agregar aquí el código
         */

        driver.quit();

    }
}
