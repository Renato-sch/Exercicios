/*
Escreva um programa que verifique a validade de uma senha fornecida pelo usuário. 
A senha válida é o número 1234. Devem ser impressas as seguintes mensagens:
ACESSO PERMITIDO caso a senha seja válida.
ACESSO NEGADO caso a senha seja inválida.
*/ 

//importacão da classe Scanner
import java.util.Scanner;

public class Senha {

    public static void main(String args[]) {
        //instanciando a classe Scanner
        //iniciando a classe Scanner no nosso programa
        Scanner ler = new Scanner(System.in);

        String senha = "1234";

        System.out.println("Digite a senha:" + "\n");
        senha = ler.nextLine();


        if(senha.equals("1234")){
            System.out.println("ACESSO PERMITIDO!");
        }

        else{
            System.out.println("ACESSO NEGADO");
        }
    }
}

