import java.util.Scanner;

public class maior_dez {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int numero;

        System.out.println("Digite um número:\n");

        numero = ler.nextInt();

        if (numero > 10){
            System.out.println("Numero maior que 10");
        }

        else{
            System.out.println("Número menor ou igual a 10");
        }
        
    }

}
