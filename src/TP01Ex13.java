import java.util.Scanner;
public class TP01Ex13{
    public static void main(String []args){

        //Alunos:Luiz Gustavo Leal Cortez
        //13. Calcular e exibir a velocidade final (em km/h) de um automóvel, a partir dos
        //valores da velocidade inicial (em m/s), da aceleração (m/s2) e do tempo de percurso
        //(em s) que serão digitados.

        double velocidadeI;
        double velocidadeF;
        double aceleracao;
        double tempo;

        Scanner input = new Scanner(System.in);


        System.out.println("Digite o valor da velocidade inicial");
        velocidadeI = input.nextDouble();

        System.out.println("Digite o tempo");
        tempo = input.nextDouble();

        System.out.println("Digite a aceleracao ");
        aceleracao = input.nextDouble();

        velocidadeF = velocidadeI + (aceleracao*tempo);
        System.out.println("a velocidade final eh" + velocidadeF);

    }
}
