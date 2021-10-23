/*
A turma da faculdade vai fazer uma excursao na serra e todos os alunos e monitores vao tomar um
teleférico para subir ate o pico de uma montanha. A cabine do teleferico pode levar C pessoas no
máximo, contando alunos e monitores, durante uma viagem ate o pico. Por questao de seguran¸ca,
deve haver pelo menos um monitor dentro da cabine junto com os alunos. Por exemplo, se cabem
C = 10 pessoas na cabine e a turma tem A = 20 alunos, os alunos poderiam fazer três viagens: a
primeira com 8 alunos e um monitor; a segunda com 6 alunos e um monitor; e a terceira com 6 alunos
e um monitor.

Dados como entrada a capacidade C da cabine e o numero total A de alunos, voce deve escrever
um programa para calcular o numero mınimo de viagens do teleferico.
Se voce estiver com muita pregui¸ca hoje, nao se preocupe: virando a pagina voce encontra solu¸coes
para este problema.
Entrada
A primeira linha da entrada contem um inteiro C, representando a capacidade da cabine (2 ≤ C ≤
100). A segunda linha da entrada contem um inteiro A, representando o numero total de alunos na
turma (1 ≤ A ≤ 1000).
Saıda
Seu programa deve imprimir uma linha contendo um numero inteiro representando o numero
mınimo de viagens do teleferico para levar todos os alunos ate o pico da montanha.

Exemplo de entrada 1     Exemplo de saıda 1
10                              3
20

Exemplo de entrada 2     Exemplo de saıda 1
12                              5
25

Exemplo de entrada 3     Exemplo de saıda 1
100                              1
87

 */


package br.com.treinamento.modulo1;

import java.util.Scanner;

public class Desafio1 {

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
