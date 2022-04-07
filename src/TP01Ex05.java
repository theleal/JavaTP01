import java.util.Scanner;
public class TP01Ex05{
    public static void main(String []args){

        //Alunos:Luiz Gustavo Leal Cortez
        // Calcular e exibir o volume de uma esfera a partir do valor de seu diâmetro que
        //será digitado.

        double diametro;
        double volume;
        double pi = 3.14;
        double raio;
        double raioaocubo;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor do diametro");
        diametro = input.nextDouble();
        raio= diametro/2;
        raioaocubo= raio*raio*raio;
        volume = (4*pi*raioaocubo)/3;
        System.out.println("volume eh " + volume);

    }
}
