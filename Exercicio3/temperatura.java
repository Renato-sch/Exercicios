import java.util.Scanner;

public class temperatura {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double temperatura;

        System.out.println("Digite a temperatura:\n");

        temperatura = ler.nextDouble();

        estado_agua(temperatura);
        
    }

    public static void estado_agua(double temperatura){

        if(temperatura <= 0){
            System.out.println("A água está em estado sólido");
        }

        else if(temperatura > 0  && temperatura < 100){
            System.out.println("A água está em estado líquido");
        }

        else if(temperatura >= 100){
            System.out.println("A água está em estado gasoso");
        }
        
    }
}
