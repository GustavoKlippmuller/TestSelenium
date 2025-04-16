package asserts1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import java.nio.file.Paths;

public class ValidateWithAssertsTest {

    WebDriver driver = new ChromeDriver();

    @BeforeClass
    public void setUp() {
        driver.manage().window().maximize();
        String path = Paths.get("src/main/resources/findElements.html").toUri().toString();
        driver.get(path);
    }

    @Test
    public void verifyNameLabelTest() {
        WebElement label = driver.findElement(By.cssSelector("label[for='inputNombre']"));
        Assert.assertNotNull(label, "La etiqueta de nombre no existe.");
        Assert.assertEquals(label.getText(), "Nombre:", "El texto de la etiqueta no es 'Nombre:'");
    }
    @Test
    public void verifyNameInputTest() {
        WebElement input = driver.findElement(By.id("inputNombre"));

        Assert.assertNotNull(input,"El input ´ínputNombre´ no existe");

        String type = input.getAttribute("type");
        Assert.assertEquals(type, "text", "El tipo del input no es 'text'");

        String placeholder = input.getAttribute("placeholder");
        Assert.assertEquals(placeholder, "Ingrese su nombre", "El placeholder no es el esperado");
    }

    @Test
    public void verifyParagraphGender(){
    WebElement paragraph = driver.findElement(By.xpath("//p[text()='Seleccione su género:']"));
        Assert.assertEquals(paragraph.getText().trim(), "Seleccione su género:", "El texto del párrafo no es el esperado.");
    }

    @Test
    public void VerifyRadioButtons(){
        //Masculino
        WebElement radio = driver.findElement(By.cssSelector("label[for='radioMasculino']"));
        Assert.assertNotNull(radio,"La etiqueta de 'radioMasculino' no existe");
        Assert.assertEquals(radio.getText(),"Masculino","El texto de la etiqueta 'radioMasculino' no es ´Masculino´");

        // Femenino
        WebElement labelFemenino = driver.findElement(By.cssSelector("label[for='radioFemenino']"));
        Assert.assertEquals(labelFemenino.getText().trim(), "Femenino", "La etiqueta 'radioFemenino' no dice 'Femenino'");

        // Otro
        WebElement labelOtro = driver.findElement(By.cssSelector("label[for='radioOtro']"));
        Assert.assertEquals(labelOtro.getText().trim(), "Otro", "La etiqueta 'radioOtro' no dice 'Otro'");

        // Prefiero no decirlo
        WebElement labelNoDecirlo = driver.findElement(By.cssSelector("label[for='radioPrefieroNoDecirlo']"));
        Assert.assertEquals(labelNoDecirlo.getText().trim(), "Prefiero no decirlo", "La etiqueta 'radioPrefieroNoDecirlo' no dice 'Prefiero no decirlo'");
    }


    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
