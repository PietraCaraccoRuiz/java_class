import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome completo: ");
        String nomeCompleto = scanner.nextLine();

        int sobrenome = nomeCompleto.lastIndexOf(" ");

        System.out.println("Sobrenome: "+ nomeCompleto.substring(sobrenome+1));


    }


}
