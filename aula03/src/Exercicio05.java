import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        String texto;
        char letra;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        texto = scanner.nextLine();
        String textoLower = texto.toLowerCase();

        System.out.println("Digite uma letra: ");
        letra = scanner.next().charAt(0);

        System.out.println("A posição do da primeira ocorrencia do caractere "+letra+" é: "+(textoLower.indexOf(letra)+1));


    }
}
