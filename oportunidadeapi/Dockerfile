# Use imagem do Java
FROM openjdk:17-jdk-slim

# Define diretório de trabalho
WORKDIR /app

# Copia o arquivo jar para dentro do container
COPY target/oportunidadeapi-0.0.1-SNAPSHOT.jar app.jar

# Expõe a porta 8080
EXPOSE 8080

# Comando para rodar o jar
ENTRYPOINT ["java", "-jar", "app.jar"]
