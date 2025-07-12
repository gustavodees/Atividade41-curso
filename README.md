# Identificador e Contador de Números Pares em Java

Este projeto consiste em um programa Java simples que lê uma quantidade especificada de números inteiros inseridos pelo usuário, identifica os números pares, exibe os números pares encontrados e, por fim, informa a quantidade total de números pares digitados.

**Autor:** gustavodees

## Arquivos Incluídos

* `principal/Main.java`: Contém a classe principal com o método `main`, responsável por obter a entrada do usuário, identificar e exibir os números pares, além de contar a quantidade deles.

## Como Usar

1.  **Salve o arquivo:** Salve o código fornecido em um arquivo chamado `Main.java` dentro de uma pasta chamada `principal`.
2.  **Compile o código:** Abra um terminal ou prompt de comando, navegue até o diretório raiz do seu projeto e compile o arquivo Java utilizando o compilador Java:

    ```bash
    javac principal/Main.java
    ```

3.  **Execute o programa:** Após a compilação ser concluída com sucesso, execute a classe `Main` com o comando:

    ```bash
    java principal.Main
    ```

4.  **Entrada de Dados:**
    * O programa primeiro solicitará que você digite a quantidade de números que você deseja inserir. Digite o número desejado e pressione Enter.
    * Em seguida, o programa pedirá que você digite cada um dos números, um por vez. Para cada número, digite-o e pressione Enter.

5.  **Resultado:** Após inserir todos os números, o programa exibirá:
    * Uma lista com a mensagem "Numeros pares:" seguida por cada um dos números pares que você digitou, cada um em uma linha separada.
    * A quantidade total de números pares encontrados, com a mensagem "Quantidade de pares:".

## Explicação do Código

### `principal/Main.java`

Este arquivo contém a classe `Main`, que é o ponto de entrada do programa.

* **Método `main`:**
    1.  Cria um objeto da classe `Scanner` para permitir a leitura de dados inseridos pelo usuário no console.
    2.  Declara duas variáveis inteiras: `contarPar` (para armazenar a contagem de números pares) e `pares` (esta variável não é utilizada no código).
    3.  Solicita ao usuário que digite a quantidade de números que ele vai digitar e armazena esse valor na variável inteira `n`.
    4.  Cria um array de números inteiros (`int`) chamado `par` com o tamanho especificado por `n`. Este array será utilizado para armazenar os números digitados pelo usuário.
    5.  Utiliza um loop `for` para iterar `n` vezes (para cada número que o usuário irá digitar). Em cada iteração:
        * Solicita ao usuário que digite um número.
        * Lê o número inteiro inserido pelo usuário e armazena no array `par` na posição correspondente ao índice `i`.
    6.  Inicializa a variável `contarPar` com 0.
    7.  Utiliza um loop `for` para percorrer o array `par`. Em cada iteração:
        * Verifica se o número armazenado em `par[i]` é divisível por 2 (ou seja, se o resto da divisão por 2 é igual a 0). Se for, incrementa o contador `contarPar`.
    8.  Utiliza outro loop `for` para percorrer o array `par` novamente. Em cada iteração:
        * Verifica se o número armazenado em `par[i]` é par.
        * Se for par, imprime a mensagem "Numeros pares:" seguida do número.
    9.  Finalmente, imprime a quantidade total de números pares encontrados, utilizando a variável `contarPar`.
    10. O objeto `Scanner` é fechado ao final do método `main` para liberar os recursos.
