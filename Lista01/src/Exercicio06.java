import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = Integer.parseInt(scanner.nextLine());

        if (idade > 4 && idade < 8) {
            System.out.println("Infantil A");
        } else if (idade> 7 && idade < 11) {
            System.out.println("Infantil B");
        } else if (idade > 10 && idade < 14) {
            System.out.println("Juvenil A");
        } else if (idade > 13 && idade < 18) {
            System.out.println("Juvenil B");
        } else if (idade >= 18) {
            System.out.println("Sênior");
        }else{
            System.out.println("Não há categoria!");
        }

    }
}
