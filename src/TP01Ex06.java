import java.util.Scanner;
public class TP01Ex06{
    public static void main(String []args){

        //Alunos:Luiz Gustavo Leal Cortez
        //6. Calcular e exibir a média aritmética de quatro valores quaisquer que serão
        //digitados.

        double v1;
        double v2;
        double v3;
        double v4;
        double media;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor 1");
        v1 = input.nextDouble();

        System.out.println("Digite o valor 2");
        v2 = input.nextDouble();

        System.out.println("Digite o valor 3");
        v3 = input.nextDouble();

        System.out.println("Digite o valor 4");
        v4 = input.nextDouble();

        media = (v1+v2+v3+v4)/4;
        System.out.println("A media eh " + media);

    }
}
