/*
FATORIAL

O fatorial de um número inteiro positivo N, denotado por N!, é definido como o produto dos inteiros positivos menores do
 que ou iguais a N. Por exemplo 4! = 4 × 3 × 2 × 1 = 24.
Dado um inteiro positivo N, você deve escrever um programa para determinar o menor número k tal que
N = a1! + a2! + ... + ak!, onde cada ai, para 1 ≤ i ≤ k, é um número inteiro positivo.
Por exemplo, para N = 10 a resposta é 3, pois é possível escrever N como a soma de três números fatoriais:
10 = 3! + 2! + 2!. Para N = 25 a resposta é 2, pois é possível escrever N como a soma de dois números
fatoriais: 25 = 4! + 1!.
Entrada
A entrada consiste de uma única linha que contém um inteiro N (1 ≤ N ≤ 105).
Saída
Seu programa deve produzir uma única linha com um inteiro representando a menor quantidade de números fatoriais cuja
soma é igual ao valor de N.

Exemplos de Entrada	    Exemplos de Saída
10                      3

25                      2

*/

package br.com.treinamento.modulo1;

import java.util.Scanner;

public class Desafio2 {

    public static void main(String[] args) {
        int num, repeat = 1;

        Scanner in = new Scanner(System.in);
        System.out.print("Digite o numero: ");
        num = in.nextInt();

        if (num < 1) {
            System.out.println("Número digitado inválido!");
            return;
        }

        while (fatorial2(num) != num) {
            num = num - fatorial2(num);
            repeat++;
        }
        System.out.println("Número mínimo de fatorial foi: " + repeat);
    }

    private static int fatorial2(int fator) {
        int fat = 1;
        int fat2 = 1;
        for (int i = 2; fat <= fator; i++) {
            if (fat <= fator) {
                fat2 = fat;
            } else {
                return fat2;
            }
            fat *= i;
        }
        return fat2;
    }
}
