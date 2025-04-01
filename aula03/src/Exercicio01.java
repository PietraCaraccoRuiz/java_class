import java.util.Scanner;

public class Exercicio01 {
    static String nome;
    static String cidade;
    static String estado;
    public static void main(String[] args) {
    }

    public void endereco(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = scanner.nextLine();

        System.out.println("Digite sua cidade: ");
        cidade = scanner.nextLine();

        System.out.println("Digite seu estado: ");
        estado = scanner.nextLine();

        System.out.println("Nome: " + nome.toUpperCase());
        System.out.println("Cidade: " + cidade.toLowerCase());
        System.out.println("Estado: " + estado.toLowerCase());
    }
}
