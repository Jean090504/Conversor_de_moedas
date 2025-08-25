import java.util.Scanner;

/*CONVERSOR DE MOEDAS*/
public class Conversor {
    String moedaOrigem;
    String moedaDestino;
    double valorMoedaOrigem;
    double valorMoedaDestino;
    double conversor;

    public void entradaDeDados(){
        Scanner leitorInt = new Scanner(System.in);
        Scanner leitorString = new Scanner(System.in);


        /*Exemplo "Real, Dólar..."*/
        System.out.print("Qual a moeda que possui ?");
        moedaOrigem = leitorString.nextLine();

        /*Exemplo "Dólar: $ 5.45"*/
        System.out.print("Qual o valor da moeda que possui ?");
        valorMoedaOrigem = leitorInt.nextDouble();

        /*Exemplo "Pataca, Iene..."*/
        System.out.print("Para qual a moeda deseja converter ?");
        moedaDestino = leitorString.nextLine();

        /*Exemplo "Dólar: $ 5.45"*/
        System.out.print("Qual o valor da moeda que deseja converter ?");
        valorMoedaDestino = leitorInt.nextDouble();

       exibirDados();

    }

    public void calculo(){
        conversor = valorMoedaOrigem / valorMoedaDestino;


    }

    public void exibirDados(){
        calculo();

        System.out.println("*****************************");
        System.out.println("MOEDA QUE POSSUI: " + moedaOrigem);
        System.out.println("VALOR DA MOEDA QUE POSSUI: " + valorMoedaOrigem );
        System.out.println("MOEDA QUE FARÁ A CONVERSÃO: " + moedaDestino);
        System.out.println("VALOR DA MOEDA QUE FARÁ A CONVERSÃO: " + valorMoedaDestino);
        System.out.println("DIFERENÇA DE CONVERSÃO: " + conversor);
        System.out.println("*****************************");

    }



}
