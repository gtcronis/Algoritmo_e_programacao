////Gabriel Tolcsvai de Cronis
//Construir um algoritmo que leia um número inteiro e imprime a 	sequência:
// 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024. . .
//enquanto o valor da sequência for menor ou igual ao número lido.

import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int sequencia;
        int decisao = 1;

        while (decisao == 1) {

            sequencia = 1;

            System.out.println("Digite um número inteiro: ");
            numero = sc.nextInt();


            while (sequencia <= numero) {

                System.out.println(sequencia);
                sequencia = sequencia * 2;
            }
            System.out.println(" Deseja continuar?: Digite 1 para continuar ou 0 para sair.");
            decisao = sc.nextInt();
        }
            sc.close();
        }

    }

