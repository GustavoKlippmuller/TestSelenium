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

        validarTituloPrincipal(driver);
        validarLinksDeNavegacion(driver);
        validarInputNombre(driver);
        validarInputEmail(driver);
        validarRadiosGenero(driver);
        validarCheckboxPreferencias(driver);
        validarTextareaComentarios(driver);
        validarBotonesFormulario(driver);
        validarSubtituloXPath(driver);
        validarParrafoXPath(driver);
        validarLinkLeerMas(driver);
        validarSubtituloBuenasPracticas(driver);
        validarParrafoBuenasPracticas(driver);
        validarLinkVerDetalles(driver);
        validarTitulosH2(driver);
        validarFilaUsuarioAna(driver);
        validarUsuarioJuan(driver);
        validarRolEditor(driver);
        validarTextoDeDerechos(driver);
        validarPoliticaPrivacidad(driver);

        driver.quit();
    }

    public static void validarTituloPrincipal(WebDriver driver) {
        try {
            driver.findElement(By.cssSelector(".titulo-principal"));
            System.out.println("El título principal está presente");
        } catch (NoSuchElementException e) {
            System.out.println("El título principal NO está presente");
        }
    }

    public static void validarLinksDeNavegacion(WebDriver driver) {
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

    public static void validarInputNombre(WebDriver driver) {
        try {
            driver.findElement(By.cssSelector("input[placeholder='Ingrese su nombre completo']"));
            System.out.println("El input de nombre está presente");
        } catch (NoSuchElementException e) {
            System.out.println("El input de nombre NO está presente");
        }
    }

    public static void validarInputEmail(WebDriver driver) {
        try {
            driver.findElement(By.cssSelector("input[type='email']"));
            System.out.println("El input de email está presente");
        } catch (NoSuchElementException e) {
            System.out.println("El input de email NO está presente");
        }
    }

    public static void validarRadiosGenero(WebDriver driver) {
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

    public static void validarCheckboxPreferencias(WebDriver driver) {
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

    public static void validarTitulosH2(WebDriver driver) {
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

    public static void validarTextareaComentarios(WebDriver driver) {
        try {
            driver.findElement(By.xpath("//textarea[@placeholder='Comentarios adicionales...']"));
            System.out.println("El textarea de comentarios está presente");
        } catch (NoSuchElementException e) {
            System.out.println("El textarea de comentarios NO está presente");
        }
    }

    public static void validarBotonesFormulario(WebDriver driver) {
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

    public static void validarSubtituloXPath(WebDriver driver) {
        try {
            driver.findElement(By.xpath("//h3[text()='Cómo usar XPath en pruebas automatizadas']"));
            System.out.println("El h3 de XPath está presente");
        } catch (NoSuchElementException e) {
            System.out.println("El h3 de XPath NO está presente");
        }
    }

    public static void validarParrafoXPath(WebDriver driver) {
        try {
            driver.findElement(By.xpath("//p[contains(text(),'XPath es una herramienta poderosa')]"));
            System.out.println("El párrafo de XPath está presente");
        } catch (NoSuchElementException e) {
            System.out.println("El párrafo de XPath NO está presente");
        }
    }

    public static void validarLinkLeerMas(WebDriver driver) {
        try {
            driver.findElement(By.xpath("//a[text()='Leer más']"));
            System.out.println("El link Leer más está presente");
        } catch (NoSuchElementException e) {
            System.out.println("El link Leer más NO está presente");
        }
    }

    public static void validarSubtituloBuenasPracticas(WebDriver driver) {
        try {
            driver.findElement(By.xpath("//h3[text()='Buenas prácticas de testing']"));
            System.out.println("El h3 de Buenas prácticas está presente");
        } catch (NoSuchElementException e) {
            System.out.println("El h3 de Buenas prácticas NO está presente");
        }
    }

    public static void validarParrafoBuenasPracticas(WebDriver driver) {
        try {
            driver.findElement(By.xpath("//p[contains(text(),'tests claros y mantenibles')]"));
            System.out.println("El párrafo de Buenas prácticas está presente");
        } catch (NoSuchElementException e) {
            System.out.println("El párrafo de Buenas prácticas NO está presente");
        }
    }

    public static void validarLinkVerDetalles(WebDriver driver) {
        try {
            driver.findElement(By.xpath("//a[text()='Ver detalles']"));
            System.out.println("El link Ver detalles está presente");
        } catch (NoSuchElementException e) {
            System.out.println("El link Ver detalles NO está presente");
        }
    }

    public static void validarFilaUsuarioAna(WebDriver driver) {
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

    public static void validarUsuarioJuan(WebDriver driver) {
        try {
            driver.findElement(By.xpath("//td[text()='juan@test.com']"));
            System.out.println("El usuario juan@test.com está presente");
        } catch (NoSuchElementException e) {
            System.out.println("El usuario juan@test.com NO está presente");
        }
    }

    public static void validarRolEditor(WebDriver driver) {
        try {
            driver.findElement(By.xpath("//td[text()='Editor']"));
            System.out.println("El rol Editor está presente");
        } catch (NoSuchElementException e) {
            System.out.println("El rol Editor NO está presente");
        }
    }

    public static void validarTextoDeDerechos(WebDriver driver) {
        try {
            driver.findElement(By.xpath("//p[contains(text(),'Todos los derechos')]"));
            System.out.println("El texto de derechos reservados está presente");
        } catch (NoSuchElementException e) {
            System.out.println("El texto de derechos reservados NO está presente");
        }
    }

    public static void validarPoliticaPrivacidad(WebDriver driver) {
        try {
            driver.findElement(By.xpath("//a[text()='Política de privacidad']"));
            System.out.println("El link Política de privacidad está presente");
        } catch (NoSuchElementException e) {
            System.out.println("El link Política de privacidad NO está presente");
        }
    }
}
