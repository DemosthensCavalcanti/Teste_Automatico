package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TransacaoTest extends BaseTest {

    @Test
    public void testTransacao() {
        driver.get("http://provaqa.prc.rpe.tech:9080/desafioqa/");

        // Realiza o login
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("login")).click();

        // Navega para a página de transação
        driver.findElement(By.linkText("QA")).click();
        driver.findElement(By.linkText("Transações")).click();
        driver.findElement(By.linkText("Incluir")).click();

        // Seleciona o cliente e preenche o valor da transação
        Select clienteSelect = new Select(driver.findElement(By.name("clienteId")));
        clienteSelect.selectByVisibleText("Cliente Teste"); // Ajuste conforme o nome do cliente
        driver.findElement(By.name("valor")).sendKeys("100");
        driver.findElement(By.name("salvar")).click();

        // Verifica se a transação foi bem-sucedida
        String mensagemSucesso = driver.findElement(By.id("mensagemSucesso")).getText();
        Assert.assertEquals(mensagemSucesso, "Transação realizada com sucesso", "Mensagem de sucesso está incorreta");
    }
}
