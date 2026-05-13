//Gabriel Tolcsvai de Cronis
//Aula 9
//Exercício 2
//Faça uma função chamada imprimeNovaMensagem:
//sua função deve receber uma String como parâmetro de entrada;
//e deve imprimir a seguinte mensagem:
//· "Meu primeiro programa com funcoes e parametro: <parametro>".
//chame a sua função três vezes de dentro do main
//e passe um valor diferente como parâmetro para cada chamada da função.

public class Exe2 {
    public static void main(String[] args) {
        imprimeNovaMensagem("Java");
        imprimeNovaMensagem("funcoes");
        imprimeNovaMensagem("parametros");
    }

    public static void imprimeNovaMensagem(String parametro) {
        System.out.println("Meu primeiro programa com funcoes e parametro: " + parametro);
    }
}

