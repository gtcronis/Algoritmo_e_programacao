////Gabriel Tolcsvai de Cronis
//Faça um algoritmo que imprima a tabuada do 5.

public class Ex5 {
    public static void main (String[]args){

        int numero,fator;
        fator=1;
        numero=5;
        System.out.println(" Veremos a  tabuada do " +numero);

        while(fator<=10){

            System.out.println(numero +" x " +fator +" = "+ (numero*fator));
            fator++;

        }

    }
}
