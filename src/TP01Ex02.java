import java.util.Scanner;
public class TP01Ex02{
    public static void main(String []args){

        //Alunos:Luiz Gustavo Leal Cortez
        //Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será
        //digitado.


        double aresta;
        double altura;
        double area;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor da Base");
        aresta = input.nextDouble();
        area = (aresta * aresta);
        System.out.println("A Area do quadrado eh " + area);

    }
}
