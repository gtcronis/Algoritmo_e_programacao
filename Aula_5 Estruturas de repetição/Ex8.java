//Gabriel Tolcsvai de Cronis
//Faça um programa que:
//leia duas notas de 5 alunos
//Calcule e mostre a média aritmética de cada um deles;
//Para cada nota lida:
//A entrada de cada nota deve ser validada!
//¨ ou seja, o programa somente avança se a entrada da nota estiver entre 0 e 10.
//¨ caso contrário, solicite-a novamente.
//Utilize o do.. . while para validar as notas.

import java.util.Scanner;
public class Ex8 {
    public static void main (String[]args) {

        Scanner sc = new Scanner(System.in);
        double n1, n2, media;
        int contador = 1;

        do {
            System.out.println("Vamos calcular a média das notas. Aluno " + contador + " - Digite a primeira nota:");

            do {
                n1 = sc.nextDouble();
                if (n1 < 0 || n1 > 10) {
                    System.out.println("Nota inválida! Digite novamente (0 a 10):");
                }
            } while (n1 < 0 || n1 > 10);

            System.out.println("Aluno " + contador + " - Digite a segunda nota:");

            do {
                n2 = sc.nextDouble();
                if (n2 < 0 || n2 > 10) {
                    System.out.println("Nota inválida! Digite novamente (0 a 10):");
                }
            } while (n2 < 0 || n2 > 10);

            media = (n1 + n2) / 2;
            System.out.println("Média do aluno " + contador + ": " + media);

            contador++;

        } while (contador <= 5);

        sc.close();
    }
}
