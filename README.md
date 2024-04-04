<p align="center">
  <img src="https://github.com/andrebecker84/AppWebASPNETcoreTP2/assets/39974878/2c3a2ab1-5789-47d3-ade6-e300e2b8af69">
</p>
<br>

<p align="center">DESENVOLVIMENTO DE SERVIÇOS WEB E TESTES COM JAVA</p>

<p align="center">Teste de Performance - TP3</p>
<br><br>

<p align="center">ALUNO: ANDRÉ LUIS BECKER</p>
<p align="center">PROF.: ELBERTH LINS COSTA DE MORAES</p>
<br><br>

# Projeto de Gerenciamento de Academias

## Introdução

Este projeto consiste na construção de uma API WEB Restful que implementa operações CRUD (Create, Read, Update, Delete) para um sistema de gerenciamento. Durante o desenvolvimento, foram realizadas as seguintes tarefas:

- Realização de `REQUESTS` para uma `API RESTful` utilizando o software `POSTMAN`.
- Utilização de `REQUESTS` com método `GET` usando parâmetros através do `POSTMAN`.
- Envio de dados em formato `JSON` para uma `API RESTful` utilizando o método `POST` através do `POSTMAN`.
- Exclusão de dados de uma `API RESTful` utilizando o método `DELETE` através do `POSTMAN`.

## Descrição

  Este projeto é uma continuação do trabalho anterior, que abordava os tópicos TP1 e TP2. No entanto, devido à necessidade de desenvolver uma aplicação web utilizando Spring Boot e Maven, com o objetivo de implementar operações CRUD vinculadas a uma API WEB RESTful, foi necessário iniciar um novo projeto. Isso se deu devido às dificuldades encontradas na tentativa de simular um banco de dados utilizando as dependências apresentadas em aula. Os códigos anteriores, que simulavam um plano de negócios de uma corretora de investimentos com cálculos matemáticos para testes, acabaram sendo complexos demais e fugindo um pouco do escopo do projeto atual.

Como a utilização de banco de dados não foi abordada de forma suficiente até o momento, optou-se pela utilização de estruturas de dados do tipo Map para armazenamento temporário das informações. As classes e entidades representadas nesse contexto são Academia e Instrutor. Essas entidades serão manipuladas através de operações CRUD (Create, Read, Update, Delete) dentro de uma API RESTful, seguindo os padrões e diretrizes do protocolo HTTP. O projeto visa atender aos requisitos de maneira eficiente, garantindo a correta modelagem dos recursos, a manipulação adequada dos dados e a integração com uma API externa para obtenção de informações adicionais relevantes para o sistema de gerenciamento.

Além da implementação das classes `Academia` e `Instrutor`, o projeto também incluiu a integração com a API pública ViaCEP para obtenção de informações de endereço. Isso foi alcançado por meio da utilização de um cliente `Feign`, uma ferramenta que facilita a comunicação com serviços RESTful.

## Integração com a API ViaCEP

  Através da criação de uma interface chamada `IEnderecoClient`, foi definido um método `buscarCep`, responsável por realizar uma solicitação GET à API ViaCEP, fornecendo o CEP como parâmetro. Essa interface foi anotada com `@FeignClient`, indicando o nome do cliente `Feign` e a URL base da API ViaCEP.

Dentro do projeto, ao injetar essa interface em uma classe de serviço dedicada ao gerenciamento de endereços, como por exemplo `EnderecoService`, torna-se possível utilizar o método `buscarCep` para obter informações detalhadas de um endereço a partir de um CEP específico.

Essa integração permite que o sistema de gerenciamento de academias obtenha automaticamente informações precisas de endereço, melhorando a qualidade dos dados cadastrados e a experiência do usuário durante o processo de cadastro de academias e instrutores.

## Licença

Este projeto está licenciado sob a Licença MIT - consulte o arquivo [LICENSE.md](LICENSE.md) para obter detalhes.

---
**Nota:** Este README é uma documentação inicial e pode ser atualizado conforme o projeto evolui e mais funcionalidades são adicionadas.

