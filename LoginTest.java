package com.example;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testLogin() {
        driver.get("http://provaqa.prc.rpe.tech:9080/desafioqa/");

        // login
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("login")).click();

        // Verifica se o login foi bem-sucedido
        String expectedUrl = "http://provaqa.prc.rpe.tech:9080/desafioqa/inicio";
        Assert.assertTrue(driver.getCurrentUrl().contains(expectedUrl), "http://provaqa.prc.rpe.tech:9080/desafioqa/login");
    }
}
