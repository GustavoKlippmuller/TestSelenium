package com.selenium.exercise4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.Paths;

public class UseCssOrXpathTest {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String path = Paths.get("src/main/resources/useXPATH.html").toUri().toString();
        driver.get(path);

        validateMainTitle(driver);
        validateNavigationLinks(driver);
        validateInputName(driver);
        validateInputEmail(driver);
        validateGenderRadios(driver);
        validatePreferencesCheckboxes(driver);
        validateCommentsTextarea(driver);
        validateFormButtons(driver);
        validateSubTitleXpath(driver);
        validateParagraphXpath(driver);
        validateReadMoreLink(driver);
        validateBestPracticesSubtitle(driver);
        validateBestPracticesParagraph(driver);
        validateViewDetailsLink(driver);
        validateH2Titles(driver);
        validateAnaRow(driver);
        validateJuanUser(driver);
        validateEditorRole(driver);
        validateCopyrightText(driver);
        validatePrivacyPolicyLink(driver);

        driver.quit();
    }

    public static void validateMainTitle(WebDriver driver) {
        try {
            driver.findElement(By.cssSelector(".titulo-principal"));
            System.out.println("El título principal está presente");
        } catch (NoSuchElementException e) {
            System.out.println("El título principal NO está presente");
        }
    }

    public static void validateNavigationLinks(WebDriver driver) {
        try {
            driver.findElement(By.xpath("//a[text()='Inicio']"));
            System.out.println("El link Inicio está presente");
        } catch (NoSuchElementException e) {
            System.out.println("El link Inicio NO está presente");
        }
        try {
            driver.findElement(By.xpath("//a[text()='Servicios']"));
            System.out.println("El link Servicios está presente");
        } catch (NoSuchElementException e) {
            System.out.println("El link Servicios NO está presente");
        }
        try {
            driver.findElement(By.xpath("//a[text()='Contacto']"));
            System.out.println("El link Contacto está presente");
        } catch (NoSuchElementException e) {
            System.out.println("El link Contacto NO está presente");
        }
    }

    public static void validateInputName(WebDriver driver) {
        try {
            driver.findElement(By.cssSelector("input[placeholder='Ingrese su nombre completo']"));
            System.out.println("El input de nombre está presente");
        } catch (NoSuchElementException e) {
            System.out.println("El input de nombre NO está presente");
        }
    }

    public static void validateInputEmail(WebDriver driver) {
        try {
            driver.findElement(By.cssSelector("input[type='email']"));
            System.out.println("El input de email está presente");
        } catch (NoSuchElementException e) {
            System.out.println("El input de email NO está presente");
        }
    }

    public static void validateGenderRadios(WebDriver driver) {
        try {
            driver.findElement(By.cssSelector("input[type='radio'][value='masculino']"));
            System.out.println("El radio Masculino está presente");
        } catch (NoSuchElementException e) {
            System.out.println("El radio Masculino NO está presente");
        }
        try {
            driver.findElement(By.cssSelector("input[type='radio'][value='femenino']"));
            System.out.println("El radio Femenino está presente");
        } catch (NoSuchElementException e) {
            System.out.println("El radio Femenino NO está presente");
        }
    }

    public static void validatePreferencesCheckboxes(WebDriver driver) {
        try {
            driver.findElement(By.cssSelector("input[type='checkbox'][value='email']"));
            System.out.println("El checkbox Email está presente");
        } catch (NoSuchElementException e) {
            System.out.println("El checkbox Email NO está presente");
        }
        try {
            driver.findElement(By.cssSelector("input[type='checkbox'][value='sms']"));
            System.out.println("El checkbox SMS está presente");
        } catch (NoSuchElementException e) {
            System.out.println("El checkbox SMS NO está presente");
        }
    }

    public static void validateH2Titles(WebDriver driver) {
        try {
            driver.findElement(By.xpath("//h2[text()='Formulario de Registro']"));
            System.out.println("El h2 Formulario de Registro está presente");
        } catch (NoSuchElementException e) {
            System.out.println("El h2 Formulario de Registro NO está presente");
        }

        try {
            driver.findElement(By.xpath("//h2[text()='Artículos recientes']"));
            System.out.println("El h2 Artículos recientes está presente");
        } catch (NoSuchElementException e) {
            System.out.println("El h2 Artículos recientes NO está presente");
        }

        try {
            driver.findElement(By.xpath("//h2[text()='Tabla de usuarios']"));
            System.out.println("El h2 Tabla de usuarios está presente");
        } catch (NoSuchElementException e) {
            System.out.println("El h2 Tabla de usuarios NO está presente");
        }
    }

    public static void validateCommentsTextarea(WebDriver driver) {
        try {
            driver.findElement(By.xpath("//textarea[@placeholder='Comentarios adicionales...']"));
            System.out.println("El textarea de comentarios está presente");
        } catch (NoSuchElementException e) {
            System.out.println("El textarea de comentarios NO está presente");
        }
    }

    public static void validateFormButtons(WebDriver driver) {
        try {
            driver.findElement(By.xpath("//button[text()='Enviar']"));
            System.out.println("El botón Enviar está presente");
        } catch (NoSuchElementException e) {
            System.out.println("El botón Enviar NO está presente");
        }
        try {
            driver.findElement(By.xpath("//button[text()='Limpiar']"));
            System.out.println("El botón Limpiar está presente");
        } catch (NoSuchElementException e) {
            System.out.println("El botón Limpiar NO está presente");
        }
    }

    public static void validateSubTitleXpath(WebDriver driver) {
        try {
            driver.findElement(By.xpath("//h3[text()='Cómo usar XPath en pruebas automatizadas']"));
            System.out.println("El h3 de XPath está presente");
        } catch (NoSuchElementException e) {
            System.out.println("El h3 de XPath NO está presente");
        }
    }

    public static void validateParagraphXpath(WebDriver driver) {
        try {
            driver.findElement(By.xpath("//p[contains(text(),'XPath es una herramienta poderosa')]"));
            System.out.println("El párrafo de XPath está presente");
        } catch (NoSuchElementException e) {
            System.out.println("El párrafo de XPath NO está presente");
        }
    }

    public static void validateReadMoreLink(WebDriver driver) {
        try {
            driver.findElement(By.xpath("//a[text()='Leer más']"));
            System.out.println("El link Leer más está presente");
        } catch (NoSuchElementException e) {
            System.out.println("El link Leer más NO está presente");
        }
    }

    public static void validateBestPracticesSubtitle(WebDriver driver) {
        try {
            driver.findElement(By.xpath("//h3[text()='Buenas prácticas de testing']"));
            System.out.println("El h3 de Buenas prácticas está presente");
        } catch (NoSuchElementException e) {
            System.out.println("El h3 de Buenas prácticas NO está presente");
        }
    }

    public static void validateBestPracticesParagraph(WebDriver driver) {
        try {
            driver.findElement(By.xpath("//p[contains(text(),'tests claros y mantenibles')]"));
            System.out.println("El párrafo de Buenas prácticas está presente");
        } catch (NoSuchElementException e) {
            System.out.println("El párrafo de Buenas prácticas NO está presente");
        }
    }

    public static void validateViewDetailsLink(WebDriver driver) {
        try {
            driver.findElement(By.xpath("//a[text()='Ver detalles']"));
            System.out.println("El link Ver detalles está presente");
        } catch (NoSuchElementException e) {
            System.out.println("El link Ver detalles NO está presente");
        }
    }

    public static void validateAnaRow(WebDriver driver) {
        try {
            driver.findElement(By.xpath("//td[text()='ana@test.com']"));
            System.out.println("El usuario ana@test.com está presente");
        } catch (NoSuchElementException e) {
            System.out.println("El usuario ana@test.com NO está presente");
        }
        try {
            driver.findElement(By.xpath("//td[text()='Administrador']"));
            System.out.println("El rol Administrador está presente");
        } catch (NoSuchElementException e) {
            System.out.println("El rol Administrador NO está presente");
        }
    }

    public static void validateJuanUser(WebDriver driver) {
        try {
            driver.findElement(By.xpath("//td[text()='juan@test.com']"));
            System.out.println("El usuario juan@test.com está presente");
        } catch (NoSuchElementException e) {
            System.out.println("El usuario juan@test.com NO está presente");
        }
    }

    public static void validateEditorRole(WebDriver driver) {
        try {
            driver.findElement(By.xpath("//td[text()='Editor']"));
            System.out.println("El rol Editor está presente");
        } catch (NoSuchElementException e) {
            System.out.println("El rol Editor NO está presente");
        }
    }

    public static void validateCopyrightText(WebDriver driver) {
        try {
            driver.findElement(By.xpath("//p[contains(text(),'Todos los derechos')]"));
            System.out.println("El texto de derechos reservados está presente");
        } catch (NoSuchElementException e) {
            System.out.println("El texto de derechos reservados NO está presente");
        }
    }

    public static void validatePrivacyPolicyLink(WebDriver driver) {
        try {
            driver.findElement(By.xpath("//a[text()='Política de privacidad']"));
            System.out.println("El link Política de privacidad está presente");
        } catch (NoSuchElementException e) {
            System.out.println("El link Política de privacidad NO está presente");
        }
    }
}
