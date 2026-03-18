//Gabriel Tolcsvai de Cronis
//Aula 4 Switch case
//Dado o cardápio de uma lanchonete:
// Código Produto Preço 100 Cachorro quente R$1,20 101 Bauru Simples R$1,30 102 Bauru com ovo R$1,50 103 Hambuúrguer R$1,20 104 Cheeseburguer R$1,30 105 Refrigerante R$1,00
// Faça um algoritmo que: leia o código do produto e a quantidade; calcule o valor a ser pago pelo cliente; imprimir o valor a ser pago; imprimir o nome do produto.


import java.util.Scanner;

public class Aula4Ex6 {
    public static void main(String[] args) {

        Scanner e = new Scanner(System.in);

        System.out.print("Digite o código do produto: ");
        int codigo = e.nextInt();

        System.out.print("Digite a quantidade: ");
        int quantidade = e.nextInt();

        double preco = 0;
        String produto = "";

        switch (codigo) {
            case 100:
                produto = "Cachorro quente";
                preco = 1.20;
                break;
            case 101:
                produto = "Bauru Simples";
                preco = 1.30;
                break;
            case 102:
                produto = "Bauru com ovo";
                preco = 1.50;
                break;
            case 103:
                produto = "Hambúrguer";
                preco = 1.20;
                break;
            case 104:
                produto = "Cheeseburguer";
                preco = 1.30;
                break;
            case 105:
                produto = "Refrigerante";
                preco = 1.00;
                break;
            default:
                System.out.println("Código inválido!");
                e.close();
                return;
        }

        double total = preco * quantidade;

        System.out.println("Produto: " + produto);
        System.out.println("Total a pagar: R$ " + total);

        e.close();
    }
}