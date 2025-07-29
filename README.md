# API-Banco

## Sobre o Projeto

API-Banco é uma API RESTful desenvolvida em Java com Spring Boot para gerenciamento de transações financeiras pessoais. Permite aos usuários registrar, categorizar e visualizar suas receitas e despesas.

## Tecnologias Utilizadas

- **Java 21:** Linguagem de programação principal.
- **Spring Boot 3.5.3:** Framework para criação de aplicações Java.
- **Spring Data JPA:** Para persistência de dados.
- **Spring Web:** Para criação de APIs RESTful.
- **H2 Database:** Banco de dados em memória para desenvolvimento e teste.
- **Lombok:** Para reduzir código boilerplate.
- **Maven:** Para gerenciamento de dependências e build do projeto.

## Como Executar

1.  **Clone o repositório:**
    ```bash
    git clone https://github.com/seu-usuario/api-banco.git
    ```
2.  **Navegue até o diretório do projeto:**
    ```bash
    cd api-banco
    ```
3.  **Execute a aplicação com o Maven:**
    ```bash
    ./mvnw spring-boot:run
    ```
A API estará disponível em `http://localhost:8080/api`.

## Endpoints da API

A base da URL para todos os endpoints é `/api`.

### Usuários (`/usuarios`)

-   **POST /usuarios:** Cria um novo usuário.
-   **GET /usuarios:** Retorna todos os usuários.
-   **GET /usuarios/{id}:** Retorna um usuário específico.
-   **PUT /usuarios/{id}:** Atualiza um usuário existente.
-   **DELETE /usuarios/{id}:** Deleta um usuário.

### Transações (`/transacao`)

-   **POST /transacao:** Cria uma nova transação.
-   **GET /transacao:** Retorna todas as transações.
-   **GET /transacao/{id}:** Retorna uma transação específica.
-   **PUT /transacao/{id}:** Atualiza uma transação existente.
-   **DELETE /transacao/{id}:** Deleta uma transação.

### Categorias (`/categorias`)

-   **GET /categorias:** Retorna todas as categorias.

## Estrutura do Banco de Dados

O banco de dados H2 é utilizado e os dados são persistidos no arquivo `./data/dbbanco`. O console do H2 está acessível em `http://localhost:8080/h2-console`.

**Configurações do Banco de Dados:**

-   **URL:** `jdbc:h2:file:./data/dbbanco`
-   **Username:** `sa`
-   **Password:** (em branco)

### Entidades

-   **Usuario:** Representa um usuário da aplicação.
    -   `id` (Long)
    -   `nome` (String)
    -   `email` (String, único)
    -   `senha` (String)
    -   `transacoes` (List<Transacao>)
-   **Transacao:** Representa uma transação financeira.
    -   `id` (Long)
    -   `descricao` (String)
    -   `valor` (Double)
    -   `data` (String)
    -   `usuario` (Usuario)
    -   `categoria` (Categoria)
    -   `tipo` (String)
-   **Categoria:** Representa uma categoria de transação.
    -   `id` (Long)
    -   `descricao` (String)
    -   `transacoes` (List<Transacao>)
