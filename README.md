# DiagrammeClasse


configurarion de mairadb

spring.data.jdbc.repositories.enabled=true
spring.datasource.url=jdbc:mysql://localhost:3306/GestionDB?useSSL=false
spring.datasource.username=root
spring.datasource.password=root
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL8Dialect
spring.jpa.properties.hibernate.show_sql = true
spring.jpa.properties.hibernate.format_sql = true
spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation=true
