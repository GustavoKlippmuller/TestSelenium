package asserts2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.nio.file.Paths;
import java.util.List;

public class ValidateWithAsserts2Test {
    WebDriver driver = new ChromeDriver();

    @BeforeClass
    public void setUp() {
        driver.manage().window().maximize();
        String path = Paths.get("src/main/resources/useXPATH.html").toUri().toString();
        driver.get(path);
    }

    @Test
    public void validatePageTittleTest(){
        String actualTitle = driver.getTitle();
        Assert.assertNotNull(actualTitle, "El título de la página no existe");
        Assert.assertEquals(actualTitle, "Página Compleja para XPath", "El título de la página no es el esperado.");
    }

    @Test
    public void validateTittleTest(){
        WebElement tittle = driver.findElement(By.cssSelector("h1.title-principal"));
        Assert.assertNotNull(tittle,"El title no existe");
        Assert.assertEquals(tittle.getText(),"Bienvenidos a la página de prueba","El title no concide");
    }

    @Test
    public void validateNavigationLinksTest() {
        List<WebElement> links = driver.findElements(By.cssSelector("nav.navigation a"));
        Assert.assertEquals(links.size(), 3, "No hay 3 enlaces en la navegación.");

        Assert.assertEquals(links.get(0).getText(), "Inicio");
        Assert.assertEquals(links.get(1).getText(), "Servicios");
        Assert.assertEquals(links.get(2).getText(), "Contacto");
    }

    @Test
    public void validateSubTittle1Test(){
        WebElement subTittle1 = driver.findElement(By.xpath("//h2[text()='Formulario de Registro']"));
        Assert.assertNotNull(subTittle1,"El primer subtitulo no existe");
    }

    @Test
    public void validateFullNameTest(){
        WebElement fullName = driver.findElement(By.xpath("//label[contains(text(),'Nombre completo:')]"));
        Assert.assertNotNull(fullName,"El label 'Nombre Completo:' no existe");

        WebElement input = fullName.findElement(By.tagName("input"));
        Assert.assertNotNull(input, "El input de 'Nombre completo:' no existe.");
        Assert.assertEquals(input.getAttribute("type"), "text", "El tipo del input no es 'text'.");
        Assert.assertEquals(input.getAttribute("placeholder"), "Ingrese su nombre completo", "El placeholder no es el esperado.");

        /*WebElement placeHolderFullName = driver.findElement(By.cssSelector("input[placeholder='Ingrese su nombre completo']"));
        Assert.assertNotNull(placeHolderFullName,"El input no existe");

        WebElement typeFullName = driver.findElement(By.cssSelector("input[type='text']"));
        Assert.assertNotNull(typeFullName,"El type no existe");*/

    }

    @Test
    public void validateEmailTest(){
        WebElement email = driver.findElement(By.xpath("//label[contains(text(),'Correo electrónico:')]"));
        Assert.assertNotNull(email,"El label 'Nombre Completo:' no existe");

        WebElement input = email.findElement(By.tagName("input"));
        Assert.assertNotNull(input, "El input de 'Correo electrónico:' no existe.");
        Assert.assertEquals(input.getAttribute("type"), "email", "El tipo del input no es 'email'.");
        Assert.assertEquals(input.getAttribute("placeholder"), "ejemplo@correo.com", "El placeholder no es el esperado.");
    }

    @Test
    public void validateGenderTest(){
        WebElement gender = driver.findElement(By.xpath("//label[contains(text(),'Género:')]"));
        Assert.assertNotNull(gender,"El label no existe");

        WebElement radioMasculino = driver.findElement(By.cssSelector("input[value='masculino']"));
        Assert.assertNotNull(radioMasculino, "El input de 'masculino' no existe.");
        Assert.assertEquals(radioMasculino.getAttribute("type"), "radio");

        WebElement radioFemenino = driver.findElement(By.cssSelector("input[value='femenino']"));
        Assert.assertNotNull(radioFemenino, "El input de 'femenino' no existe.");
        Assert.assertEquals(radioFemenino.getAttribute("type"), "radio");
    }

    @Test
    public void validatePreferencesTest(){
        WebElement preference = driver.findElement(By.xpath("//label[contains(text(),'Preferencias:')]"));
        Assert.assertNotNull(preference,"El label no existe");

        WebElement checkBoxEmail = driver.findElement(By.cssSelector("input[value='email']"));
        Assert.assertNotNull(checkBoxEmail, "El input de 'email' no existe.");
        Assert.assertEquals(checkBoxEmail.getAttribute("type"), "checkbox");

        WebElement checkBoxSms = driver.findElement(By.cssSelector("input[value='sms']"));
        Assert.assertNotNull(checkBoxSms, "El input de 'sms' no existe.");
        Assert.assertEquals(checkBoxSms.getAttribute("type"), "checkbox");
    }

