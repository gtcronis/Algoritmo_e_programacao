//Gabriel Tolcsvai de Cronis
//Aula 7
//Exercício 1
//Crie um programa em Java que gere um número aleatório entre 1 e 100 e exiba esse número na tela

import java.util.Random;

public class Exercicio1 {
    public static void main(String[] args) {
        
        Random random = new Random();
        
        int numeroAleatorio = random.nextInt(100) + 1;
        
        System.out.println(numeroAleatorio);
    }
}
