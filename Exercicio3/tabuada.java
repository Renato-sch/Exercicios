import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero;
        int resultado;

        System.out.println("Digite um numero para saber sua tabuada\n");

        numero = ler.nextInt();
        
        System.out.println("\n");

        for(int cont = 1; cont < 11; cont++){

            resultado = numero * cont;

            System.out.println(numero + " x " + cont + " = " + resultado + "\n");

        }
    }
} 