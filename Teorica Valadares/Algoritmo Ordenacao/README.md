# COMPARAÇÃO DE TEMPO DE EXECUÇÃO:

### MODO DE COMPARAÇÃO:

Utilizando o ````System.currentTimeMillis()```` foi criado uma varíavel no início e no fim do método de execução, para que assim pudessemos chegar a um valor aproximado.

Levando em consideração que o tempo de execução do algoritmo em si depende de outros fatores, como por exemplos:

- Retorno de outras Classes ```` Random````.
- Capacidade de processamento da máquina.

Para chegarmos a um valor mais próximo do real possível, o algoritmo foi executado 5x em um espaço de tempo consideravél.
O resultado aproximado abaixo é a soma dos valores (tempo em milissegundos) dividido por 5.

## INSERTION SORT:
    - TAXA DE RESPOSTA PARA 20 ELEMENTOS:  ≅ 0ms
    - TAXA DE RESPOSTA PARA 20000 ELEMENTOS:  ≅ 217.2ms

## MERGE SORT:
    - TAXA DE RESPOSTA PARA 20 ELEMENTOS:  ≅ 0ms
    - TAXA DE RESPOSTA PARA 20000 ELEMENTOS:  ≅ 9.8ms

## BUBBLE SORT:
    - TAXA DE RESPOSTA PARA 20 ELEMENTOS:  ≅ 0ms
    - TAXA DE RESPOSTA PARA 20000 ELEMENTOS:  ≅ 919.4ms

### Considerações:

- O Insertion Sort obteve uma pequena vantagem em uma quantidade pequena de dados.
- O Merge Sort obteve uma vantagem considerável em uma quantidade de dados mais elevada.

