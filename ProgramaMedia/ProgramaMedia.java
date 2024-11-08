package ProgramaMedia;
import java.util.Scanner;

public class ProgramaMedia {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite sua primeira nota:");
        float n1 = teclado.nextFloat();
        System.out.print("Digite sua segunda nota:");
        float n2 = teclado.nextFloat();
        float m = (n1 + n2) / 2;
        System.out.println("Sua média foi: " + m);
        if (m>9){
            System.out.println("Parabéns!!");
        }
    }

}
