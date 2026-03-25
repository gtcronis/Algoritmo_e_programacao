////Gabriel Tolcsvai de Cronis
//Faça um algoritmo que leia a altura e o peso de 10 pessoas.
//	Calcular o IMC de cada pessoa e verificar quantas pessoas estão com o IMC entre 18,5 e 24,9 que é considerado sem obesidade.
// IMC = peso / altura²
//

import java.util.Scanner;
public class Ex7{
public static void main (String[]args) {

    Scanner sc= new Scanner(System.in);

    double altura,peso,imc;
    int contador=1;
    int semObesidade=0;

       do {
            System.out.println("Você é o " + contador + "º paciente. Digite sua altura em metros: ");
            altura = sc.nextDouble();

            System.out.println("Você é o " + contador + "º paciente. Digite seu peso em quilos: ");
            peso = sc.nextDouble();

            imc = peso / (altura * altura);
            System.out.println("IMC: " + imc);

            if (imc >= 18.5 && imc <= 24.9) {
                semObesidade++;
            }

            contador++;

        } while (contador <= 10);

        System.out.println("Após exames, verificou-se que " + semObesidade + " pessoas estão dentro do IMC.");

        sc.close();
    }
}
