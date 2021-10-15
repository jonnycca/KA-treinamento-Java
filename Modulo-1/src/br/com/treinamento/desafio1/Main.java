package br.com.treinamento.desafio1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int capacidadeCabine, totalAlunos, totalViagens = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Digite a capacidade da cabine:");
        capacidadeCabine = in.nextInt();

        System.out.print("Digite o número máximo de alunos:");
        totalAlunos = in.nextInt();

        if((capacidadeCabine < 2 || capacidadeCabine > 100) || (totalAlunos < 1 || totalAlunos > 1000)) {
            System.out.println("Dados inseridos inválidos!");
            return;
        }

        while (totalAlunos > 0){
            totalAlunos = totalAlunos - (capacidadeCabine - 1);
            totalViagens++;
        }

        System.out.println(totalViagens);
    }
}
