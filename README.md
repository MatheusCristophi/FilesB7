# FilesB7

### 🚀 FilesB7 - Local File Transfer System
O FilesB7 é uma solução completa (Full Stack) projetada para facilitar a transferência de arquivos entre diferentes dispositivos (como PCs e dispositivos móveis) dentro de uma mesma rede local. O sistema combina a robustez de um backend em Java com a agilidade de um frontend moderno, eliminando a necessidade de cabos ou serviços de nuvem externos para movimentações rápidas de arquivos.

### 🚀 Tecnologias Utilizadas
O projeto foi construído utilizando uma arquitetura moderna e escalável:

Backend
Java & Spring Boot: Núcleo da aplicação, responsável pela lógica de negócio e processamento de arquivos.

Spring Data JPA / Hibernate: Gestão da persistência de dados e mapeamento objeto-relacional.

PostgreSQL (via Supabase): Banco de dados relacional para armazenamento de metadados dos arquivos e logs de transferência.

Frontend
JavaScript Puro: Utilizado para manipulação dinâmica do DOM e comunicação assíncrona com a API.

HTML5 & CSS3: Estrutura e estilização focada em responsividade para uso mobile.

Fetch API: Interface moderna para execução de requisições HTTP sem dependências externas (como Axios).

### 🛠️ Funcionalidades Principais
Upload de Arquivos: Interface simplificada para envio de arquivos do dispositivo local para o servidor.

Listagem e Download: Visualização de todos os arquivos disponíveis na rede para download imediato em outros dispositivos conectados.

Integração com Banco de Dados: Registro detalhado de cada arquivo no PostgreSQL, permitindo rastreabilidade.

Acesso Mobile-PC: Otimizado para que o usuário possa subir um arquivo no computador e baixá-lo no celular (ou vice-versa) através do navegador.

### 🏗️ Arquitetura do Sistema

Camada de Controller: Gerencia as requisições HTTP (POST para uploads, GET para downloads).

Camada de Service: Contém a lógica de manipulação de arquivos no sistema de arquivos local ou armazenamento configurado.

Camada de Repository: Interface de comunicação com o banco de dados Supabase.

### 🔧 Configuração e Instalação

1. Clonando o repositório
```
git clone https://github.com/MatheusCristophi/FilesB7.git

cd FilesB7
```

2. Configurando o Banco de Dados <br>

No arquivo .env.local, configure sua conexão com o Supabase e reescreva o arquivo para .env :
```
DB_URL_POSTGRES=jdbc:postgresql://db.your-project.supabase.co:5432/postgres
DB_USER_POSTGRES=postgres
DB_PASSWORD_POSTGRES=sua_senha_aqui
```

3. Executando o Backend

Certifique-se de ter o Maven instalado e execute:
```
mvn spring-boot:run
```


📂 Estrutura de Pastas

/src/main/java: Contém toda a lógica de controllers, services e repositories do Spring Boot.

/src/main//resources: Contém o index.html, style.css e script.js responsáveis pela interface.

👨‍💻 Autor

Matheus Cristophi

Estudante de Ciência da Computação (UNIFAGOC)

Desenvolvedor Backend / Full Stack

Dica de uso: 

Para acessar do celular, descubra o IP da sua máquina na rede local (ex: 192.168.1.15) e aponte o navegador do dispositivo móvel para o endereço onde o sistema está rodando.
