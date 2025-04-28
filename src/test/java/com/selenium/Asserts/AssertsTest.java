package com.selenium.Asserts;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.junit.jupiter.api.Assertions;

import java.nio.file.Paths;

public class AssertsTest {

    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testFormularioCompleto() {
        String path = Paths.get("src/main/resources/findElements.html").toUri().toString();
        driver.get(path);


        WebElement etiquetaNombre = driver.findElement(By.xpath("//label[@for='inputNombre']"));
        Assertions.assertNotNull(etiquetaNombre, "La etiqueta 'Nombre' no existe");
        Assertions.assertEquals("Nombre:", etiquetaNombre.getText(), "La etiqueta no dice 'Nombre:'");


        WebElement inputNombre = driver.findElement(By.id("inputNombre"));
        Assertions.assertNotNull(inputNombre, "El input 'Nombre' no existe");
        Assertions.assertEquals("text", inputNombre.getAttribute("type"), "El input no es de tipo text");
        Assertions.assertEquals("Ingrese su nombre", inputNombre.getAttribute("placeholder"), "El placeholder no es correcto");


        WebElement etiquetaGenero = driver.findElement(By.xpath("//label[@for='radioMasculino']"));
        Assertions.assertNotNull(etiquetaGenero, "La etiqueta 'Género' no existe");
        Assertions.assertEquals("Género:", etiquetaGenero.getText(), "La etiqueta no dice 'Género:'");

        verificarInputConLabel(driver, "radioMasculino", "label[for='radioMasculino']", "Masculino", "radio", "genero", "masculino");
        verificarInputConLabel(driver, "radioFemenino", "label[for='radioFemenino']", "Femenino", "radio", "genero", "femenino");
        verificarInputConLabel(driver, "radioOtro", "label[for='radioOtro']", "Otro", "radio", "genero", "otro");
        verificarInputConLabel(driver, "radioPrefieroNoDecirlo", "label[for='radioPrefieroNoDecirlo']", "Prefiero no decirlo", "radio", "genero", "prefiero no decirlo");

        verificarInputConLabel(driver, "checkDeportes", "label[for='checkDeportes']", "Deportes", "checkbox", null, "deportes");
        verificarInputConLabel(driver, "checkMusica", "label[for='checkMusica']", "Música", "checkbox", null, "musica");
        verificarInputConLabel(driver, "checkLectura", "label[for='checkLectura']", "Lectura", "checkbox", null, "lectura");

        WebElement etiquetaComentario = driver.findElement(By.xpath("//label[@for='textareaComentarios']"));
        Assertions.assertNotNull(etiquetaComentario, "La etiqueta 'Comentario' no existe");
        Assertions.assertEquals("Comentario:", etiquetaComentario.getText(), "La etiqueta no dice 'Comentario:'");

        WebElement textArea = driver.findElement(By.id("textareaComentarios"));
        Assertions.assertNotNull(textArea, "El textarea no existe");
        Assertions.assertEquals("4", textArea.getAttribute("rows"), "El textarea no tiene 4 filas");
        Assertions.assertEquals("50", textArea.getAttribute("columns"), "El textarea no tiene 50 columnas");
        Assertions.assertEquals("Escriba aquí sus comentarios...", textArea.getAttribute("placeholder"), "El placeholder del textarea no es el esperado");

        WebElement btnAceptar = driver.findElement(By.id("btnAceptar"));
        Assertions.assertNotNull(btnAceptar, "El botón Aceptar no existe");
        Assertions.assertEquals("Aceptar", btnAceptar.getAttribute("value"), "El botón Aceptar no tiene el texto correcto");

        WebElement btnCancelar = driver.findElement(By.id("btnCancelar"));
        Assertions.assertNotNull(btnCancelar, "El botón Cancelar no existe");
        Assertions.assertEquals("Cancelar", btnCancelar.getAttribute("value"), "El botón Cancelar no tiene el texto correcto");
    }

    private void verificarInputConLabel(WebDriver driver, String idInput, String selectorLabel, String textoEsperadoLabel, String tipoEsperado, String nameEsperado, String valorEsperado) {
        WebElement label = driver.findElement(By.cssSelector(selectorLabel));
        WebElement input = driver.findElement(By.id(idInput));

        Assertions.assertNotNull(label, "La etiqueta para " + idInput + " no existe");
        Assertions.assertEquals(textoEsperadoLabel, label.getText(), "La etiqueta para " + idInput + " no tiene el texto correcto");

        Assertions.assertNotNull(input, "El input " + idInput + " no existe");
        Assertions.assertEquals(tipoEsperado, input.getAttribute("type"), "El tipo de " + idInput + " no es el esperado");

        if (nameEsperado != null) {
            Assertions.assertEquals(nameEsperado, input.getAttribute("name"), "El name del input " + idInput + " no es el esperado");
        }

        Assertions.assertEquals(valorEsperado, input.getAttribute("value"), "El value del input " + idInput + " no es el esperado");
    }
}
