/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pineapple.eckotur.web.test;


import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.junit.runners.MethodSorters;
import org.junit.FixMethodOrder;
import org.junit.Test;

/**
 *
 * @author JuanCruz
 */
public class RegisterTest {
        // Es la instancia inicial del web driver que controlará el navegador firefox
        private static WebDriver driver;
        // url en el cual se aloja la página web (en este caso localhost:8080)
        private static String baseUrl;
        // variable que indica si varios alert consecutivos (alert javascript) se tomarán
        private static boolean acceptNextAlert = true;
        private static StringBuffer verificationErrors = new StringBuffer();
 
       /*La anotación @BeforeClass indica lo que se debe ejecutar ANTES de correr el archivo de pruebas. Este método instancia un nuevo driver firefox (causando la apertura de una ventana física de firefox).*/
        @BeforeClass
        public static void setUp() throws Exception {
            driver = new FirefoxDriver();
        // se define el url base del proyecto web
            baseUrl = "http://localhost:8080/login.html";
        /* Indica cuanto se espera para la respuesta de cualquier comando realizado hacia el navegador*/
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
 
 
        // La anotación @AfterClass indica lo que se debe ejecutar DESPUES de ejecutar
        // el archivo de pruebas. Este método cierra la ventana de firefox
        // abierta por @BeforeClass que se utilizó para la prueba.
        @AfterClass
        public static void tearDown() throws Exception {
            // Se cierra el navegador.
            driver.quit();
           // Se verifica que se haya cerrado efectivamente el navegador.
            String verificationErrorString = verificationErrors.toString();
            if (!"".equals(verificationErrorString)) {
                fail(verificationErrorString);
            }
        }
        
        
        @Test
    public void t1Register() throws Exception {
 
      
        boolean success = false;
      
 
      
     
       
        /**
         * Comando que busca el elemento 'name1' en el html actual. Ver ids en country.tpl.html
         * Posteriormente limpia su contenido (comando clear).
         */
        driver.findElement(By.id("nombre")).clear();
        /**
         * Comando que simula la escritura de un valor en el elemento(sendKeys)
         * con el String de parámetro sobre // el elemento encontrado.
         */
        driver.findElement(By.id("nombre")).sendKeys("Juan");
 
        
        /**
         * Comando que busca el elemento 'name1' en el html actual. Ver ids en country.tpl.html
         * Posteriormente limpia su contenido (comando clear).
         */
        driver.findElement(By.id("usuario")).clear();
        /**
         * Comando que simula la escritura de un valor en el elemento(sendKeys)
         * con el String de parámetro sobre // el elemento encontrado.
         */
        driver.findElement(By.id("usuario")).sendKeys("usuario");
 
        
        
        /**
         * Comando que busca el elemento 'name1' en el html actual. Ver ids en country.tpl.html
         * Posteriormente limpia su contenido (comando clear).
         */
        driver.findElement(By.id("correo")).clear();
        /**
         * Comando que simula la escritura de un valor en el elemento(sendKeys)
         * con el String de parámetro sobre // el elemento encontrado.
         */
        driver.findElement(By.id("correo")).sendKeys("usuario@gmail.com");
 
        
         /**
         * Comando que busca el elemento 'name1' en el html actual. Ver ids en country.tpl.html
         * Posteriormente limpia su contenido (comando clear).
         */
        driver.findElement(By.id("pass")).clear();
        /**
         * Comando que simula la escritura de un valor en el elemento(sendKeys)
         * con el String de parámetro sobre // el elemento encontrado.
         */
        driver.findElement(By.id("pass")).sendKeys("contrasena");
 
        
         /**
         * Comando que busca el elemento 'name1' en el html actual. Ver ids en country.tpl.html
         * Posteriormente limpia su contenido (comando clear).
         */
        driver.findElement(By.id("pass2")).clear();
        /**
         * Comando que simula la escritura de un valor en el elemento(sendKeys)
         * con el String de parámetro sobre // el elemento encontrado.
         */
        driver.findElement(By.id("pass2")).sendKeys("contrasena");
 
        
        
        
       
        /**
         * Comando que busca el boton Save y luego hace click
         * Comando que duerme el Thread del test por 2 segundos
         */
        driver.findElement(By.id("btnRegistro")).click();
        Thread.sleep(2000);
 
 
 
         /** Comando que obtiene todos los elementos de la tabla
           * Se realiza la verificación si el elemento creado está en la lista
         */
        if (driver.getCurrentUrl().contains("account.html")) {
            success = true;
        }
        /**
         * la prueba es exitosa si se encontró
         * el nuevo elemento creado en la lista.
         */
        assertTrue(success);
        Thread.sleep(2000);
    }
        
}
