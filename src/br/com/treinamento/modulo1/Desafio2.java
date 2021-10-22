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
