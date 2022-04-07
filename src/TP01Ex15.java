import java.util.Scanner;
public class TP01Ex15{
    public static void main(String []args){

        //Alunos: Luiz Gustavo Leal Cortez
        //15. Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de
        //dólares. Calcular e exibir o valor correspondente em Reais (R$).


        double cotacaodolar;
        double real;
        double dolar;

        Scanner input = new Scanner(System.in);


        System.out.println("Insira a cotacao do dolar");
        cotacaodolar = input.nextDouble();

        System.out.println("Insira quantos dolares");
        dolar = input.nextDouble();

        real = dolar * cotacaodolar;

        System.out.println("isso sao " + real +" reais");

    }
}
