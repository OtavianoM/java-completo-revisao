package secao5;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        validacaoPar();

    }

    public static void usandoIfTernario(){
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double preco = sc.nextDouble();
        double desconto = ((preco < 20.0) ? preco * 0.1 : preco * 0.05);

        System.out.println("Desconto = " + desconto);

        sc.close();
    }
    public static void validacaoPar() {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int minutos = sc.nextInt();

        if(minutos % 2 == 0){
            System.out.println("PAR");
        }else {
            System.out.println("IMPAR");
        }

        sc.close();
    }

    public static void validacaoValor() {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int minutos = sc.nextInt();

        if(minutos < 0 ){
            System.out.println("NEGATIVO");
        } else {
            System.out.println("NÃO NEGATIVO");
        }

        sc.close();
    }

    public static void cobrancaTelefone(){

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int minutos = sc.nextInt();

        double conta = 50.0;

        if (minutos > 100) {
            conta += (minutos - 100) * 2.0;
        }
        System.out.printf("Valor da conta = R$ %.2f%n", conta);
        sc.close();
    }
}
