import java.util.Scanner;

public class JEsus {
    public static void main(String[] args) {
        // Criando um objeto Scanner para receber entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Pedindo ao usuário para inserir um número de 3 dígitos
        System.out.print("Digite um número com 3 algarismos: ");
        int number = scanner.nextInt();
        
        // Extraindo os dígitos do número original
        int digit1 = number % 10;          // Último dígito
        int digit2 = (number / 10) % 10;   // Segundo dígito
        int digit3 = number / 100;          // Primeiro dígito
        
        // Construindo o número invertido
        int reversedNumber = digit1 * 100 + digit2 * 10 + digit3;
        
        // Imprimindo o número invertido
        System.out.println("O número invertido é: " + reversedNumber);
        
        // Fechando o scanner para evitar vazamento de recursos
        scanner.close();
    }
}
