## Desafio DIO: Sistema de Gerenciamento de Bootcamps

### Visão geral
Este projeto, desenvolvido como parte do desafio da DIO, simula um sistema de gerenciamento de bootcamps. Ele permite a criação de bootcamps, cursos, mentorias e o acompanhamento do progresso dos desenvolvedores inscritos.

### Funcionamento
* **Bootcamps:** Possuem um conjunto de conteúdos (cursos e mentorias) e uma lista de desenvolvedores inscritos.
* **Cursos:** São conteúdos com carga horária definida e um cálculo de XP baseado nessa carga.
* **Mentorias:** São conteúdos com data específica e um cálculo de XP fixo.
* **Desenvolvedores:** Podem se inscrever em bootcamps, progredir nos conteúdos e calcular seu XP total.

### Classes e suas responsabilidades
* **Conteudo:** Classe abstrata que define os atributos e métodos comuns a cursos e mentorias.
* **Curso:** Extende Conteudo e adiciona o atributo carga horária.
* **Mentoria:** Extende Conteudo e adiciona o atributo data.
* **Dev:** Representa um desenvolvedor e possui métodos para inscrição em bootcamps, progresso e cálculo de XP.
* **Bootcamp:** Representa um bootcamp e gerencia os conteúdos e desenvolvedores inscritos.

### Como utilizar
1. **Clone o repositório:**
   ```bash
   git clone https://github.com/MatheusLimaCarneiro/Desafio-POO-DIO

2. Importando o projeto:
* **Eclipse:**
    1. Abra o Eclipse e vá em File -> Import -> Existing Maven Projects.
    2. Selecione o diretório raiz do seu projeto.
* **IntelliJ:**
    1. Abra o IntelliJ e vá em File -> Open.
    2. Selecione o arquivo `pom.xml` do seu projeto.

4. Execute a classe Main:
 Esta classe contém o ponto de entrada da aplicação e demonstra o uso das classes.

### Tecnologias utilizadas
* **Java:** Linguagem de programação utilizada para desenvolver o projeto.
* **Conceitos de POO:** Classes, objetos, herança, polimorfismo, encapsulamento.
* **Coleções:** Sets para armazenar os conteúdos e desenvolvedores.
* **Data e hora:** LocalDate para representar datas.

### Contribuições
Sinta-se à vontade para contribuir com este projeto! Fork o repositório e faça um pull request com suas alterações.
