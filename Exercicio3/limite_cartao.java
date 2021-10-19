import java.util.Scanner;

public class limite_cartao {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome;
        String num_conta;
        double limite_crédito;
        double dinheiro_gasto;

            System.out.println("Digite o nome da pessoa:\n");

            nome = ler.nextLine();

            System.out.println("Digite o numero da conta:\n");

            num_conta = ler.nextLine();

            System.out.println("Digite o limite de crédito:\n");

            limite_crédito = ler.nextInt();

            System.out.println("Digite o quanto foi gasto:\n");

            dinheiro_gasto = ler.nextInt();

            if(dinheiro_gasto <= limite_crédito){

                System.out.println("Crédito ativo!");

            }

            else{

                System.out.println("Excedeu limite");

           }

    }
    

}
