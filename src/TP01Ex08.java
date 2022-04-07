import java.util.Scanner;
public class TP01Ex08{
    public static void main(String []args){


        //Alunos: Luiz Gustavo Leal Cortez
        // 8. Sabendo que uma milha marítima equivale a um mil, oitocentos e cinquenta e
        //dois metros e que um quilômetro possui mil metros, fazer um programa para
        //converter milhas marítimas em quilômetros.

        double milhasM;
        double quilometros;


        Scanner input = new Scanner(System.in);

        System.out.println("Quantas milhas maritimas deseja calcular?");
        milhasM = input.nextDouble();

        quilometros = milhasM*1852;



        System.out.println("isso eh " + quilometros + " km");

    }
}
