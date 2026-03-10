//Ler dois números (ponto flutuante) e apresentá-los em ordem 	decrescente.
// supor que não sejam iguais.

import java.util.Scanner;
    public class Aula3Ex4 {
    public static void main (String[]args){

        Scanner e = new Scanner(System.in);

        double n1;
        double n2;

        System.out.println("Vamos colocar os números decimais em ordem decrescente. Digite o primeiro número decimal (ex: 2.3):  ");
        n1=e.nextDouble();
        System.out.println("Digite o segundo número decimal: ");
        n2= e.nextDouble();

        if(n1>n2){
            System.out.println("A ordem decrescente dos números é: " + n1 + " > " + n2);
        }else {
            System.out.println("A ordem decrescente dos números é: " + n2 + " > " + n1);

        }
        e.close();
    }

}
