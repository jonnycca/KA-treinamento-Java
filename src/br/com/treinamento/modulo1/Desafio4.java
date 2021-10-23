

package br.com.treinamento.modulo1;

import java.util.Scanner;


class Operations {
    int mdc(int a, int b) {
        if (b == 0) {
            return a;
        }
        return mdc(b, a % b);
    }

    int mmc(int a, int b){
        return a*b / mdc(a, b);
    }
}


public class Desafio4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Operations operations = new Operations();

        int cont=-1,aux,a,i,n,l,pos=-1,b,k=0;

        System.out.print("Digite as 3 primeiras entradas:");
        n = in.nextInt();
        l = in.nextInt();
        b = in.nextInt();

        k = b;

        for(i=1; i<n; i++)
        {
            a = in.nextInt();
            k= operations.mmc(k,a);
        }

        for(i=1; i<=l; i++)
        {
            aux = operations.mmc(i,k);

            if(aux>cont && aux<=l)
            {
                cont = aux;
                pos = i;
            }
        }

        System.out.println("resultado foi: " + pos);

    }
}


