import java.util.Scanner;

public class produtos {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String produto = "0";
        int cont = 0;
       

        while(produto.equals("end")){
        System.out.println("Digite um produto \n");

        produto = ler.nextLine();

        cont++;

        }
        System.out.println("Quantidade de produtos digitados: " + cont);
    }    
}
