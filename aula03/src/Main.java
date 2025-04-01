//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Coloca todos os caracteres em maiscula
        String palavra = "Laranja";
        System.out.println(palavra.toUpperCase());

        // Coloca todos os caracteres em minuscula
        System.out.println(palavra.toLowerCase());

        // Quantidade de letras
        System.out.println(palavra.length());

        // Letra da posicao index
        System.out.println(palavra.charAt(2));

        // Posicao index da primeira letra
        System.out.println(palavra.indexOf('a'));

        //Posicao index da ultima letra
        System.out.println(palavra.lastIndexOf('a'));



        Exercicio01 exercicio01 = new Exercicio01();

        exercicio01.endereco();

    }
}