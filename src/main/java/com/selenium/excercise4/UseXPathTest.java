package com.selenium.excercise4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.awt.datatransfer.SystemFlavorMap;
import java.nio.file.Paths;
import java.util.List;

public class UseXPathTest {
    private static WebDriver driver;

    public static void main( String[] args )
    {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        String path = Paths.get("C:\\Users\\UMonteverde\\Desktop\\ejercicios java\\ejercicios selenium\\TestSelenium-main\\target\\classes\\useXPATH.html").toUri().toString();
        driver.get(path);
        tituloTest(driver);
        linksNavTest(driver);
        h2Test(driver);
        formTest(driver);
        buttonsFormTest(driver);
        divArticulosTest(driver);
        tdTrTest(driver);
        footerTest(driver);

        driver.close();

    }


    public static void tituloTest(WebDriver driver){
        WebElement titulo = driver.findElement(By.xpath("//h1"));
        if(titulo != null){
            System.out.println("El elemento "+ titulo.getText() + " existe");
        }else{
            System.out.println("El elemento titulo"+ titulo.getText() +" NO existe");
        }
    }


    public static void linksNavTest(WebDriver driver){
        List<WebElement> linksNav = driver.findElements(By.xpath("//nav[@class='navigation']//li"));
        for(WebElement link:linksNav){
            List<WebElement> as = link.findElements(By.tagName("a"));
            for(WebElement a: as) {
                if (a != null) {
                    System.out.println("El elemento a: " + a.getText() + " Existe");
                }
            }
        }
    }


    public static void h2Test(WebDriver driver){
        List<WebElement> h2s = driver.findElements(By.xpath("//section//h2"));
        for(WebElement h2:h2s){
            if(h2!=null){
                System.out.println("El elemento h2:  "+h2.getText() +" existe");
            }
        }
    }


    public static void formTest(WebDriver driver){
        List<WebElement> sections = driver.findElements(By.xpath("//section"));

        WebElement section = sections.get(0);
        WebElement sms = driver.findElement(By.xpath("//form[contains(., 'SMS')]"));
        WebElement email = driver.findElement(By.xpath("//form[contains(., 'Email')]"));
        if(sms != null ){
            System.out.println("El elemento sms existe dentro del form");
        }

        if(email != null ){
            System.out.println("El elemento email existe dentro del form");
        }
        List<WebElement> labels = section.findElements(By.tagName("label"));


        for(WebElement label: labels) {
            List<WebElement> inputs = label.findElements(By.tagName("input"));
            if (label != null) {
                if (!label.getText().trim().isEmpty()) {
                    System.out.println("el label: " + label.getText() + " Existe");
                }
            }
            for (WebElement input : inputs) {
                if (!input.getAttribute("value").isEmpty() || !input.getAttribute("placeholder").isEmpty()) {
                    System.out.println("el input " + input.getAttribute("value") + input.getAttribute("placeholder") + "Existe");
                }
            }
        }
        WebElement textArea = driver.findElement(By.tagName("textarea"));

        if(textArea.getAttribute("placeholder") != null){
            System.out.println("El elemento "+ textArea.getAttribute("placeholder") + " existe");
        }
    }

    public static void buttonsFormTest(WebDriver driver){
        List<WebElement> sections = driver.findElements(By.xpath("//section"));
        WebElement section =  sections.get(0);
        List<WebElement> buttons = section.findElements(By.tagName("button"));
        for(WebElement button: buttons){
            if(button != null){
                System.out.println("El boton " + button.getText() + " existe");
            }
        }
    }
    public static void divArticulosTest(WebDriver driver) {
        List<WebElement> articulos = driver.findElements(By.xpath("//section[@class='container']//div"));
        for(WebElement articulo:articulos){
            List<WebElement> h3s= articulo.findElements(By.tagName("h3"));

            List<WebElement> ps = articulo.findElements(By.tagName("p"));

            List<WebElement> as = articulo.findElements(By.tagName("a"));
            for(WebElement h3:h3s){
                System.out.println("El h3 : " + h3.getText() + " Existe");
            }
            for(WebElement p:ps){
                System.out.println("El p : " + p.getText() + " Existe");
            }

            for(WebElement a:as){
                System.out.println("El a : " + a.getText() + " Existe");
            }
        }
    }



    public static void tdTrTest(WebDriver driver){
        List<WebElement> trs= driver.findElements(By.xpath("//section[@class='container']//table//tr"));
        for(WebElement tr: trs){
            List<WebElement> tds = tr.findElements(By.tagName("td"));
            List<WebElement> ths = tr.findElements(By.tagName("th"));

            for(WebElement td:tds){
                System.out.println("El elemento td: " +td.getText()+"Existe");
            }

            for(WebElement th:ths){
                System.out.println("El elemento th: " + th.getText() +" Existe");
            }
        }

    }


    public static void footerTest(WebDriver driver){
        List<WebElement> footerElements = driver.findElements(By.tagName("footer"));
        for(WebElement footerElement:footerElements){
            WebElement a = footerElement.findElement(By.tagName("a"));

            WebElement p = footerElement.findElement(By.tagName("p"));
            if(a!= null){
                System.out.println("El atribibuto a: " + a.getText() + "Existe");
            }
            if(a!= null){
                System.out.println("El atribibuto p: " + p.getText() + "Existe");
            }
        }
    }
}
