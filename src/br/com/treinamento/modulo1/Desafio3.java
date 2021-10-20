package br.com.treinamento.modulo1;

import java.util.Scanner;

public class Desafio3 {

    public static void main(String[] args) {
        int prova1, media, terceiraNota;

        Scanner in = new Scanner(System.in);

        System.out.print("Digite a nota da primeira prova:");
        prova1 = in.nextInt();

        if(prova1 < 0 || prova1 > 100) {
            System.out.println("Dado inserido inválido!");
            return;
        }

        System.out.print("Digite a média das duas notas:");
        media = in.nextInt();

        if(media < 0 || media > 100) {
            System.out.println("Dado inserido inválido!");
            return;
        }
        terceiraNota = (prova1 + media) / 2;
        System.out.println(terceiraNota);
    }
}
