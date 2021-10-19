import java.util.Scanner;

public class media_aluno {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        String nome;
        double nota1;
        double nota2;
        double media;

        System.out.println("Digite o nome do aluno:\n");

        nome = ler.nextLine();

        System.out.println("Digite a primeira nota do aluno:\n");

        nota1 = ler.nextInt();

        System.out.println("Digite a segunda nota do aluno:\n");

        nota2= ler.nextInt();

        media = (nota1 + nota2) * 2 / 3;

        System.out.println("Media do aluno " + nome + ": " + media);

    }

}
