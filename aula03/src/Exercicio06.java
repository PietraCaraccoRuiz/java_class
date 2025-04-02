import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        String gosto = "Eu gosto de maçã, maçã é gostosa!";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma letra: ");
        char letra = scanner.next().charAt(0);

        System.out.println("A letra "+ letra + " aparece na posição ultima posição: "+ (gosto.lastIndexOf(letra)+1));
    }
}
