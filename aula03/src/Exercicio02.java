import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        String texto;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um texto: ");
        texto = scanner.nextLine();


        System.out.println("A quantidade de letras é " + texto.length());
        System.out.println("A primeira letra da palavra é " + texto.charAt(0));
        System.out.println("A ultima letra da palavra é " + texto.charAt(texto.length()-1));
    }

}
