/*
  Criar um algoritmo onde digita-se:
- Nome do aluno
- Disciplina;
-  Nota1, nota2 e nota3;
- Frequência do aluno;
 */

//importacão da classe Scanner
import java.util.Scanner;
import java.lang.*;

public class Aprovacao {

    public static void main(String args[]) {
        //instanciando a classe Scanner
        //iniciando a classe Scanner no nosso programa
        Scanner ler = new Scanner(System.in);

        String nome_Aluno;
        String disciplina;
        double nota1, nota2, nota3;
        double frequencia = 0;
        double media;

        System.out.println("Digite o nome do aluno:" + "\n");
        nome_Aluno = ler.nextLine();

        System.out.println("Digite a disciplina do aluno:" + "\n");
        disciplina = ler.nextLine();

        System.out.println("Digite a primeira nota do aluno:" + "\n");
        nota1 = ler.nextDouble();

        System.out.println("Digite a segunda nota do aluno:" + "\n");
        nota2 = ler.nextDouble();

        System.out.println("Digite a terceira nota do aluno:" + "\n");
        nota3 = ler.nextDouble();

        System.out.println("Digite a frequencia do aluno:" + "\n");
        frequencia = ler.nextDouble();

        media = (nota1 + nota2 + nota3)/3;

        if(media >= 6 && frequencia >= 75){
            System.out.println("A média final do aluno " + nome_Aluno + "na matéria " + disciplina +  "é: " + media);
            System.out.println("\n Aprovado!");
        }

        else{
            System.out.println("A média final do aluno " + nome_Aluno + " é: " + media);
            System.out.println("\n Reprovado!");
    }
}
}