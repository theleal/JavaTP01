import java.util.Scanner;
public class TP01Ex11{
    public static void main(String []args){

        //Alunos:Luiz Gustavo Leal Cortez
        //11. A partir do diâmetro de um círculo que será digitado, calcular e exibir sua área.




        double diametro;
        double pi = 3.14;
        double raio;
        double raioaoquadrado;
        double area;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor do diametro");
        diametro = input.nextDouble();
        raio= diametro/2;
        raioaoquadrado = raio*raio;
        area = pi*raioaoquadrado;
        System.out.println(" a area eh" + area);

    }
}
