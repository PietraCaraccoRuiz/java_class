import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um texto: ");
        String texto = scanner.nextLine();
        String textoLower = texto.toLowerCase();

        System.out.println("Digite uma palavra: ");
        String palavra = scanner.nextLine();
        String palavraLower = palavra.toLowerCase();

        System.out.println("A palavra está no texto? "+ (textoLower.contains(palavraLower)));

    }
}
