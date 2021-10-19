import java.util.Scanner;

public class maior_idade {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero_pessoas = 10;
        int idade;
        int cont_maior_idade = 0;

        for(int cont = 0; cont < numero_pessoas; cont++){
            System.out.println("Digite a idade da " + (cont+1) + "ª pessoa");

            idade = ler.nextInt();

            if (idade >= 18){
                cont_maior_idade++;
            }
        }

        System.out.println("Existem " + cont_maior_idade + " pessoas maior(es) de idade");

        
    }    
}
