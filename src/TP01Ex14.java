import java.util.Scanner;

public class TP01Ex14 {

    public static void main(String[] args)
    {
        //Alunos:Luiz Gustavo Leal Cortez

        //14. Calcular e exibir o volume livre de um ambiente que contém uma esfera de raio
        //“r” inscrita em um cubo perfeito de aresta “a”. Os valores de “r “ e “a” serão
        //digitados.

        Scanner input =  new Scanner(System.in);


        System.out.println("Insira o valor da aresta: ");
        double aresta = input.nextDouble();

        System.out.println("Insira o valor da raio: ");
        double raio = input.nextDouble();

        double volumeC = Math.pow(aresta,3);
        double volumeE = 4 * 3.14* Math.pow(raio,3);
        double volumeL = volumeC - volumeE;

        System.out.println("O volume livre do ambiente eh: " +volumeL);



    }
}