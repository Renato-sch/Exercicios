/*
Elabore um algoritmo que some a idade de 5 pessoas e retorne o nome destas pessoas. 
O usuário deverá digitar o nome + a idade de 5 pessoas. 
O programa deverá retornar o nome das 5 pessoas + a soma da idade destas pessoas.
*/
import java.util.Scanner;

public class soma_idade {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome;
        int idade;
        int soma_idade = 0;
        String todos_nomes = " ";
        int cont = 0;

        while(cont < 5){

            System.out.println("Digite o nome da pessoa:\n");

            nome = ler.next();

            System.out.println("Digite a sua idade:\n");

            idade = ler.nextInt();

            soma_idade = soma_idade + idade;

            todos_nomes = todos_nomes + " " + nome;

            cont++;
        }

        System.out.println("Nomes: " + todos_nomes);
        System.out.println("Soma das idades: " + soma_idade);

    }
    
    
}
