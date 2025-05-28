import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int valido = 0;

        System.out.println("Digite seu e-mail: ");
        String email = scanner.nextLine();

        if (email.contains("@")){
            if (email.contains(".")) {

                int posicaoArroba = email.lastIndexOf("@");
                int posicaoPonto = email.lastIndexOf(".");
                if(posicaoPonto > posicaoArroba) {
                    String dominio2 = email.substring(posicaoPonto + 1);
                    String dominio1 = email.substring(posicaoArroba + 1, posicaoPonto);

                    if (dominio1.isEmpty()) {
                        System.out.println("E-mail não possui dominio depois do '@'");
                    } else {
                        valido += 1;
                    }

                    if (dominio2.isEmpty()) {
                        System.out.println("E-mail não possui dominio depois do '.'");
                    } else {
                        valido += 1;
                    }

                } else {
                    System.out.println("Não tem um . depois do '@'");
                }
            } else {
                System.out.println("\nNão contem um domínio precisa de '.'");
            }
        } else {
            System.out.println("\nNão contem um domínio precisa de '@'");
        }

        if (valido == 2) {
            System.out.println("E-mail válido!");
        }
    }
}
