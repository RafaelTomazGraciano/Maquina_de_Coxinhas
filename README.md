# Máquina de Coxinhas

[![Java](https://img.shields.io/badge/Java-17-blue.svg)](https://adoptium.net/pt/temurin/releases/?version=17)
[![Maven](https://img.shields.io/badge/Maven-Build-brightgreen)](https://maven.apache.org/)
[![License: Unlicense](https://img.shields.io/badge/license-Unlicense-blue.svg)](https://unlicense.org/)

Projeto desenvolvido para a disciplina de Programação 2 na [UENP](https://uenp.edu.br/), com o objetivo de simular o controle de estoque de uma máquina de coxinhas utilizando JavaFX.

## Descrição

A Máquina de Coxinhas é uma aplicação desktop simples que permite:
- Abastecer o estoque de coxinhas
- Vender uma ou múltiplas coxinhas
- Zerar o estoque
- Visualizar a quantidade atual de coxinhas
- Exibir mensagens de erro para operações inválidas

A interface gráfica foi construída com JavaFX, proporcionando uma experiência intuitiva e amigável ao usuário.

## Estrutura do Projeto

```
Máquina de Coxinhas/
├── pom.xml
├── src/
│   └── main/
│       ├── java/
│       │   └── com/example/estoque/
│       │       ├── App.java
│       │       ├── MaquinaCoxinha.java
│       │       └── TelaController.java
│       └── resources/
│           └── com/example/estoque/
│               └── tela.fxml
```

## Requisitos
- Java 17
- Maven 3.6+

## Como Executar

1. Certifique-se de ter o Java 17 instalado.
2. Clone este repositório.
3. No terminal, navegue até a pasta `Máquina de Coxinhas`.
4. Execute o comando:

```sh
mvn clean javafx:run
```

A aplicação será iniciada com a interface gráfica.

## Funcionalidades
- **Abastecer**: Adiciona coxinhas ao estoque.
- **Vender**: Remove uma ou mais coxinhas do estoque, se houver quantidade suficiente.
- **Zerar Máquina**: Zera o estoque de coxinhas.
- **Mensagens de Erro**: Informa quando não há coxinhas suficientes para venda ou estoque zerado.

## Licença

Este projeto está licenciado sob a [The Unlicense](https://unlicense.org/). Consulte o arquivo LICENSE para mais detalhes.