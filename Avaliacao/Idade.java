/*
Programa que pede o nome, verifica a idade e dá desconto caso
seja maior ou igual a 60 anos
 */

//importacão da classe Scanner
import java.util.Scanner;

public class Idade {

    public static void main(String args[]) {
        //instanciando a classe Scanner
        //iniciando a classe Scanner no nosso programa
        Scanner ler = new Scanner(System.in);

        String nome;
        int idade;
        double valor_Ingresso = 30;
        double valor_Final = 0;

        System.out.println("Digite o seu nome:" + "\n");
        nome = ler.nextLine();

        System.out.println("Digite a sua idade:" + "\n");
        idade = ler.nextInt();

        if(idade >= 60){
            valor_Final = valor_Ingresso/2;
            System.out.println("Seu desconto é de: 50% \n");
            System.out.println("Valor do ingresso do(a) "+ nome + ":\n" + valor_Final);
        }

        else{
            valor_Final = valor_Ingresso;
            System.out.println("Valor do ingresso do(a) "+ nome + ":\n" + valor_Final);
        }
    }
}