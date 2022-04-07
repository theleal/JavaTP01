import java.util.Scanner;

public class TP01Ex01 {

    public static void main(String []args){


        //Alunos: Luiz Gustavo Leal Cortez
        //Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua
        //área.

        double base;
        double altura;
        double area;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor da Base");
        base = input.nextDouble();
        System.out.println("Digite o valor da Altura");
        altura = input.nextDouble();
        area = (base * altura);
        System.out.println("A Area do triangulo eh " + area);

    }
}
