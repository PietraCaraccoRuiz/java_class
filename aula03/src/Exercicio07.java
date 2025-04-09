import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um texto: ");
        String texto = scanner.nextLine();
        System.out.println("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        System.out.println("A palavra está no texto? "+ (texto.contains(palavra)));

    }
}
