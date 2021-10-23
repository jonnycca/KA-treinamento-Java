/*
Nota esquecida
João aprendeu na escola que a média de dois números é o valor da soma desses dois números dividido por dois. Ou seja, a
média de dois números A e B é M=(A+B)/2.

A professora contou para João as notas que ele tirou nas duas provas de Geografia. As duas notas são números inteiros
entre 0 e 100. João prontamente calculou a média das duas provas, que também resultou em um número inteiro.

Mas João é muito esquecido, e agora não consegue lembrar-se das duas notas que tirou na prova. Ele consegue se lembrar
de apenas uma das notas das provas. Por sorte, ele consegue se lembrar também da média entre as duas notas.

Você pode ajudar João a determinar a nota da outra prova?

Entrada
A primeira linha contém um número inteiro A, indicando a nota de uma prova. A segunda linha contém um número inteiro M,
indicando a média entre as duas notas das provas.
Saída
Seu programa deve produzir uma única linha, contendo uma única linha, com apenas um número inteiro, a nota da outra
prova, que João não consegue recordar.
Restrições
0 ≤ A ≤ 100
0 ≤ M ≤ 100
Informações sobre a pontuação
Para um conjunto de casos de testes valendo 10 pontos, as duas notas das provas são iguais.

Exemplos
Entrada                 Saída
100                     40
70




Entrada                 Saída
80                      70
75




Entrada                 Saída
1                       99
50


 */

package br.com.treinamento.modulo1;

import java.util.Scanner;

public class Desafio3 {

    public static void main(String[] args) {
        int prova1, media, terceiraNota;

        Scanner in = new Scanner(System.in);

        System.out.print("Digite a nota da primeira prova:");
        prova1 = in.nextInt();

        if (prova1 < 0 || prova1 > 100) {
            System.out.println("Dado inserido inválido!");
            return;
        }

        System.out.print("Digite a média das duas notas:");
        media = in.nextInt();

        if (media < 0 || media > 100) {
            System.out.println("Dado inserido inválido!");
            return;
        }
        terceiraNota = (prova1 + media) / 2;
        System.out.println(terceiraNota);
    }
}
