import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite seu e-mail: ");
        String email = scanner.nextLine();

        int posicaoArroba = email.indexOf("@");
        int posicaoPonto = email.indexOf(".");
        String dominio1 = email.substring(posicaoArroba+1);
        String dominio2 = email.substring(posicaoArroba+1, posicaoPonto+1);
        System.out.println("1: "+ dominio1);
        System.out.println("2: "+dominio2);
//
//        if (email.contains("@") && dominio2.contains(".") && posicao != 0) {
//            System.out.println("Endereço de e-mail válido.");
//        } else {
//            System.out.println("Endereço de e-mail inválido!");
//        }
    }
}
