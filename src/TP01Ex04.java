import java.util.Scanner;
public class TP01Ex04{
    public static void main(String []args){

        //Alunos:Luiz Gustavo Leal Cortez
        //A partir dos valores da base e altura de um triângulo, calcular e exibir sua área.

        double base;
        double altura;
        double area;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor da base");
        base = input.nextDouble();
        System.out.println("Digite o valor da altura");
        altura = input.nextDouble();
        area = (base*altura)/2;
        System.out.println("A Area do triangulo eh " + area);

    }
}
