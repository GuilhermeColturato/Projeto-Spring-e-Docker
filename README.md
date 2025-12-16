# 🚀 Projeto Spring Boot com Docker

API REST desenvolvida com **Java e Spring Boot**, utilizando **Docker** para containerização da aplicação.  
O projeto tem como objetivo demonstrar uma aplicação backend bem estruturada, com operações CRUD e ambiente padronizado para execução.

---

## 🧩 Tecnologias Utilizadas

- **Java**
- **Spring Boot**
- **Maven**
- **Docker**
- **API REST**

Essas tecnologias permitem o desenvolvimento de aplicações backend modernas, organizadas e facilmente executáveis em qualquer ambiente.

---

## ⚙️ Funcionalidades

- API REST para operações de cadastro, consulta, atualização e remoção de dados (CRUD)
- Arquitetura em camadas:
  - Controller
  - Service
  - Repository
- Containerização da aplicação com Docker
- Ambiente padronizado para execução local ou em servidores

---

## 📋 Pré-requisitos

Antes de executar o projeto, é necessário ter instalado:

- **Java JDK 17 ou superior**
- **Maven**
- **Docker**

---

## ▶️ Como executar o projeto

### 1️⃣ Clonar o repositório

git clone https://github.com/GuilhermeColturato/Projeto-Spring-e-Docker.git
cd Projeto-Spring-e-Docker

### 2️⃣ Gerar o build da aplicação
mvn clean package

### 3️⃣ Criar a imagem Docker
docker build -t projeto-spring-docker .

#### 4️⃣ Executar o container
docker run -p 8080:8080 projeto-spring-docker



