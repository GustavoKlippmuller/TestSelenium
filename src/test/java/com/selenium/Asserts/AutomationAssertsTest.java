package com.selenium.Asserts;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class AutomationAssertsTest  {

    WebDriver driver;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        driver.get("src/main/resources/useXPATH.html");
    }

    @Test
    void validarElementosDeLaPagina() {

        assertEquals("Página Compleja para XPath", driver.getTitle());

        WebElement tituloPrincipal = driver.findElement(By.className("titulo-principal"));
        assertTrue(tituloPrincipal.isDisplayed());
        assertEquals("Bienvenidos a la página de prueba", tituloPrincipal.getText());

        WebElement linkInicio = driver.findElement(By.linkText("Inicio"));
        assertTrue(linkInicio.isDisplayed());

        WebElement linkServicios = driver.findElement(By.linkText("Servicios"));
        assertTrue(linkServicios.isDisplayed());

        WebElement linkContacto = driver.findElement(By.linkText("Contacto"));
        assertTrue(linkContacto.isDisplayed());

        WebElement subtituloFormulario = driver.findElement(By.xpath("//h2[text()='Formulario de Registro']"));
        assertTrue(subtituloFormulario.isDisplayed());

        WebElement labelNombre = driver.findElement(By.xpath("//label[contains(text(),'Nombre completo')]"));
        assertTrue(labelNombre.isDisplayed());

        WebElement inputNombre = driver.findElement(By.xpath("//input[@type='text']"));
        assertEquals("text", inputNombre.getAttribute("type"));
        assertEquals("Ingrese su nombre completo", inputNombre.getAttribute("placeholder"));

        WebElement labelCorreo = driver.findElement(By.xpath("//label[contains(text(),'Correo electrónico')]"));
        assertTrue(labelCorreo.isDisplayed());

        WebElement inputCorreo = driver.findElement(By.xpath("//input[@type='email']"));
        assertEquals("email", inputCorreo.getAttribute("type"));
        assertEquals("ejemplo@correo.com", inputCorreo.getAttribute("placeholder"));

        WebElement labelGenero = driver.findElement(By.xpath("//label[text()='Género:']"));
        assertTrue(labelGenero.isDisplayed());

        WebElement radioMasculino = driver.findElement(By.xpath("//input[@value='masculino']"));
        WebElement radioFemenino = driver.findElement(By.xpath("//input[@value='femenino']"));
        assertEquals("radio", radioMasculino.getAttribute("type"));
        assertEquals("radio", radioFemenino.getAttribute("type"));

        WebElement labelPreferencias = driver.findElement(By.xpath("//label[text()='Preferencias:']"));
        assertTrue(labelPreferencias.isDisplayed());

        WebElement checkEmail = driver.findElement(By.xpath("//input[@value='email']"));
        WebElement checkSms = driver.findElement(By.xpath("//input[@value='sms']"));
        assertEquals("checkbox", checkEmail.getAttribute("type"));
        assertEquals("checkbox", checkSms.getAttribute("type"));

        WebElement textareaComentarios = driver.findElement(By.tagName("textarea"));
        assertTrue(textareaComentarios.isDisplayed());
        assertEquals("Comentarios adicionales...", textareaComentarios.getAttribute("placeholder"));

        WebElement botonEnviar = driver.findElement(By.xpath("//button[@type='submit']"));
        WebElement botonLimpiar = driver.findElement(By.xpath("//button[@type='reset']"));
        assertEquals("submit", botonEnviar.getAttribute("type"));
        assertEquals("reset", botonLimpiar.getAttribute("type"));

        WebElement subtituloArticulos = driver.findElement(By.xpath("//h2[text()='Artículos recientes']"));
        assertTrue(subtituloArticulos.isDisplayed());

        WebElement articulo1 = driver.findElement(By.xpath("//h3[text()='Cómo usar XPath en pruebas automatizadas']"));
        WebElement textoArticulo1 = driver.findElement(By.xpath("//h3[text()='Cómo usar XPath en pruebas automatizadas']/following-sibling::p"));
        WebElement linkArticulo1 = driver.findElement(By.xpath("//h3[text()='Cómo usar XPath en pruebas automatizadas']/following-sibling::a"));

        assertTrue(articulo1.isDisplayed());
        assertTrue(textoArticulo1.isDisplayed());
        assertTrue(linkArticulo1.isDisplayed());

        WebElement articulo2 = driver.findElement(By.xpath("//h3[text()='Buenas prácticas de testing']"));
        WebElement textoArticulo2 = driver.findElement(By.xpath("//h3[text()='Buenas prácticas de testing']/following-sibling::p"));
        WebElement linkArticulo2 = driver.findElement(By.xpath("//h3[text()='Buenas prácticas de testing']/following-sibling::a"));

        assertTrue(articulo2.isDisplayed());
        assertTrue(textoArticulo2.isDisplayed());
        assertTrue(linkArticulo2.isDisplayed());

        WebElement subtituloTabla = driver.findElement(By.xpath("//h2[text()='Tabla de usuarios']"));
        assertTrue(subtituloTabla.isDisplayed());

        WebElement cabeceraUsuario = driver.findElement(By.xpath("//th[text()='Usuario']"));
        WebElement cabeceraRol = driver.findElement(By.xpath("//th[text()='Rol']"));
        assertTrue(cabeceraUsuario.isDisplayed());
        assertTrue(cabeceraRol.isDisplayed());

        WebElement usuarioAna = driver.findElement(By.xpath("//td[text()='ana@test.com']"));
        WebElement rolAna = driver.findElement(By.xpath("//td[text()='Administrador']"));
        assertTrue(usuarioAna.isDisplayed());
        assertTrue(rolAna.isDisplayed());

        WebElement usuarioJuan = driver.findElement(By.xpath("//td[text()='juan@test.com']"));
        WebElement rolJuan = driver.findElement(By.xpath("//td[text()='Editor']"));
        assertTrue(usuarioJuan.isDisplayed());
        assertTrue(rolJuan.isDisplayed());

        WebElement footerTexto = driver.findElement(By.xpath("//footer/p"));
        WebElement footerLink = driver.findElement(By.xpath("//footer/a"));

        assertTrue(footerTexto.isDisplayed());
        assertEquals("© 2025 Todos los derechos reservados.", footerTexto.getText());
        assertTrue(footerLink.isDisplayed());
        assertEquals("Política de privacidad", footerLink.getText());
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }
}
