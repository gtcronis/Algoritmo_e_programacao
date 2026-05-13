//Gabriel Tolcsvai de Cronis
//Aula 9
//Exercício 7
//Criar um método chamado calcularFatorial:
//recebe um número inteiro.
//retorna o fatorial calculado.
//Exemplo:
//fatorial 3 = 6.
//fatorial 5 = 120.
//Teste seu programa
//leia um número do usuário.
//apresente o fatorial desse número.

import java.util.Scanner;
public class Exe7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        long resultado = calcularFatorial(numero);
        System.out.println("Fatorial de " + numero + " = " + resultado);
        sc.close();
    }

    public static long calcularFatorial(int n) {
        long fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

}
