import java.util.Scanner;

public class operacoes {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double a;

        System.out.println("Digite um número:\n");

        a = ler.nextDouble();

        System.out.println("Dobro desse número: " + (2*a));
        System.out.println("O triplo do dobro desse número: " + (3*2*a));
        System.out.println("Metade do tripo do dobro desse número: " + (3*2*a/2));
        System.out.println("Quadrado desse número: " + Math.pow(a, 2));
        System.out.println("Quinta parte do dobro desse número: " + (2*a/5));

    }

}

