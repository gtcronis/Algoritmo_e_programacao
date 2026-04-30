//Gabriel Tolcsvai de Cronis
// Aula 7
// Exercício 3
//Crie um programa em Java que gere 10 números aleatórios entre 1 e 20, um de cada vez
//Para cada número gerado:
//Exiba o valor na tela
//Some os valores gerados e Verifique se o número é par
//Ao final, o programa deve exibir:
//A soma total dos números
//A média dos valores e Quantos números são pares
//RESTRIÇÃO: Não utilizar vetores(arrays).Utilize apenas variáveis simples e estruturadas de repetição

import java.util.Random;

public class Exercicio3 {
    public static void main(String[] args) {
      
        Random gerador = new Random();
        
      
        double somaTotal = 0.0;
        int contadorPares = 0;
        
       
            for (int i = 0; i < 10; i++) {
          
            int numeroSorteado = gerador.nextInt(20) + 1;
            System.out.println("Número da vez: " + numeroSorteado);
            
        somaTotal = somaTotal + numeroSorteado;
                     
            if (numeroSorteado % 2 == 0) {
                contadorPares = contadorPares + 1;
            }
        }
        
          double media = somaTotal / 10;
        
        System.out.println("Soma final: " + somaTotal);
        System.out.println("média:  " + media);
        System.out.println("Total de números pares: " + contadorPares);
    }
}
