import java.util.Scanner;
public class TP01Ex03{
    public static void main(String []args){


        //Alunos:Luiz Gustavo Leal Cortez

        //Calcular e exibir a área de um quadrado a partir do valor de sua diagonal que será
        //digitado.



        double diagonal;
        double area;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor da diagonal");
        diagonal = input.nextDouble();
        area = (diagonal*diagonal)/2;
        System.out.println("A Area do quadrado eh " + area);

    }
}
