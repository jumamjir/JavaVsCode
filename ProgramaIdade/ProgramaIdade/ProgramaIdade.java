package ProgramaIdade;
import java.util.Scanner;

public class ProgramaIdade {
    public static void main(String []args){
        @SuppressWarnings("resource")
        Scanner t = new Scanner(System.in);
        System.out.println("Em que ano você nasceu? ");
        int nasc = t.nextInt();
        int i = (2024 - nasc);
        System.out.println("Sua idade é " + i);
        if (i>=18){
            System.out.println("Você é maior de idade");
        }
            else {
                System.out.println(" Você é menor de idade");
            }
    }

}
 