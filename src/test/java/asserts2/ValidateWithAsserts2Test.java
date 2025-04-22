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
        Assert.assertNotNull(actualTitle, "El título de la página no debería ser null.");
        Assert.assertEquals(actualTitle, "Página Compleja para XPath", "El título de la página no es el esperado.");
    }

    @Test
    public void validateTittleTest(){
        WebElement tittle = driver.findElement(By.cssSelector("h1.titulo-principal"));
        Assert.assertEquals(tittle.getText(),"Bienvenidos a la página de prueba","El titulo no concide");
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
    public void validateSubTittleTest(){
        WebElement subTittle = driver.findElement(By.xpath("//h2[text()='Formulario de Registro']"));
        Assert.assertEquals(subTittle.getText(), "Formulario de Registro", "El título del formulario no coincide.");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
