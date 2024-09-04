# Parcial 1 Web-2

Este repositório contém a nossa resolução para a atividade prática proposta como nota parcial 1 pela disciplina de Desenvolvimento Web 2 no curso de BSI da UNIME.

## Proposta da Atividade prática (PARCIAL I):
Construa, em equipe, uma API REST que gerencia Livros. Um livro pode ter: Título, Resumo, Quantidade de páginas, autores e Categoria.
Deve ser possível: Cadastrar livros, Listar todos os livros e Exibir um livro em específico.
Deve haver: Um Controller, um Repository, um Service, Um Exception customizado, Um Entity e um Request
Não é necessário relacionar tabelas do banco de dados, ou seja, tudo será feito em uma única tabela.
Os autores devem ser armazenados como strings separadas por virgula, ex.: Paulo, Maria, Pedro

## Nossa Resolução 

### Modelo Json: 
```json
{
  "titulo": "Titulo do livro",
  "resumo": "Descrição do livro",
  "qtdpaginas": 9999,
  "categoria": "categoria do livro",
  "autor": "autor 1, autor 2, autor 3"
}
```

### Orientações: 
Certifique-se de possuir o JDK 17 e um banco MariaDB nomeado "livraria" em execução.

Após clonar o projeto, abra-o em sua IDE de preferência (recomendamos o IntelliJ IDEA Community) e execute:

Para compilar o projeto:
```sh
mvn clean install

```
Para executar o projeto
```sh
mvn spring-boot:run

```

No IntelliJ IDEA, você pode simplesmente executar o plugin do Maven. :)

### Sobre a API: 
- Para Cadastrar livros:
** `POST: /api/livros/cadastro`
- Para Listar todos os livros:
** `GET: /api/livros/ `
- Para  Exibir um livro em específico:
** `GET: /api/livros/{id}`
