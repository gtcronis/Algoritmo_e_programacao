//Gabriel Tolcsvai de Cronis
//Aula 8
//Exercício 4
//Leia 5 elementos em um vetor inteiro A.
//construa um outro vetor B, de mesma dimensão de A,
//sendo que, seus elementos são a multiplicação dos elementos de A por 3.
//mostre os elementos de B.

import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º elemento do vetor A: ");
            vetorA[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            vetorB[i] = vetorA[i] * 3;
        }
        System.out.println("Elementos do Vetor B (Vetor A * 3): ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Vetor B, posição " + (i + 1) + ": " + vetorB[i]);
        }

        sc.close();

    }
}
