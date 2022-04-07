import java.util.Scanner;

public class TP01Ex17 {

    public static void main(String[] args)
    {
        //Alunos :Luiz Gustavo Leal Cortez

        //17. Entrar via teclado com dois valores quaisquer “X” e “Y”. Calcular e exibir o
        //cálculo XY (“X” elevado a “Y”). Pesquisar as funções Exp e Ln.




        Scanner input =  new Scanner(System.in);
        System.out.println("Digite o valor 1 : ");
        double x = input.nextDouble();
        System.out.println("Digite o valor 2: ");
        double y = input.nextDouble();

        double elevado = Math.pow(x,y);
        double exp = Math.exp(elevado);
        double ln = Math.log(elevado);
        System.out.println("ELEVADO : "+elevado);
        System.out.println("EXP"+exp);
        System.out.println("LOG : "+ln);

    }
}