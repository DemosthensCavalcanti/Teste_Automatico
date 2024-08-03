package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CadastroClienteTest extends BaseTest {

    @Test
    public void testCadastroCliente() {
        driver.get("http://provaqa.prc.rpe.tech:9080/desafioqa/");

        // login
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("login")).click();

        // cadastro de cliente
        driver.findElement(By.linkText("QA")).click();
        driver.findElement(By.linkText("Clientes")).click();
        driver.findElement(By.linkText("Incluir")).click();

        // cadastro de cliente
        driver.findElement(By.name("nome")).sendKeys("Cliente Teste");
        driver.findElement(By.name("cpf")).sendKeys("12345678900");
        Select statusSelect = new Select(driver.findElement(By.name("status")));
        statusSelect.selectByVisibleText("Ativo"); // ou "Inativo" conforme necessário
        driver.findElement(By.name("saldo")).sendKeys("100");
        driver.findElement(By.name("salvar")).click();

        // Verifica se o cadastro foi bem-sucedido
        String mensagemSucesso = driver.findElement(By.id("mensagemSucesso")).getText();
        Assert.assertEquals(mensagemSucesso, "Cliente cadastrado com sucesso", "Mensagem de sucesso está incorreta");
    }
}
