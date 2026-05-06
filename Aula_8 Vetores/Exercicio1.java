//Gabriel Tolcsvai de Cronis
//Aula 8
//Exercício 1
//Leia 10 números inteiros do usuário
//Armazene em um vetor e imprima os números lidos.

import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {

        int[] numeros = new int [10];

        Scanner sc= new Scanner(System.in);

        for(int i =0;i<10;i++) {
            System.out.println("Digite o número " + (i + 1) + ":");
            numeros[i] = sc.nextInt();
        }
        for(int i=0;i<10;i++){
            System.out.println("número "+(i+1));
        }

        sc.close();

    }
}