    @Test
    public void validateAdditionalCommentsTest(){
    WebElement comment = driver.findElement(By.xpath("//label[contains(text(),'Agregue su comentario aquí:')]"));
    Assert.assertNotNull(comment,"El label no existe");

    WebElement textArea = driver.findElement(By.cssSelector("textarea[placeholder='Comentarios adicionales...']"));
    Assert.assertNotNull(textArea,"El textArea no existe");
    }

    @Test
    public void validateButtonsTest(){
        WebElement send = driver.findElement(By.cssSelector("button[type='submit']"));
        Assert.assertNotNull(send,"El boton para enviar no existe");
        Assert.assertEquals(send.getText(),"Enviar");

        WebElement clear = driver.findElement(By.cssSelector("button[type='reset']"));
        Assert.assertNotNull(clear,"El boton para limpiar no existe");
        Assert.assertEquals(clear.getText(),"Limpiar");
    }

    @Test
    public void validateSubTittle2Test(){
        WebElement subTitle2 = driver.findElement(By.xpath("//h2[text()='Artículos recientes']"));
        Assert.assertNotNull(subTitle2,"El segundo subtitulo no existe");
    }

    @Test
    public void validateArticlesTest() {
        List<WebElement> articles = driver.findElements(By.cssSelector(".articulo"));
        Assert.assertEquals(articles.size(), 2, "No hay exactamente dos artículos.");
        
        WebElement article1 = articles.get(0);
        WebElement title1 = article1.findElement(By.tagName("h3"));
        Assert.assertEquals(title1.getText(), "Cómo usar XPath en pruebas automatizadas", "Título del artículo 1 incorrecto.");
        WebElement text1 = article1.findElement(By.tagName("p"));
        Assert.assertEquals(text1.getText(), "XPath es una herramienta poderosa para seleccionar elementos en estructuras HTML.", "text del artículo 1 incorrecto.");
        WebElement enlace1 = article1.findElement(By.tagName("a"));
        Assert.assertEquals(enlace1.getText(), "Leer más", "text del enlace del artículo 1 incorrecto.");
        /*WebElement enlace1 = driver.findElement(By.cssSelector("a[href='#']"));
        Assert.assertEquals(enlace1.getText(),"Leer Mas");*/
        
        WebElement article2 = articles.get(1);
        WebElement title2 = article2.findElement(By.tagName("h3"));
        Assert.assertEquals(title2.getText(), "Buenas prácticas de testing", "Título del artículo 2 incorrecto.");
        WebElement text2 = article2.findElement(By.tagName("p"));
        Assert.assertEquals(text2.getText(), "Es importante escribir tests claros y mantenibles.", "text del artículo 2 incorrecto.");
        WebElement enlace2 = article2.findElement(By.tagName("a"));
        Assert.assertEquals(enlace2.getText(), "Ver detalles", "text del enlace del artículo 2 incorrecto.");
        /*WebElement enlace2 = driver.findElement(By.cssSelector("a[href='#']"));
        Assert.assertEquals(enlace2.getText(),"Ver detalles");*/
    }

    @Test
    public void validateSubTittle3Test(){
    WebElement subTittle3 = driver.findElement(By.xpath("//h2[text()='Tabla de usuarios']"));
    Assert.assertNotNull(subTittle3,"El tercer subtitulo no existe");
    }

    @Test
    public void validateTableHeaderTest() {
        List<WebElement> headers = driver.findElements(By.cssSelector("table th"));
        Assert.assertEquals(headers.size(), 2, "La tabla no tiene exactamente 2 columnas de cabecera.");
        Assert.assertEquals(headers.get(0).getText(), "Usuario", "El primer encabezado no es 'Usuario'");
        Assert.assertEquals(headers.get(1).getText(), "Rol", "El segundo encabezado no es 'Rol'");
    }

    @Test
    public void validateUsersTest(){
        List<WebElement> users = driver.findElements(By.cssSelector("table td"));
        Assert.assertEquals(users.size(), 4, "La tabla no tiene exactamente 2 usuarios.");
        Assert.assertEquals(users.get(0).getText(), "ana@test.com", "El primer usuario no es 'ana'");
        Assert.assertEquals(users.get(2).getText(), "juan@test.com", "El segundo usuario no es 'juan'");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
