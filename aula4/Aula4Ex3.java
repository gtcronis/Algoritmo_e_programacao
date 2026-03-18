//Gabriel Tolcsvai de Cronis
//Aula 4 Switch case
//Faça um algoritmo que leia o período em que um aluno estuda:
//M - Matutino;
//V - Vespertino;
//N - Noturno.
//Escreva uma das opções a seguir:
//Opção	Saudação
//M	bom dia
//V	boa tarde
//N	boa noite


import java.util.Scanner;

public class Aula4Ex3 {
    public static void main(String[] args) {

        Scanner e = new Scanner(System.in);

        System.out.print("Digite o período (M/V/N): ");
        char periodo = e.next().toUpperCase().charAt(0);

        switch (periodo) {
            case 'M':
                System.out.println("Bom dia");
                break;
            case 'V':
                System.out.println("Boa tarde");
                break;
            case 'N':
                System.out.println("Boa noite");
                break;
            default:
                System.out.println("Período inválido!");
        }

        e.close();
    }
}