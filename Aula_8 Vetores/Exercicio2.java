//Gabriel Tolcsvai de Cronis
//Aula 8
//Exercício 2
//Leia 10 valores inteiros e armazene-os em um vetor.
//(a) faça um laço para imprimir os elementos pares.
//(b) faça um laço para imprimir os elementos ímpares.

import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[]args){

        int[] numeros = new int [10];

        Scanner sc= new Scanner(System.in);

        for(int i =0;i<10;i++) {
            System.out.println("Digite o número " + (i + 1) + ":");
            numeros[i] = sc.nextInt();
        }
        for (int i = 0; i < numeros.length; i++) {
            int num = numeros[i];
            if (num % 2 == 0) {
                System.out.println("Elementos pares: " + num);
            }
        }
            for (int i =0; i< numeros.length; i++){
                int num= numeros[i];
                if(num % 2 != 0){
                    System.out.println("Elementos ímpares: "+ num);

            }
        }
                sc.close();
    }
}
