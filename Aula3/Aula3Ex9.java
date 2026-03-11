////Gabriel Tolcsvai de Cronis
//A prefeitura do Rio de Janeiro abriu uma linha de crédito para os funcionários estatuários.
//o valor máximo da prestação não poderá ultrapassar 30% do salário bruto.
//Fazer um algoritmo que leia o salário bruto e o valor da prestação e informar se o empréstimo pode ou não ser concedido.


import java.util.Scanner;
public class Aula3Ex9 {
    public static void main (String[]args){

        Scanner e = new Scanner(System.in);

        double salarioBruto;
        double prestacao;

        System.out.println("Informe seu salário bruto em R$: ");
        salarioBruto=e.nextDouble();

        System.out.println("Informe o valor da prestação em R$: ");
        prestacao=e.nextDouble();

        if (prestacao > salarioBruto * 0.30) {
            System.out.println("Empréstimo não pode ser concedido");
        }else{
            System.out.println("Empréstimo pode ser concedido");
        }
    e.close();
    }


}

