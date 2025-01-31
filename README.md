# Artist - challenge
 Um projeto em **Java + Spring Boot** para gerenciar artistas, álbuns e músicas.

## Tecnologias Utilizadas
- **Java 17**
- **Spring Boot 3**
  - Spring Web
  -   Spring Data JPA
  -   H2 Database
  -   PostgreSQL Driver
- **Banco de Dados PostgreSQL**
- **H2 Database** (para testes)
- **Hibernate** (ORM - Mapeamento Objeto Relacional)
- **jUnit 5** (parateste unitários)

## Como Rodar o Projeto
### Pré-requisitos
Antes de iniciar, você precisará ter instalado:
- [JDK 17+](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- [Maven](https://maven.apache.org)
- [PostgreSQL](https://www.postgresql.org)
- [VsCode](https://code.visualstudio.com) ou sua IDE de preferência

## Passos Para Executar
1. Clone o repositório:  <br>
```Java
  git clone https://github.com/GabrielRoOl/artist-challenge
  cd artist-challenge
```
2. Configure o **PostgreSQL** no ``application.properties``:  <br>
```properties
  spring.datasource.url=jdbc:postgresql://localhost:5432/seu_banco
  spring.datasource.username=seu_usuario
  spring.datasource.password=sua_senha
```
3. Compile e execute o projeto com: <br>
```bash
  mvn spring-boot:run
```

## Licença
Projeto open-source sob a licença **MIT**.

