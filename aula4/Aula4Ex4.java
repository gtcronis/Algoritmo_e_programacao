//Gabriel Tolcsvai de Cronis
//Aula 4 Switch case
//Um funcionário receberá aumento de acordo com seu plano de trabalho. Faça um algoritmo que leia:
// ¨ o plano de trabalho; ¨ e o salário atual de um funcionário; Calcule e imprima o seu novo salário.
// Plano Aumento A 10% B 15% C 20%;

import java.util.Scanner;

public class Aula4Ex4 {
    public static void main(String[] args) {

        Scanner e = new Scanner(System.in);

        System.out.print("Digite o plano (A/B/C): ");
        char plano = e.next().toUpperCase().charAt(0);

        System.out.print("Digite o salário atual: ");
        double salario = e.nextDouble();

        double novoSalario;

        switch (plano) {
            case 'A':
                novoSalario = salario * 1.10;
                break;
            case 'B':
                novoSalario = salario * 1.15;
                break;
            case 'C':
                novoSalario = salario * 1.20;
                break;
            default:
                System.out.println("Plano inválido!");
                e.close();
                return;
        }

        System.out.println("Novo salário: R$ " + novoSalario);

        e.close();
    }
}