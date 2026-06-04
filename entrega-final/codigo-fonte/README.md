# Projeto Integrador - API Telemedicina

## Descrição
Projeto desenvolvido para a disciplina de Projeto Integrador utilizando:

- Java 21
- Spring Boot
- MySQL
- Maven
- JPA / Hibernate
- Swagger OpenAPI

A aplicação consiste em uma API REST de gerenciamento de pacientes com operações completas de CRUD.

---

# Funcionalidades

- Criar pacientes
- Listar pacientes
- Buscar paciente por ID
- Atualizar pacientes
- Excluir pacientes

---

# Tecnologias utilizadas

- Java 21
- Spring Boot 3
- Maven
- MySQL 8
- Spring Data JPA
- Hibernate
- Swagger OpenAPI

---

# Como executar o projeto

## Pré-requisitos

- Java 21
- Maven
- MySQL 8

---

## Configuração do banco

Criar banco no MySQL:

```sql
CREATE DATABASE telemedicina;
```

---

## Executar aplicação

```bash
./mvnw spring-boot:run
```

---

# Swagger

Documentação disponível em:

```text
http://localhost:8080/swagger-ui/index.html
```

---

# Endpoints

## Listar pacientes

GET

```text
/pacientes
```

## Buscar paciente por ID

GET

```text
/pacientes/{id}
```

## Criar paciente

POST

```text
/pacientes
```

## Atualizar paciente

PUT

```text
/pacientes/{id}
```

## Remover paciente

DELETE

```text
/pacientes/{id}
```

---

# Testes

Executar testes:

```bash
./mvnw test
```

---

# Autor

Lucas Schwertz