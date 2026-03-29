# Lista de Exercícios em Java

Este repositório contém as resoluções de quatro exercícios práticos de programação em Java. As atividades abordam desde a formatação de saída de dados no console até o uso de estruturas de controle de fluxo e manipulação de strings e cálculos matemáticos.

## 📋 Descrição das Atividades

### Exercício 1: Arte em ASCII
* **Objetivo:** Imprimir o desenho de um rosto formatado em caracteres ASCII[cite: 1].
* **Principais Conceitos:** Uso do `System.out.println` e manipulação de caracteres de escape, como `\"`, para exibir aspas duplas no console[cite: 1].
* **Arquivo:** `exercicio1.java`

### Exercício 2: Cálculo de Distância Geográfica
* **Objetivo:** Calcular a distância (em quilômetros) entre dois pontos na superfície da Terra[cite: 2]. 
* **Funcionamento:** O programa solicita a latitude e a longitude de duas coordenadas[cite: 2].
* **Principais Conceitos:** 
  * Leitura de dados via teclado com a classe `Scanner`[cite: 2].
  * Uso da classe `Math` para converter graus em radianos usando `Math.toRadians`[cite: 2].
  * Aplicação de fórmula trigonométrica com as funções `Math.sin`, `Math.cos` e `Math.acos`[cite: 2].
* **Arquivo:** `exercicio2.java`

### Exercício 3: Contador de Caracteres
* **Objetivo:** Ler uma frase digitada pelo usuário e contabilizar os diferentes tipos de caracteres presentes nela[cite: 3].
* **Funcionamento:** O programa exibe a quantidade exata de letras, espaços, números e outros caracteres[cite: 3].
* **Principais Conceitos:** 
  * Iteração em strings usando o laço `for` e o método `length()`[cite: 3].
  * Captura de caracteres individuais com `charAt()`[cite: 3].
  * Validação de caracteres utilizando os métodos da classe `Character` (`isLetter`, `isDigit`, `isWhitespace`)[cite: 3].
* **Arquivo:** `exercicio3.java`

### Exercício 4: Quiz Interativo
* **Objetivo:** Simular uma questão de múltipla escolha sobre a disciplina de Banco de Dados[cite: 4].
* **Funcionamento:** O usuário deve responder qual comando SQL é usado para extrair dados (a resposta correta é a letra 'c', referente ao `SELECT`)[cite: 4]. O programa permite no máximo 3 tentativas e informa em qual tentativa o usuário acertou[cite: 4].
* **Principais Conceitos:**
  * Uso do laço `do-while` para garantir que o menu seja exibido e repetido até que o usuário acerte ou esgote as 3 tentativas[cite: 4].
  * Estrutura de decisão `switch` para avaliar as respostas (a, b, c, d, e)[cite: 4].
* **Arquivo:** `exercicio4.java`

---

## 🚀 Como executar os programas

Para rodar qualquer um destes exercícios na sua máquina, você precisará ter o [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/downloads/) instalado.

1. Abra o terminal ou prompt de comando.
2. Navegue até a pasta onde os arquivos `.java` estão salvos.
3. Compile o arquivo desejado usando o comando `javac`. Exemplo:
   ```bash
   javac exercicio1.java
