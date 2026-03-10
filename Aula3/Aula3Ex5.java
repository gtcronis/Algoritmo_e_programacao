//Faça um algoritmo para ler um número inteiro.
//verifique se o número está no intervalo entre 50 (inclusive) e 100 (inclusive);
//se estiver: imprimir “Pertence ao intervalo”;
//senão: imprimir “Não pertence ao intervalo”

import java.util.Scanner;
public class Aula3Ex5 {
    public static void main (String[]args) {

        Scanner e = new Scanner(System.in);

        int numero;

        System.out.println("Digite um número: ");
        numero = e.nextInt();

        if (numero >= 50 && numero <= 100) {
        System.out.println("Pertence ao intervalo");
        }else{
        System.out.println("Não pertence ao intervalo");
    }
    e.close();

    }
}
