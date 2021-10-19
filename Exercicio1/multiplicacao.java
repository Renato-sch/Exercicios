import java.util.Scanner;

public class multiplicacao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero1;
        int numero2;
        int numero3;
        int multiplicacao;

        System.out.println("Digite o primeiro número:\n");

        numero1 = ler.nextInt();

        System.out.println("Digite o segundo número:\n");

        numero2 = ler.nextInt();

        System.out.println("Digite o terceiro número:\n");

        numero3 = ler.nextInt();

        multiplicacao = numero1 * numero2 * numero3;

        System.out.println("Resultado da multiplicação: " + multiplicacao);
    }
}
