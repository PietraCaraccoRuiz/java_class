import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = Integer.parseInt(scanner.nextLine());

        if (idade < 16) {
            System.out.println("Não leitor!");
        } else if (idade >= 18 && idade <= 65) {
            System.out.println("Eleitor obrigatório!");
        } else {
            System.out.println("Eleitor facultativo!");
        }
    }
}
