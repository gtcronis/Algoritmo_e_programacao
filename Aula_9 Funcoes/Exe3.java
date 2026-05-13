//Gabriel Tolcsvai de Cronis
//Aula 9
//Exercício 3
//Criar um método chamado encontrarMax
//seu método deve receber dois números (int) como parâmetro de entrada e deve retornar o maior valor entre esses números.
//Para testar seu programa:
//Leia dois números do usuário.
//chame o método passando esses números.
//imprima o valor retornado pelo seu método.

import java.util.Scanner;
public class Exe3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo numero: ");
        int num2 = sc.nextInt();

        int resultado = encontrarMax(num1, num2);
        System.out.println("O maior valor e: " + resultado);

        sc.close();
    }

    public static int encontrarMax(int n1, int n2) {
        if (n1 > n2) {
            return n1;
        } else {
            return n2;
        }
    }
}


