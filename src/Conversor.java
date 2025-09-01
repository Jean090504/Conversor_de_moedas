import java.util.Scanner;

/*CONVERSOR DE MOEDAS*/
public class Conversor {
    String moedaOrigem;
    String moedaDestino;
    float valorCotacao;
    float conversor;

    public void entradaDeDados(){
        Scanner leitorFloat = new Scanner(System.in);
        Scanner leitorString = new Scanner(System.in);


        /*Exemplo "Real, Dólar..."*/
        System.out.print("Qual a moeda que possui ?");
        moedaOrigem = leitorString.nextLine();

        /*Exemplo "Pataca, Iene..."*/
        System.out.print("Para qual moeda deseja converter ?");
        moedaDestino = leitorString.nextLine();

        /*Exemplo "Dólar: $ 5.45"*/
        System.out.print("Qual o valor de 1 " +moedaOrigem + " em relação a moeda " + moedaDestino + " ?");
        valorCotacao = leitorFloat.nextFloat();

        exibirDados();

    }

    public void calculo(){
        conversor = 1/valorCotacao;


    }

    public void exibirDados(){
        calculo();

        System.out.println("*****************************");
        System.out.println("MOEDA DE ORIGEM: " + moedaOrigem);
        System.out.println("MOEDA DE CONVERSÃO: " + moedaDestino);
        System.out.println("VALOR DA COTAÇÃO: " + valorCotacao);
        System.out.printf("CONVERSÃO: %.2f\n", conversor);
        System.out.println("*****************************");

    }
}
