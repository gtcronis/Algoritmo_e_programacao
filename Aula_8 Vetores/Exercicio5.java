//Gabriel Tolcsvai de Cronis
//Aula 8
//Exercício 5
//Leia dois vetores A e B de mesmo tamanho.
//construa o vetor C, de mesmo tamanho,
//cujo elementos de C são a subtração dos elementos de A por B.
//mostre C.

import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {

        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        int[] vetorC = new int[5];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º elemento do vetor A: ");
            vetorA[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º elemento do vetor B: ");
            vetorB[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            vetorC[i] = vetorA[i] - vetorB[i];
        }

        System.out.println("Elementos do Vetor C (Vetor A - Vetor B)");
        for (int i = 0; i < 5; i++) {
            System.out.println("Vetor C, posição " + (i + 1) + ": " + vetorC[i]);
        }

        sc.close();
    }
    }
