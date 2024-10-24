# APP

## Descrição

Este projeto é uma aplicação web para gerenciar o cadastro de colaboradores, categoria e produtos.
## Funcionalidades

### Parte 1: Cadastro de Produtos

1. **Cadastro de Produtos:**
   - Permite adicionar novos Produtos com os seguintes campos:
     - Nome
     - Preço
     - Categoria

2. **Listagem de Produtos:**
   - Exibe a lista de Produtos cadastrados.

3. **Editar e apagar Produtos:**
   - Ao clicar em uma ação do Produtos na lista, o usuario pode apagar ou editar o produto.

### Parte 2: Cadastro de Categoria

1. **Descrição da Categoria:**
   - Permite adicionar novas Categoria com uma descrição detalhada.

2. **Listagem de Categoria:**
   - Exibe a lista de Categoria cadastradas.


### Bônus (opcional):
- Implementado autenticação usando JWT (JSON Web Tokens) para proteger o acesso à aplicação.
- Rota de login, e cadastro de usuario

## Tecnologias Utilizadas

- Java 17
- Spring Boot 3.3.2
- Spring Data JPA
- Spring Security
- Spring Validation
- H2 Database para testes
- Lombok para facilitar a criação de classes
- JWT para autenticação (bônus)

- Execução do Projeto
Para executar o projeto, você precisará ter o Java 17 e o Maven instalados. Siga os passos abaixo:

Clone este repositório:
```shell
git clone <URL_DO_REPOSITORIO>
cd APP
```

## Installation DB app with docker(Mysql)

```bash
# Criando e rodando imagem docker com o MYSQL
$ docker run --name mysql-container -e MYSQL_ROOT_PASSWORD=senha_docker -e MYSQL_DATABASE=db_docker -p 3306:3306 -d mysql:8.0 --default-authentication-plugin=mysql_native_password
```


```shell
mvn spring-boot:run
```

## Estrutura do Projeto

O projeto segue o padrão de estrutura do Maven. Abaixo, um resumo do arquivo `pom.xml`:

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0" ... >
    <modelVersion>4.0.0</modelVersion>
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>3.3.2</version>
        <relativePath/> <!-- lookup parent from repository -->
    </parent>
    ...
    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-security</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-validation</artifactId>
        </dependency>
        ...
    </dependencies>
    ...
</project>
```

## Rotas da Aplicação

### Colaboradores

| Método | Rota                     | Descrição                                   |
|--------|--------------------------|---------------------------------------------|
| GET    | `/api/collaborator/{id}`     | Busca um colaborador pelo ID.              |
| GET    | `/api/collaborator`          | Lista todos os colaboradores.               |
| POST   | `/api/collaborator`          | Cria um novo colaborador.                   |
| PUT    | `/api/collaborator/{id}`     | Atualiza um colaborador existente pelo ID.  |
| DELETE | `/api/collaborator/{id}`     | Remove um colaborador pelo ID.              |

### Produto

| Método | Rota                   | Descrição                                   |
|--------|------------------------|---------------------------------------------|
| GET    | `/api/products/{id}`       | Busca uma produto pelo ID.                |
| GET    | `/api/products`            | Lista todos os produtos.                  |
| POST   | `/api/products`            | Cria um novo produto.                    |
| PUT    | `/api/products/{id}`       | Atualiza um produto existente pelo ID.    |

### Categoria

| Método | Rota                   | Descrição                                   |
|--------|------------------------|---------------------------------------------|
| GET    | `/api/categories/{id}`       | Busca uma categoria pelo ID.                |
| GET    | `/api/categories`            | Lista todos os categorias.                  |
| POST   | `/api/categories`            | Cria uma nova categoria.                    |
| PUT    | `/api/categories/{id}`       | Atualiza uma categoria existente pelo ID.    |


## Stay in touch

- Author - https://www.linkedin.com/in/jefferson-coelho/
- Website - https://github.com/BioJJ
- Twitter - https://twitter.com/bio_jefferson
