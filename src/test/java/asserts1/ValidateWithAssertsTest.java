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
        Assert.assertEquals(label.getText(), "Nombre:", "El texto de la etiqueta no es 'Nombre:'");
    }
    @Test
    public void verifyInputNameTest() {
        WebElement input = driver.findElement(By.id("inputNombre"));

        String type = input.getAttribute("type");
        Assert.assertEquals(type, "text", "El tipo del input no es 'text'");

        String placeholder = input.getAttribute("placeholder");
        Assert.assertEquals(placeholder, "Ingrese su nombre", "El placeholder no es el esperado");
    }

    @Test
    public void verifyParagraphGenderTest(){
    WebElement paragraph = driver.findElement(By.xpath("//p[text()='Seleccione su género:']"));
        Assert.assertEquals(paragraph.getText().trim(), "Seleccione su género:", "El texto del párrafo no es el esperado.");
    }

    @Test
    public void verifyRadioButtonsLabelTest(){
        //Masculino
        WebElement labelMasculino = driver.findElement(By.cssSelector("label[for='radioMasculino']"));
        Assert.assertEquals(labelMasculino.getText(),"Masculino","El texto de la etiqueta 'radioMasculino' no es 'Masculino'");
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

    @Test
    public void verifyRadioButtonsInputsTest() {
        // Masculino
        WebElement inputMasculino = driver.findElement(By.id("radioMasculino"));
        Assert.assertEquals(inputMasculino.getAttribute("type"), "radio", "El tipo no es 'radio'");
        Assert.assertEquals(inputMasculino.getAttribute("name"), "genero", "El name no es 'genero'");
        Assert.assertEquals(inputMasculino.getAttribute("value"), "masculino", "El value no es 'masculino'");
        // Femenino
        WebElement inputFemenino = driver.findElement(By.id("radioFemenino"));
        Assert.assertEquals(inputFemenino.getAttribute("type"), "radio", "El tipo no es 'radio'");
        Assert.assertEquals(inputFemenino.getAttribute("name"), "genero", "El name no es 'genero'");
        Assert.assertEquals(inputFemenino.getAttribute("value"), "femenino", "El value no es 'femenino'");
        // Otro
        WebElement inputOtro = driver.findElement(By.id("radioOtro"));
        Assert.assertEquals(inputOtro.getAttribute("type"), "radio", "El tipo no es 'radio'");
        Assert.assertEquals(inputOtro.getAttribute("name"), "genero", "El name no es 'genero'");
        Assert.assertEquals(inputOtro.getAttribute("value"), "otro", "El value no es 'otro'");
        // Prefiero no decirlo
        WebElement inputNoDecirlo = driver.findElement(By.id("radioPrefieroNoDecirlo"));
        Assert.assertEquals(inputNoDecirlo.getAttribute("type"), "radio", "El tipo no es 'radio'");
        Assert.assertEquals(inputNoDecirlo.getAttribute("name"), "genero", "El name no es 'genero'");
        Assert.assertEquals(inputNoDecirlo.getAttribute("value"), "prefieroNoDecirlo", "El value no es 'prefieroNoDecirlo'");
    }

    @Test
    public void verifyCheckBoxesLabelTest() {
        // Deportes
        WebElement labelDeportes = driver.findElement(By.cssSelector("label[for='checkDeportes']"));
        Assert.assertEquals(labelDeportes.getText(), "Deportes", "El texto del CheckBox no es 'Deportes'");
        // Música
        WebElement labelMusica = driver.findElement(By.cssSelector("label[for='checkMusica']"));
        Assert.assertEquals(labelMusica.getText(), "Música", "El texto del CheckBox no es 'Música'");
        // Lectura
        WebElement labelLectura = driver.findElement(By.cssSelector("label[for='checkLectura']"));
        Assert.assertEquals(labelLectura.getText(), "Lectura", "El texto del CheckBox no es 'Lectura'");
    }

    @Test
    public void verifyCheckBoxesInputsTest() {
        // Deportes
        WebElement inputDeportes = driver.findElement(By.id("checkDeportes"));
        Assert.assertEquals(inputDeportes.getAttribute("type"), "checkbox", "El tipo no es 'checkbox'");
        Assert.assertEquals(inputDeportes.getAttribute("value"), "deportes", "El valor no es 'deportes'");
        // Música
        WebElement inputMusica = driver.findElement(By.id("checkMusica"));
        Assert.assertEquals(inputMusica.getAttribute("type"), "checkbox", "El tipo no es 'checkbox'");
        Assert.assertEquals(inputMusica.getAttribute("value"), "musica", "El valor no es 'musica'");
        // Lectura
        WebElement inputLectura = driver.findElement(By.id("checkLectura"));
        Assert.assertEquals(inputLectura.getAttribute("type"), "checkbox", "El tipo no es 'checkbox'");
        Assert.assertEquals(inputLectura.getAttribute("value"), "lectura", "El valor no es 'lectura'");
    }
    @Test
    public void verifyCommentaryLabelTest() {
        WebElement labelComentarios = driver.findElement(By.cssSelector("label[for=textareaComentarios]"));
        Assert.assertEquals(labelComentarios.getText(),"Comentarios:","El texto del label no es 'Comentarios:'");
    }

    @Test
    public void verifyTextAreaTest(){
        WebElement textArea = driver.findElement(By.id("textareaComentarios"));
        Assert.assertEquals(textArea.getAttribute("rows"),"4","Las filas del area de texto no son '4'");
        Assert.assertEquals(textArea.getAttribute("cols"),"50","Las columnas del area de texto no son '50'");
        Assert.assertEquals(textArea.getAttribute("placeholder"),"Escriba sus comentarios...","El placeholder no dice 'Escriba sus comentarios...'");
    }

    @Test
    public void verifyButtonAcceptTest(){
        WebElement btnAceptar = driver.findElement(By.id("btnAceptar"));
        Assert.assertEquals(btnAceptar.getText(),"Aceptar","El texto del boton no es 'Aceptar'");
    }

    @Test
    public void verifyButtonCancelTest(){
        WebElement btnCancelar = driver.findElement(By.id("btnCancelar"));
        Assert.assertEquals(btnCancelar.getText(),"Cancelar","El texto del boton no es 'Cancelar'");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
