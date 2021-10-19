import java.util.Scanner;

public class media_alunos {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero_alunos = 0;
        double nota;
        int cont = 1;
        double media = 0;

        System.out.println("Digite o numero de alunos\n");

        numero_alunos = ler.nextInt();

        while(cont != (numero_alunos + 1) && numero_alunos > 0){
            
            System.out.println("Digite a nota do " + cont + "º aluno");

            nota = ler.nextDouble();

            media = media + nota;

            cont++;
        }
        if (numero_alunos > 0){
            media = media / numero_alunos;

            System.out.println("A média dos " + numero_alunos + " alunos é de: " + media);
        }

        else{
            System.out.println("Número inválido de alunos. Encerrando programa");
        }
    }

}
