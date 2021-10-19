/*
Programa que verifica quantos livros serão comprados e se
o número é maior que ou igual a 5, terá desconto de 50%
 */

//importacão da classe Scanner
import java.util.Scanner;

public class Livros {

    public static void main(String args[]) {
        //instanciando a classe Scanner
        //iniciando a classe Scanner no nosso programa
        Scanner ler = new Scanner(System.in);

        int livros,preco;
        double valor_Final = 0;
        preco = 10;

        System.out.println("Digite o número de livros que deseja comprar: " + "\n");
        livros = ler.nextInt();

        if(livros >= 5){
            valor_Final = preco * livros / 2;
            System.out.println("Seu desconto é de: 50% \n");
            System.out.println("Valor total:" + valor_Final);
        }

        else{
            valor_Final = preco * livros;
            System.out.println("você não tem desconto nos livros \n");
            System.out.println("Valor total:" + valor_Final);
        }
    }
}