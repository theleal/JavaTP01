import java.util.Scanner;
public class TP01Ex12{
    public static void main(String []args){

        //Alunos:Luiz Gustavo Leal Cortez
        //12. Calcular e exibir o volume de um cone a partir dos valores da altura e do raio da
        //base que serão digitados.


        double altura;
        double volume;
        double pi = 3.14;
        double raio;
        double raioaoquadrado;

        Scanner input = new Scanner(System.in);


        System.out.println("Digite o valor do raio");
        raio = input.nextDouble();

        System.out.println("Digite o valor do altura");
        altura = input.nextDouble();

        raioaoquadrado = raio*raio;
        volume = pi*raioaoquadrado*altura/3;
        System.out.println(" volume eh" + volume);

    }
}
