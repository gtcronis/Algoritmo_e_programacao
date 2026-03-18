//Gabriel Tolcsvai de Cronis
//Aula 4 Switch case

import java.util.Scanner;
public class Aula4Exemplo {
    public static void main(String[] args) {

        Scanner e = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 3) {

            System.out.println("=========== Menu de Opções =========");
            System.out.println("1 - Cadastrar Produtos");
            System.out.println("2 - Listar Produtos");
            System.out.println("3 - Sair do Sistema");
            System.out.println("====================================");

            System.out.print("Escolha uma opção: ");
            opcao = e.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu o menu 1");
                    System.out.println("Que é a opção Cadastrar Produtos");
                    break;

                case 2:
                    System.out.println("Você escolheu o menu 2");
                    System.out.println("Que é a opção Listar Produtos");
                    break;
                case 3:
                System.out.println("Você escolheu o menu 3");
                System.out.println("Que é a opção Sair do Sistema");
                break;

                default:
                    System.out.println("Item de menu inválido");
            }

            System.out.println();
        }

        e.close();
    }
}
