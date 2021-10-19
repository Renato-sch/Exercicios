/*
Programa que retorna uma mensagem dizendo o gênero da pessoa
 */

//importacão da classe Scanner
import java.util.Scanner;
import java.lang.*;

public class Genero {

    public static void main(String args[]) {
        //instanciando a classe Scanner
        //iniciando a classe Scanner no nosso programa
        Scanner ler = new Scanner(System.in);

        String genero;


        System.out.println("Digite o seu gênero:" + "\n");
        genero = ler.nextLine();


        if(genero.equals("M") || genero.equals("m")){
            System.out.println("Você é do gênero Masculino");
        }

        else if(genero.equals("F") || genero.equals("f")){
            System.out.println("Você é do gênero Feminino");
        }
        else{
            System.out.println("Você é de um gênero alternativo\n");
        }
    }
}