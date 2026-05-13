//Gabriel Tolcsvai de Cronis
//Aula 9
//Exercício 5
//Escreva o método exibirDiaSemana:
//deve receber um número inteiro no intervalo de 1 - 7 como parâmetro.
//deve retornar uma String com o dia da semana correspondente aquele número.
//caso seja passado um número fora do intervalo de 1-7:
//· então retorne uma String com a mensagem: "Dia da semana inválido".


import java.util.Scanner;
public class Exe5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número de 1 a 7: ");
        int dia = sc.nextInt();
        String resultado = exibirDiaSemana(dia);
        System.out.println(resultado);
        sc.close();
    }

    public static String exibirDiaSemana(int dia) {
        switch (dia) {
            case 1:  return "domingo";
            case 2:  return "segunda";
            case 3:  return "terça";
            case 4:  return "quarta";
            case 5:  return "quinta";
            case 6:  return "sexta";
            case 7:  return "sábado";
            default: return "Dia da semana inválido";
        }
    }
}

