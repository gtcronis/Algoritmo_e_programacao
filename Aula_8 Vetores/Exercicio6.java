//Gabriel Tolcsvai de Cronis
//Aula 8
//Exercício 6
//Leia dois vetores: A (de tamanho 4) e B (de tamanho 7).
//Construa um terceiro vetor que seja a junção de A e B
//colocar os elementos de A, e em sequência, colocar os elementos de B.

import java.util.Scanner;
public class Exercicio6 {
    public static void main(String[]args){

        int[] vetorA = new int[4];
        int[] vetorB = new int[7];
        int[] vetorC = new int[11];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.print("Digite o " + (i + 1) + "º elemento do vetor A: ");
            vetorA[i] = sc.nextInt();
        }
        for (int i = 0; i < 7; i++) {
            System.out.print("Digite o " + (i + 1) + "º elemento do vetor B: ");
            vetorB[i] = sc.nextInt();
        }
        for (int i = 0; i < 4; i++) {
            vetorC[i] = vetorA[i];
        }
        for (int i = 0; i < 7; i++) {
            vetorC[i + 4] = vetorB[i];
        }
        System.out.println(" Vetor C (Junção de A e B)");
        for (int i = 0; i < 11; i++) {
            System.out.println("Vetor C, posição " + (i + 1) + ": " + vetorC[i]);
        }

        sc.close();
    }
}

