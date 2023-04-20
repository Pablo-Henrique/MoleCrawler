# Imagem base do Docker
FROM openjdk:20-jdk-slim

# Diretório de trabalho dentro do container
WORKDIR /app

# Copia o arquivo pom.xml para dentro do container
COPY pom.xml .

#Instalada o Maven no ambiente docker
RUN apt-get update && \
    apt-get install -y maven

# Baixa as dependências do projeto (necessário para o Docker usar o cache de camadas)
RUN mvn dependency:go-offline -B

# Copia todo o código fonte para dentro do container
COPY src ./src

# Compila o projeto
RUN mvn package

# Expõe a porta 8080
EXPOSE 8080

# Comando para iniciar o projeto
CMD ["java", "-jar", "target/MoleCrawler-0.1.jar"]
