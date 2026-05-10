# 📁 FilesB7

Sistema fullstack de transferência bidirecional de arquivos desenvolvido utilizando Java no backend e JavaScript puro no frontend.

O projeto foi criado com foco em aprofundar conhecimentos em:
- desenvolvimento backend
- comunicação cliente-servidor
- transferência de arquivos
- APIs e comunicação em rede
- manipulação de arquivos
- integração frontend + backend
- arquitetura de software

A aplicação permite envio e recebimento de arquivos através de uma interface web integrada ao backend Java.

---

# 🚀 Tecnologias Utilizadas

## Backend
- Java
- Java IO
- Maven

## Frontend
- HTML5
- CSS3
- JavaScript Vanilla

## Ferramentas
- Git
- GitHub

---

# 🏗️ Arquitetura do Projeto

O projeto foi estruturado utilizando separação entre frontend e backend, organizando responsabilidades entre comunicação em rede, manipulação de arquivos e interface da aplicação.

Estrutura conceitual:

```bash
FilesB7/
 ┣ backend/
 ┃ ┣ config/
 ┃ ┣ devices/
 ┃ ┣ files/
 ┃ ┗ transferHistory/
 ┣ resources/
 ┃ ┣ html/
 ┃ ┣ css/
 ┃ ┗ js/
```

---

# 📚 Funcionalidades

- Upload de arquivos
- Download de arquivos
- Comunicação cliente-servidor
- Transferência bidirecional de arquivos
- Interface web para interação do usuário
- Manipulação de arquivos no backend
- Persistência local de arquivos
- Integração frontend + backend

---

# 🌐 Frontend

O frontend foi desenvolvido utilizando JavaScript puro (Vanilla JS), sem utilização de frameworks externos.

Funcionalidades implementadas:
- Interface de envio de arquivos
- Comunicação com backend
- Manipulação de eventos
- Atualização dinâmica da interface

Tecnologias:
- HTML5
- CSS3
- JavaScript Vanilla

---

# ⚙️ Backend

O backend foi desenvolvido em Java com foco em comunicação em rede e gerenciamento de arquivos.

Responsabilidades:
- Gerenciamento de conexões
- Recebimento e envio de arquivos
- Processamento das transferências
- Manipulação de streams
- Persistência de arquivos

Tecnologias:
- Java
- Java IO
- Maven

---

# 🌍 Comunicação Cliente-Servidor

A aplicação utiliza comunicação cliente-servidor para realizar transferência de arquivos entre frontend e backend.

Fluxo básico:

```text
Frontend → Requisição → Backend
Backend → Processamento → Resposta
```

Conceitos aplicados:
- Sockets
- Streams
- Transferência de dados
- Integração frontend/backend

---

# 📂 Estrutura do Projeto

```bash
FilesB7/
 ┣ backend/
 ┃ ┣ src/
 ┃ ┃ ┣ config/
 ┃ ┃ ┣ devices/
 ┃ ┃ ┣ files/
 ┃ ┃ ┗ transferHistory/
 ┣ frontend/
 ┃ ┣ index.html
 ┃ ┣ css/
 ┃ ┗ js/
 ┣ pom.xml
 ┗ README.md
```

---

# ▶️ Como Executar o Projeto

## Clonar o repositório

```bash
git clone https://github.com/MatheusCristophi/FilesB7.git
```

## Realizar a conexão com seu Supabase

renomear o .env.local para .env
```
SUPABASE_URL=
SUPABASE_USER=
SUPABASE_PASSWORD=
```

---

## Entrar na pasta do projeto

```bash
cd FilesB7
```

---

# ▶️ Executar Backend

## Rodar com sua IDE

## Navegar no endereço

```
localhost:8080
```
---

# 🧠 Conceitos Aplicados

- Desenvolvimento Fullstack
- Programação Orientada a Objetos
- Armazenamento em nuvem com supabase
- Comunicação Cliente-Servidor
- Socket Programming
- Manipulação de Arquivos
- Transferência de Dados
- Java Backend
- JavaScript Vanilla
- Integração Frontend + Backend
- Arquitetura Modular
- Versionamento com Git/GitHub

---

# 🎯 Objetivo do Projeto

O projeto foi desenvolvido com objetivo de aprofundar conhecimentos em desenvolvimento fullstack, comunicação em rede e transferência de arquivos utilizando Java no backend e JavaScript puro no frontend.

Além disso, a aplicação serviu para praticar integração entre frontend e backend, manipulação de arquivos e construção de aplicações distribuídas.

---

# 👨‍💻 Autor

Desenvolvido por Matheus Cristopher.

GitHub: https://github.com/MatheusCristophi
