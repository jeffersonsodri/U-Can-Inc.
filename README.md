# Baixar e Executar o projeto no seu computador


## `1. Primeiro passo - Pré-requisito (JDK 1.7)`

O principal requisito para instalar e usar o maven na sua máquina é ter previamente instalado o JDK (Java Development Kit) 1.7 ou superior.

Também é necessário configurar a variável de ambiente **JAVA_HOME** no seu computador. Mas isso eu vou mostrar como fazer ao longo do post.

Por agora tenha certeza que você tenha instalado o JDK 1.7 ou superior.

## `2. Segundo passo - Download do maven`
O próximo passo é baixar o maven compactado em sua versão mais atual. Você precisa baixar o arquivo com os binários do maven, não é necessário baixar o arquivos-fonte. Ou seja, você vai baixar o arquivo que termina com -bin e não o arquivo que termina com -src.

>Para baixar o maven, basta [clicar aqui](https://maven.apache.org/download.cgi) e fazer o download.

Baixe o arquivo `.zip` e extraia em alguma pasta da sua preferência. Abra a pasta extraída e salve a pasta **bin** nas variárias de ambiente _PATH_

## `3. Terceiro passo - Clonar Repositório do GIT`
/* Com o Git instalado na sua máquina */
> git clone https://github.com/jeffersonsodri/U-Can-Inc..git

Entrar na Pasta do Projeto
> cd u-can-1

## `4. Quarto passo - Baixe as dependências do projeto`

Execute o comando 
> mvn clean install 

para baixar as dependências do projeto através do maven.

 Você também pode utilizar o _mvnw_ que vem no arquivo ZIP do mesmo jeito `mvnw clean install`.

 ## `5. Quinto passo - Execute a aplicação `

 Execute o comando 
 > mvn spring-boot:run 
 
 para executar a sua aplicação. 
 
 ## `6. Sexto passo - Abrir aplicação  `
