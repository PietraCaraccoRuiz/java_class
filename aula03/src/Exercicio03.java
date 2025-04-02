import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        String texto;
        int posicao;
        int tamanho;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um texto: ");
        texto = scanner.nextLine();

        tamanho = texto.length()-1;
        System.out.println("Digite um numero entre 0 a "+ tamanho +": ");
        posicao = Integer.parseInt(scanner.nextLine());

        System.out.println("A letra que esta nessa posição é "+ texto.charAt(posicao));

    }
}
