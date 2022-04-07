import java.util.Scanner;

public class TP01Ex18 {

    public static void main(String[] args)
    {
        //Alunos:Luiz Gustavo Leal Cortez

        //18. Entrar via teclado com o valor de cinco produtos. Após as entradas, digitar um
        //valor referente ao pagamento da somatória destes valores. Calcular e exibir o troco
        //que deverá ser devolvido.


        Scanner input =  new Scanner(System.in);
        System.out.println("Entre com o valor do primeiro produto : ");
        double valor1 = input.nextDouble();
        System.out.println("Entre com o valor do segundo produto : ");
        double valor2 = input.nextDouble();

        System.out.println("Entre com o valor do terceiro produto : ");
        double valor3 = input.nextDouble();

        System.out.println("Entre com o valor do quarto  produto : ");
        double valor4 = input.nextDouble();

        System.out.println("Entre com o valor do quinto produto : ");
        double valor5 = input.nextDouble();

        double total = valor1+valor2+valor3+valor4+valor5;
        System.out.println("Entre com o valor pago : ");
        double pago = input.nextDouble();

        double troco = total - pago;
        System.out.println("O valor do troco eh : "+troco);



    }
}