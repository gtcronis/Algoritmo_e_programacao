// Gabriel Tolcsvai de Cronis
// Aula Números Aleatórios
//Exercício 2
// Desenvolva um programa em Java que Gere um nuemeor aleatório entre 1 e 50;
//Peça para o usuário tentar adivinhar o número e informe se o palpite é:
//"Maior"(se o numero sorteado for maior)
//"Menor"(se o número sorteado for menor)
//Continue até o usuário acertar;
// Ao final, mostre a a quantidade de tentativas;


import java.util.Random;
import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner entrada = new Scanner(System.in);

        int aleatorio, palpite, tentativa;
        tentativa = 0;


        aleatorio = 1 + random.nextInt(50);
        palpite = 0;

        System.out.println(" Digite um palpite entre 1 e 50: ");
        System.out.println(aleatorio);

        while (palpite != aleatorio) {


                palpite = entrada.nextInt();

                if (aleatorio > palpite) {
                    System.out.println("Maior");
                    tentativa++;
                } else if (palpite == aleatorio) {
                    System.out.println("Acertou!");
                    tentativa++;
                } else {
                    System.out.println("Menor");
                    tentativa++;
                }


            }
            System.out.println(" O numéro de tentivas foi: " + tentativa);
            entrada.close();
        }
    }
