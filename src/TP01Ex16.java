import java.util.Scanner;

public class TP01Ex16 {

    public static void main(String[] args)
    {
        //Alunos:Luiz Gustavo Leal Cortez

        //16. Entrar via teclado com o valor de um ângulo em graus, calcular e exibir as seguintes funções trigonométricas
        // : seno, cosseno, tangente e secante deste ângulo.

        Scanner input =  new Scanner(System.in);

        System.out.println("Digite o angulo: ");
        double angulo = input.nextDouble();
        double rad = (Math.PI/180) * angulo;
        double tangente = Math.tan(rad);
        double seno = Math.sin(rad);
        double cosseno = Math.cos(rad);
        double secante = 1/cosseno;


        System.out.println("Cosseno eh:"+cosseno);

        System.out.println("Seno eh: "+seno);

        System.out.println("Tangente eh: "+tangente);

        System.out.println("Secante eh: "+secante);



    }
}