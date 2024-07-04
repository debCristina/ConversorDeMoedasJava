# Conversor de Taxa de Câmbio

Este é um projeto em Java que demonstra um conversor de taxa de câmbio utilizando uma API externa. O projeto inclui um gerenciador de opções que permite ao usuário escolher diferentes conversões de moeda.

## Objetivo

Este projeto em Java foi desenvolvido com o objetivo de consolidar conceitos fundamentais da linguagem Java e práticas de desenvolvimento, incluindo:
- Conpreensão dos conceitos de POO (Programação orientada a objetos).
- Realização de requisições HTTP para uma API externa.
- Manipulação de JSON para interpretar e processar dados de taxa de câmbio.
- Tratamento de exceções para lidar com erros esperados, como respostas nulas da API ou opções inválidas do usuário.

## Funcionalidades

- Realiza requisições à API da Exchange Rate API para obter as taxas de câmbio mais recentes.
- Converte valores de uma moeda para outra com base nas taxas obtidas.
- Trata exceções durante o processamento, como erros na requisição HTTP, resposta nula da API e erros inesperados.

## Estrutura do Projeto

O projeto está organizado da seguinte forma:

- **Modelos**: Contém as classes relacionadas ao processamento de taxas de câmbio (`ColetorTaxaCambio` e `GerenciadorOpcoes`).
- **Main**: Contém a classe principal (`Main`) que executa a interação com o usuário e controla o fluxo do programa.
- **Excecoes**: Contém classes de exceção personalizadas para lidar com erros específicos durante a execução.

### Como usar

1. **Clone o repositório para a sua máquina local:**
2. **Configure a variável de ambiente `EXCHANGE_RATE_API_KEY` com sua chave de API da Exchange Rate API:**
3. **Compile e execute o projeto em sua IDE Java.**
    - Abra o projeto na sua IDE de preferência (como IntelliJ IDEA ou Eclipse).
    - Certifique-se de que todas as dependências estejam configuradas corretamente.
    - Execute a classe principal (`Main`) para iniciar o conversor de moedas.

### Minha experiência

Desenvolver este projeto foi uma jornada desafiadora e ao mesmo tempo extremamente gratificante. Sendo uma iniciante na linguagem Java, no uso de APIs e na realização de requisições HTTP, cada passo foi uma oportunidade de aprendizado.

Implementar todos os aspectos necessários para o funcionamento do conversor de moedas, desde a coleta de dados da API até a manipulação de JSON e o tratamento de exceções, exigiu muita dedicação. No entanto, a conclusão deste projeto me proporcionou uma compreensão mais profunda dos conceitos fundamentais de Java e das boas práticas de desenvolvimento de software.

Embora o projeto ainda possa necessitar de melhorias futuras, ele representa um marco importante na minha trajetória de aprendizado. A experiência adquirida foi crucial para consolidar meus conhecimentos no Java, em programação orientada a objetos, manipulação de APIs, e tratamento de exceções em Java.

### Autor
Este projeto foi desenvolvido por Débora Cristina.
