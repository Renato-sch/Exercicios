import java.util.Scanner;

public class medias {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int numero = 0;
        int soma = 0;
        double media = 0;
        int cont = 0;
        int maior_numero = 0;
        int menor_numero = 0;
        int soma_par = 0;
        double media_par = 0;
        int cont_par = 0;
        boolean flag = false;

        while(numero >= 0){

            System.out.println("Digite um numero.\n");

            numero = ler.nextInt();

            if(numero >= 0) {
                cont++;
                soma = soma + numero;

                if(numero % 2 == 0){
                    cont_par++;
                    soma_par = soma_par + numero;
                }

                if(flag == false){//primeira vez dentro do loop
                    flag = true;
                    maior_numero = numero;
                    menor_numero = numero;
                }

                if(numero > maior_numero){
                    maior_numero = numero;
                }

                if (numero < menor_numero){
                    menor_numero = numero;
                }


            }
            
        }

        media = soma / cont;
        if(cont_par > 0){
            media_par = soma_par / cont_par;
        }
        
        else{
            media_par = 0;
        }

        System.out.println("\nSoma dos números:" + soma + "\n");

        System.out.println("Quantidade de números:" + cont + "\n");

        System.out.println("Média dos números:" + media + "\n");

        System.out.println("Maior número digitado:" + maior_numero + "\n");

        System.out.println("Menor número digitado:" + menor_numero + "\n");

        System.out.println("Média dos números pares:" + media_par + "\n");


  
    }
    
}
