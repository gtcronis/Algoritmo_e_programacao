//Gabriel Tolcsvai de Cronis
//Aula 9
//Exercício 4
// Crie um método chamado isPar:
//seu método deve receber um número inteiro como parâmetro de entrada.
//e deve retornar:
//true Ñ se o número for par:
//false Ñ se o número for ímpar.
//Para testar seu método:
//faça um programa que fica pedindo para o usuário digitar números
//Para cada número digitado:
//chame a função isPar(numero) passando o número e imprima
//“número par” caso o número seja par.
//"número impar” caso o número seja ímpar.

import java.util.Scanner;
public class Exe4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Digite um número inteiro ou digite 0 para sair: ");
            int numero = sc.nextInt();

            if (numero == 0) {
                System.out.println("Programa encerrado.");
                break;
            }

            if (isPar(numero)) {
                System.out.println("número par");
            } else {
                System.out.println("número ímpar");
            }
        }
        sc.close();
    }

    public static boolean isPar(int numero) {
        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}


