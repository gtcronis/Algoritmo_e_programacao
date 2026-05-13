public class matrizesNotas  {
    public static void main (String[] args){

        //1. declarar e instanciar a matriz;

        double[][] notas = new double[3][2];

// atribuições dos valores (preenchimento manual)

        notas[0][0] = 7.5;
        notas[0][1] = 8.0;

        notas[1][0] = 6.0;
        notas[1][1] = 5.5;

        notas[2][0] = 9.0;
        notas[2][1] = 8.5;

// 3. processamento do cálculo das médias

        for (int i=0; i<notas.length; i++){
            double soma=0;

            for(int j =0; j<notas[i].length; j++){
                soma+= notas[i][j];

            }
            double media = soma / notas[i].length;


// 4. Saída dos resultados

            System.out.println("Estudante: " + (i + 1));
            System.out.println("Media: " +  media);

            if (media >=6){
                System.out.println("Aprovado(a)");
            }else{
                System.out.println("Reprovado ou elegível para REA");
            }
        }
    }
}
