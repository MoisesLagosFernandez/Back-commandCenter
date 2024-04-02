# CommanCenter - Sistema de Gestión de Incidentes

CommanCenter es una aplicación de gestión de incidentes que permite a los usuarios crear y administrar incidentes de manera eficiente.

## Tecnologías Utilizadas

- Java 17
- Spring Boot 3.1.4
- JPA
- MySQL
- Lombok
- Maven
- Security
- jsonwebtoken

## Configuración del Proyecto

1. Clona el repositorio:

```bash
git clone https://github.com/MoisesLagosFernandez/Back-commandCenter.git
```

2. Configura la base de datos MySQL en src/main/resources/application.properties. Asegúrate de proporcionar la URL de tu base de datos, nombre de usuario y contraseña. Utiliza la siguiente configuración como referencia:

```bash
  server.port=4000

  spring.datasource.url=jdbc:mysql://localhost:3306/commandcenter?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true
  spring.datasource.username=root
  spring.datasource.password=TU_PASS
  spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
  spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect

  spring.jpa.hibernate.ddl-auto=update

  # VER SQL
  spring.jpa.properties.hibernate.format_sql=true
  logging.level.org.hibernate.SQL=DEBUG
  logging.level.org.hibernate.type.description.sql.BasicBinder=TRACE

```
3. Ejecuta la aplicación:

```bash
mvn spring-boot:run
```
4. Accede a la API a través de http://localhost:4000/api.

## Endpoints de la API
La API proporciona endpoints para interactuar con:

- Login
- Roles
- Departamentos
- Usuarios
- Tipos de Ticket
- Estados
- Empresas
- Contratos
- Regiones
- Dispositivos
- Tickets
- SLAs (Acuerdos de nivel de servicio)
- Tipos de Registro
- Registros
- Comentarios

##  Autor

Moises Lagos Fernandez

##  Faltante Y NOTAS

- Autenticacion del JWT
- PASAR A ENUM Tipos de Ticket
- Pasar secret key a variable de entorno en JWTSERVICE

