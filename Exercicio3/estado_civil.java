import java.util.Scanner;

public class estado_civil {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String estado_civil;

        System.out.println("Digite o estado civil da pessoa:\n");

        estado_civil = ler.nextLine();

        switch (estado_civil) {
            case "S":
            
                System.out.println("Você está solteiro(a).");

                break;

            case "C":
            
                System.out.println("Você está casado(a).");

                break;

            case "D":
            
                System.out.println("Você está divorciado(a).");

                break;

            case "V":
            
                System.out.println("Você é Viúvo(a).");

            case "s":
            
                System.out.println("Você está solteiro(a).");

                break;

            case "c":
            
                System.out.println("Você está casado(a).");

                break;

            case "d":
            
                System.out.println("Você está divorciado(a).");

                break;

            case "v":
            
                System.out.println("Você é Viúvo(a).");

                break;    
        
            default:
                break;
        }

    }
    
}
