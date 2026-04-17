# FilesB7
### 🚀 FilesB7 - Local File Transfer System
O FilesB7 é um ecossistema de transferência de arquivos de via de mão dupla (PC ↔ Mobile) que opera via rede local (Wi-Fi). Desenvolvido para oferecer uma alternativa rápida, privada e sem as limitações de tamanho de arquivos impostas por serviços de nuvem convencionais.

### 🛠️ Tecnologias Utilizadas
Backend: Java 17+ com Spring Boot

Banco de Dados: PostgreSQL (Gerenciado via Supabase)

Persistência: Spring Data JPA / Hibernate

Segurança & Histórico: Rastreamento de transferências por dispositivo e status.

Arquitetura: REST API com suporte a CORS para conexões mobile.

### 📌 Funcionalidades
[x] Upload Bidirecional: Envio de arquivos do celular para o PC e vice-versa.

[x] Gerenciamento de Metadados: Armazenamento de informações como nome original, tamanho, tipo de conteúdo e data.

[x] Histórico de Transferências: Registro detalhado de cada ação (Upload/Download) e status da operação.

[x] Storage Híbrido: Metadados no Supabase e arquivos físicos armazenados localmente no servidor (PC).

### 📂 Estrutura do Banco de Dados
O projeto utiliza três entidades principais relacionadas:

Files: Armazena os detalhes dos arquivos e a referência de armazenamento.

Devices: Identifica os dispositivos que interagem com o servidor.

Transfer History: Log completo de transações com suporte a Enums (SUCCESS, PENDING, FAILED).

### ⚙️ Como rodar o projeto
1. Pré-requisitos
JDK 17 ou superior.

Maven.

Conta no Supabase.

2. Configuração do Ambiente
Crie um arquivo .env na raiz do projeto ou configure no seu application.properties:
```
DB_URL=jdbc:postgresql://your-supabase-url.com:5432/postgres
DB_USERNAME=your_username
DB_PASSWORD=your_password
```
```
mvn spring-boot:run
```
### 📱 Como conectar o celular
Certifique-se de que o PC e o Celular estão na mesma rede Wi-Fi.

Descubra o IP do seu PC (ipconfig no Windows).

Acesse os endpoints via mobile(Voce pode fazer isso com o PostMan mobile):
```
Listar Arquivos: GET http://seu-ip:8080/api/files

Download: GET http://seu-ip:8080/api/files/download/{id}

Upload: POST http://seu-ip:8080/api/files/upload (via multipart/form-data)
```
### 👨‍💻 Autor
Matheus - Desenvolvedor Web / Estudante de Ciência da Computação
