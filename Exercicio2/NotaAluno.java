import java.util.Scanner;

public class NotaAluno {
    Scanner ler = new Scanner(System.in);
    private String nome;
    private String disciplina;
    private double nota1, nota2, nota3;
    private int frequencia;
    private double media;


    public double media(){
        System.out.println("Digite o nome do aluno\n");

        this.nome = ler.nextLine();

        System.out.println("Digite a disciplina que o aluno está cursando\n");

        this.disciplina = ler.nextLine();

        System.out.println("Digite a primeira nota do aluno:\n");

        this.nota1 = ler.nextDouble();

        System.out.println("Digite a segunda nota do aluno:\n");

        this.nota2 = ler.nextDouble();
        
        System.out.println("Digite a terceira nota do aluno:\n");

        this.nota3 = ler.nextDouble();

        System.out.println("Digite a frequência do aluno nesta disciplina:\n");

        this.frequencia = ler.nextInt();

        this.media = (this.nota1 + this.nota2 + this.nota3)/3;

        if(media >= 6 && frequencia >= 75){
            System.out.println("O aluno " + this.nome + " foi aprovado com média: " + media);
        }

        else{
            System.out.println("O aluno " + this.nome + " foi reprovado.");
        }

        return this.media;
    }

}
