//Gabriel Tolcsvai de Cronis
//Aula 8
//Exercício 3
//Leia 5 nomes de pessoas e armazene-os em um vetor.
//(a) imprima os nomes do último para o primeiro.
//(b) imprima o primeiro e o último nome armazenado

import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[]args){

        String[] nomes = new String[5];

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 5; i++) {
            System.out.print("Digite o nome " + (i+1) + ": ");
            nomes[i] = sc.nextLine();
        }
        System.out.println("Nomes do último para o primeiro: ");
        for(int i = 4; i >= 0; i--) {
            System.out.println(nomes[i]);
        }
        System.out.println("Primeiro nome: " + nomes[0]);
        System.out.println("Último nome: " + nomes[4]);

        sc.close();
    }
}

