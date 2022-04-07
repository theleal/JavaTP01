import java.util.Scanner;
public class TP01Ex10{
    public static void main(String []args){


        //Alunos: Luiz Gustavo Leal Cortez
        //10. Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e
        //exibir sua temperatura equivalente em Fahrenheit.

        double temperaturaF;
        double temperaturaC;


        Scanner input = new Scanner(System.in);

        System.out.println("Fale a temperatura em celsius");
        temperaturaC = input.nextDouble();

        temperaturaF = temperaturaC * 1.8 + 32;



        System.out.println("isso eh " + temperaturaF + " farenrait");

    }
}
