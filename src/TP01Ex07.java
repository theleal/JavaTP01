import java.util.Scanner;
public class TP01Ex07{
    public static void main(String []args){


        //Alunos: Luiz Gustavo Leal Cortez
        //7. Calcular e exibir a média geométrica de dois valores quaisquer que serão
        //digitados.

        double v1;
        double v2;
        double v3;
        double v4;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor 1");
        v1 = input.nextDouble();

        System.out.println("Digite o valor 2");
        v2 = input.nextDouble();

        v3 = v1*v2;

        v4 = Math.sqrt(v3);

        System.out.println("A media eh " + v4);

    }
}
