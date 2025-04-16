package com.selenium.exercise1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.nio.file.Paths;

public class AssertEqualTest {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        String path = Paths.get("C:\\Users\\UMonteverde\\Desktop\\ejercicios java\\ejericiciosAssert\\TestSelenium\\target\\classes\\useXPATH.html").toUri().toString();
        driver.get(path);

        labelNombreTest(driver);
        inputNombreTest(driver);
        labelGeneroTest(driver);
        labelMasculinoTest(driver);
        labelFemeninoTest(driver);
        inputMasculinoTest(driver);
        inputFemeninoTest(driver);
        labelEmailTest(driver);
        labelSMSTest(driver);
        inputEmailTest(driver);
        inputSMSTest(driver);
        labelAgregueSuComentarioTest(driver);
        inputTextAreaTest(driver);
        buttonAceptarTest(driver);
        buttonLimpiarTest(driver);
        driver.quit();

    }

    public static void labelNombreTest(WebDriver driver){
        WebElement labelNombre = driver.findElement(By.xpath("//label[contains(text(),'Nombre completo:')]\n"));
        assertTrue(labelNombre.isDisplayed());
        assertEquals("Nombre completo:",labelNombre.getText());
    }

    public static void inputNombreTest(WebDriver driver){
        WebElement inputNombre = driver.findElement(By.xpath("//input[@placeholder='Ingrese su nombre completo']\n"));
        assertEquals("text",inputNombre.getAttribute("type"));
        assertTrue(inputNombre.isDisplayed());
        assertEquals("Ingrese su nombre completo",inputNombre.getAttribute("placeholder"));

    }


    public static void labelGeneroTest(WebDriver driver){
        WebElement labelGenero = driver.findElement(By.xpath("//label[contains(text(),'Género:')]\n"));
        assertTrue(labelGenero.isDisplayed());
        assertEquals("Género:",labelGenero.getText());
    }


    public static void labelMasculinoTest(WebDriver driver){
        WebElement labelMasculino = driver.findElement(By.xpath("//label[input[@type='radio' and @value='masculino']]\n"));
        assertTrue(labelMasculino.isDisplayed());
        assertEquals("Masculino",labelMasculino.getText());
    }


    public static void labelFemeninoTest(WebDriver driver){
        WebElement labelFemenino = driver.findElement(By.xpath("//label[input[@type='radio' and @value='femenino']]\n"));
        assertTrue(labelFemenino.isDisplayed());
        assertEquals("Femenino",labelFemenino.getText());
    }



    public static void inputMasculinoTest(WebDriver driver){
        WebElement inputMasculino = driver.findElement(By.xpath("//input[@value='masculino']\n"));
        assertTrue(inputMasculino.isDisplayed());
        assertEquals("radio",inputMasculino.getAttribute("type"));
        assertEquals("masculino",inputMasculino.getAttribute("value"));
    }


    public static void inputFemeninoTest(WebDriver driver){
        WebElement inputFemenino = driver.findElement(By.xpath("//input[@value='femenino']\n"));
        assertTrue(inputFemenino.isDisplayed());
        assertEquals("radio",inputFemenino.getAttribute("type"));
        assertEquals("femenino",inputFemenino.getAttribute("value"));
    }


    public static void labelEmailTest(WebDriver driver){
        WebElement labelEmail = driver.findElement(By.xpath("//form[contains(., 'Email')]\n"));
        assertTrue(labelEmail.isDisplayed());
        assertTrue(labelEmail.getText().contains("Email"));
    }


    public static void labelSMSTest(WebDriver driver){
        WebElement labelSMS = driver.findElement(By.xpath("//form[contains(., 'SMS')]\n"));
        assertTrue(labelSMS.isDisplayed());
        assertTrue(labelSMS.getText().contains("SMS"));
    }


    public static void inputEmailTest(WebDriver driver){
        WebElement inputEmail = driver.findElement(By.xpath("//input[@value='email']\n"));
        assertTrue(inputEmail.isDisplayed());
        assertEquals("checkbox",inputEmail.getAttribute("type"));
        assertEquals("email",inputEmail.getAttribute("value"));
    }


    public static void inputSMSTest(WebDriver driver){
        WebElement inputSMS = driver.findElement(By.xpath("//input[@value='sms']\n"));
        assertTrue(inputSMS.isDisplayed());
        assertEquals("checkbox",inputSMS.getAttribute("type"));
        assertEquals("sms",inputSMS.getAttribute("value"));
    }


    public static void labelAgregueSuComentarioTest(WebDriver driver){
        WebElement labelComentario = driver.findElement(By.xpath("//label[contains(text(),'Agregue su comentario aquí:')]\n"));
        assertTrue(labelComentario.isDisplayed());
        assertEquals("Agregue su comentario aquí:",labelComentario.getText());
    }



    public static void inputTextAreaTest(WebDriver driver){
        WebElement inputTextArea = driver.findElement(By.xpath("//textArea[@placeholder='Comentarios adicionales...']\n"));
        assertTrue(inputTextArea.isDisplayed());
        assertEquals("2",inputTextArea.getAttribute("rows"));
        assertEquals("20",inputTextArea.getAttribute("cols"));
        assertEquals("Comentarios adicionales...",inputTextArea.getAttribute("placeholder"));
    }



    public static void buttonAceptarTest(WebDriver driver){
        WebElement buttomAceptar = driver.findElement(By.xpath("//button[(text()='Enviar')]\n"));
        assertTrue(buttomAceptar.isDisplayed());
        assertEquals("Enviar",buttomAceptar.getText());
    }


    public static void buttonLimpiarTest(WebDriver driver){
        WebElement buttomLimpiar = driver.findElement(By.xpath("//button[(text()='Limpiar')]\n"));
        assertTrue(buttomLimpiar.isDisplayed());
        assertEquals("Limpiar",buttomLimpiar.getText());
    }
}
