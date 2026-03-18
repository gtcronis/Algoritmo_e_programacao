//Gabriel Tolcsvai de Cronis
//Aula 4 Switch case
//Faça um algoritmo que receba dois números;
// execute as operações listadas a seguir de acordo com a escolha do usuário.
// Opção Mensagem M média entre os números digitados S diferença do maior pelo menor P produto entre os números digitados D divisão do primeiro pelo segundo

import java.util.Scanner;

public class Aula4Ex5 {
    public static void main(String[] args) {

        Scanner e = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = e.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = e.nextDouble();

        System.out.print("Escolha a operação (M/S/P/D): ");
        char opcao = e.next().toUpperCase().charAt(0);

        switch (opcao) {
            case 'M':
                double media = (num1 + num2) / 2;
                System.out.println("Média: " + media);
                break;

            case 'S':
                double diferenca;
                if (num1 > num2) {
                    diferenca = num1 - num2;
                } else {
                    diferenca = num2 - num1;
                }
                System.out.println("Diferença: " + diferenca);
                break;

            case 'P':
                double produto = num1 * num2;
                System.out.println("Produto: " + produto);
                break;

            case 'D':
                if (num2 != 0) {
                    double divisao = num1 / num2;
                    System.out.println("Divisão: " + divisao);
                } else {
                    System.out.println("Erro: divisão por zero!");
                }
                break;

            default:
                System.out.println("Opção inválida!");
        }

        e.close();
    }
}