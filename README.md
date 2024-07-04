#### Um pequeno sistema (API REST) de usuários e departamentos, com os seguintes casos de uso:
![Imagem 2](https://github.com/caiosmo/springboot/blob/main/dominio.png)

#### Desenvolvimento moderno: relacional -> objeto -> json
![Imagem 1](https://github.com/caiosmo/springboot/blob/main/objetos.png)

**CONFIGURAÇÃO DO MAVEN RESOURCES PLUGIN**
```bash
<plugin>
	<groupId>org.apache.maven.plugins</groupId>
	<artifactId>maven-resources-plugin</artifactId>
	<version>3.1.0</version>
</plugin>
```

**CONFIGURAÇÃO DO BANCO DE DADOS**
```bash
# Dados de conexão com o banco H2
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.username=sa
spring.datasource.password=

# Configuração do cliente web do banco H2
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

# Configuração para mostrar o SQL no console
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true


# Configuração para criar as tabelas automaticamente
spring.jpa.hibernate.ddl-auto=create-drop
```

**SCRIPT SQl (import.sql)**
```sql
INSERT INTO tb_department(name) VALUES ('Gestão');
INSERT INTO tb_department(name) VALUES ('Informática');

INSERT INTO tb_user(department_id, name, email) VALUES (1, 'Maria', 'maria@gmail.com');
INSERT INTO tb_user(department_id, name, email) VALUES (1, 'Bob', 'bob@gmail.com');
INSERT INTO tb_user(department_id, name, email) VALUES (2, 'Alex', 'alex@gmail.com');
INSERT INTO tb_user(department_id, name, email) VALUES (2, 'Ana', 'ana@gmail.com');
```
