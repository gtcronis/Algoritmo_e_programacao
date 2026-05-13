//Gabriel Tolcsvai de Cronis
//Aula 9
//Exercício 6
//Faça três funções:
//       (a) recebe um vetor de inteiros como entrada e retorna o maior valor
//       (b) recebe um vetor de inteiros como entrada e retorna o menor valor
//       (c) recebe um vetor de inteiros como entrada e retorna (max + min)/2
//       max = maior valor do vetor
//       min = menor valor do vetor


import java.util.Scanner;
public class Exe6 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int n = sc.nextInt();
        int[] vetor = new int[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o elemento " + (i + 1) + ": ");
            vetor[i] = sc.nextInt();
        }

        int maior = maiorValor(vetor);
        int menor = menorValor(vetor);
        double media = mediaMaxMin(vetor);

        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        System.out.println("Média entre max e min: " + media);

        sc.close();
}

    public static int maiorValor(int[] vetor) {
        int max = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > max) max = vetor[i];
        }
        return max;
    }

    public static int menorValor(int[] vetor) {
        int min = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < min) min = vetor[i];
        }
        return min;
    }

    public static double mediaMaxMin(int[] vetor) {
        return (maiorValor(vetor) + menorValor(vetor)) / 2.0;
    }
}