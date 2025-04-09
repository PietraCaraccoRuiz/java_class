import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um texto: ");
        String texto = scanner.nextLine();

        System.out.println("\nDigite uma palavra de questa no texto : '" + texto + "'");
        String palavra = scanner.nextLine();

        int i = texto.indexOf(palavra);

        System.out.println(texto.substring(i));
    }
}
