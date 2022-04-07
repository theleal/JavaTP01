import java.util.Scanner;
public class TP01Ex09{
    public static void main(String []args){


        //Alunos: Luiz Gustavo Leal Cortez
        //9. Calcular e exibir a tensão de um determinado circuito eletrônico a partir dos
        //valores da resistência e corrente elétrica que serão digitados. Utilize a lei de Ohm.


        double resistencia;
        double corrente;
        double tensao;


        Scanner input = new Scanner(System.in);

        System.out.println("Fale o valor da resistencia");
        resistencia = input.nextDouble();

        System.out.println("Fale o valor da corrente");
        corrente = input.nextDouble();

        tensao = resistencia * corrente;



        System.out.println("a tensao eh de: " + tensao);

    }
}
