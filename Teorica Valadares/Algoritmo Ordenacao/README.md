# COMPARAÇÃO DE TEMPO DE EXECUÇÃO:

## MODO DE COMPARAÇÃO:

Utilizando o ````System.currentTimeMillis()```` foi criado uma varíavel no início e no fim do método de execução, para que assim pudessemos chegar a um valor aproximado.

Levando em consideração que o tempo de execução do algoritmo em si depende de outros fatores, como por exemplos:

- Retorno de outras Classes ```` Random````.
- Capacidade de processamento da máquina.

Para chegarmos a um valor mais próximo do real possível, o algoritmo foi executado 5x em um espaço de tempo consideravél.
O resultado aproximado abaixo é a média (soma dos valores (tempo em milissegundos) dividido por 5).

---

# AVALIANDO A EXECUÇÃO DO ALGORITMO EM TRÊS SITUAÇÕES DISTINTAS:

## 1. DADOS DE ENTRADA ALEATORIZADOS (UTILIZADO A CLASSE RANDOM);

### INSERTION SORT:
    - TAXA DE RESPOSTA PARA 1000 ELEMENTOS:  ≅ 3.4ms
    - TAXA DE RESPOSTA PARA 20000 ELEMENTOS:  ≅ 217.2ms

### MERGE SORT:
    - TAXA DE RESPOSTA PARA 1000 ELEMENTOS:  ≅ 2ms
    - TAXA DE RESPOSTA PARA 20000 ELEMENTOS:  ≅ 9.8ms

### BUBBLE SORT:
    - TAXA DE RESPOSTA PARA 1000 ELEMENTOS:  ≅ 8.4ms
    - TAXA DE RESPOSTA PARA 20000 ELEMENTOS:  ≅ 919.4ms

## 2. DADOS DE ENTRADA JÁ ORDENADOS;

### INSERTION SORT:
    - TAXA DE RESPOSTA PARA 1000 ELEMENTOS:  ≅ 0ms
    - TAXA DE RESPOSTA PARA 20000 ELEMENTOS:  ≅ 1.2ms

### MERGE SORT:
    - TAXA DE RESPOSTA PARA 1000 ELEMENTOS:  ≅ 1.8ms
    - TAXA DE RESPOSTA PARA 20000 ELEMENTOS:  ≅ 8.2ms

### BUBBLE SORT:
    - TAXA DE RESPOSTA PARA 1000 ELEMENTOS:  ≅ 6.4ms
    - TAXA DE RESPOSTA PARA 20000 ELEMENTOS:  ≅ 527.8ms

## 3. DADOS DE ENTRADA ORDENADOS DE FORMA DECRESCENTE;

### INSERTION SORT:
    - TAXA DE RESPOSTA PARA 1000 ELEMENTOS:  ≅ 5.6ms
    - TAXA DE RESPOSTA PARA 20000 ELEMENTOS:  ≅ 429.4ms

### MERGE SORT:
    - TAXA DE RESPOSTA PARA 1000 ELEMENTOS:  ≅ 2.2ms
    - TAXA DE RESPOSTA PARA 20000 ELEMENTOS:  ≅ 9.4ms

### BUBBLE SORT:
    - TAXA DE RESPOSTA PARA 1000 ELEMENTOS:  ≅ 7.8ms
    - TAXA DE RESPOSTA PARA 20000 ELEMENTOS:  ≅ 552.4ms


## Para otimizar o desempenho do MergeSort, quando a instância for muito pequena, ele deverá chamar o InsertionSort no lugar da recursão.

Para poder chamar o InsertionSort no MergeSort, foi necessário realizar a sobrecarga no InsertionSort para que o mesmo passasse a permitir a passagem de parâmetros:
````   
    public void sort(int[] A){
        int key;
        for (int j = 1; j < A.length; j++) {
            key  = A[j];
            int i = j - 1;

            while ((i > 0) && (A[i] > key)){
                A[i + 1] = A[i];
                i --;
            }
            A[i + 1] = key;
        }
    }
````   
E então, com a condicional abaixo, é decidido se o retorno será via o próprio MergeSort, ou, se será chamado o InsertionSort. 
````     
   public void sort ( int p, int r){
        int q;
        
        //Adcionado if para validar considerando a instancia pequena como até 1000.
        //Se a instancia for até 1000, chama-se o InsertionSort no lugar do MergeSort.
        
        if (A.length <= 1000){
            insertionSort.otimizandoSort(A);
        }
        //Senão, se a instancia for maior que 1000, chama-se o próprio MergeSort recursivo.
        else {
            if (p < r) {
                q = Math.floorDiv((p + r), 2);
                sort(p, q);
                sort(q + 1, r);
                merge(p, q, r);
            }
        }
    }
````

## CONSIDERAÇÕES FINAIS:

Após realização dos testes, podemos perceber que:
- O InsertionSort é mais adequado quando se trata de uma pequena quantidade de dados, principalmente se existir a possibilidade desses dados já virem ordenados ou parcialmente ordenados.
- O MergeSort é o mais adequado para quantidades grandes de dados aleatorizados ou ordenados de forma decrescente. Dados já ordenados levam mais tempo nesse algoritmo levando em consideração o seu pilar (Dividir e Conquistar), que, irá desordenar os dados (pelo fato de dividir) e ter que ordenar novamente.
- O BubbleSort percorre o vetor várias vezes, e a cada passagem ele joga no topo o maior elemento da sequência. Pelo fato de ter que percorrer o vetor diversas vezes, ele ficou em ultimo em todos os testes realizados.

---

````
UniBh - Ciências da Computação;
Autor: Thales Eugenio;
RA: 12013012;
````