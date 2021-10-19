import java.util.Scanner;

public class nome {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome;
        int idade;

        System.out.println("Digite o nome:");

        nome = ler.nextLine();

        System.out.println("Digite a idade:\n");

        idade = ler.nextInt();

        System.out.println("Seu nome é: " + nome);

        System.out.println("Sua idade é: " + idade);

    }

}
