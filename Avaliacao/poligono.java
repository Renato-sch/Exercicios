import java.util.Scanner;
import java.lang.Math;

public class poligono {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

    int lado;
    double medida;
    double area;

    System.out.println("Digite o numero de lados do polígono regular");
    lado = ler.nextInt();

    System.out.println("Digite o tamanho em centímetros de cada lado");
    medida = ler.nextDouble();


    if(lado == 3){
        area = lado * Math.sqrt(3)/4;

        System.out.println("Área do triângulo é: " + area);
    }

    if(lado == 4){
        area = lado * lado;

        System.out.println("Área do quadrado é: " + area);
    }

    
    }
    
}
