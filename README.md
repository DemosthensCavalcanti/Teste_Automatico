# Projeto de Testes Automatizados com Selenium

Este projeto contém uma coleção de testes automatizados para uma aplicação de vendas, utilizando Selenium e TestNG. O objetivo é garantir que as funcionalidades de login, cadastro de cliente e transação estejam funcionando corretamente.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação para os testes.
- **Selenium**: Biblioteca para automação de testes em aplicações web.
- **TestNG**: Framework de testes para executar e gerenciar os casos de teste.
- **Maven**: Gerenciador de dependências e construção do projeto.

## Pré-requisitos

Antes de executar os testes, certifique-se de que você tem os seguintes itens instalados:

- **Java JDK** (versão 8 ou superior)
- **Apache Maven**
- **WebDriver** do navegador (Chrome, Firefox, etc.)

## Configuração do Projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git
   cd seu-repositorio
2. Instale as dependências do Maven:
   ```bash
   mvn install
Execução dos Testes
Para executar os testes, utilize o seguinte comando na raiz do projeto:
  ```bash
  mvn test -DsuiteXmlFile=testng.xml
