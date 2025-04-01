//Entrada de dados formatada
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //        Ler text
        // ler ate o primeiro espaço
        String nome;
        nome = scanner.next();
        System.out.println(nome);

        //        Ler text
        String nome1 = scanner.nextLine();
        System.out.println(nome1);

        //        Ler variaveis numericas
        //        Ler text Int
        int idade = Integer.parseInt(scanner.nextLine());
        System.out.println(idade);

    }
}
