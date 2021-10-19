import java.util.Scanner;

public class par {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int numero;

        System.out.println("Digite um número:\n");

        numero = ler.nextInt();

        if ((numero%2) == 0 && numero > 0){
            System.out.println("Este número é par");
        }

        else if((numero%2) != 0 && numero > 0){
            System.out.println("Este número é impar");
        }

        else{
            System.out.println("Este número é inválido");
        }
        
    }

}