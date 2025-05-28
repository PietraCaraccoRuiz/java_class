import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num1 = "";
        String num2 = "";

        System.out.println("Escreva um número de 1 a 99: ");
        int num = Integer.parseInt(scanner.nextLine());

            if(num >= 0 && num < 100) {
                if (num >= 20) {
                    int dezena = Integer.parseInt(String.valueOf(num).substring(0, 1));
                    int unidade = Integer.parseInt(String.valueOf(num).substring(1));
                    num = unidade;

                    if (dezena == 2) {
                        num1 = "Vinte";
                    } else if (dezena == 3) {
                        num1 = "Trinta";
                    } else if (dezena == 4) {
                        num1 = "Quarenta";
                    } else if (dezena == 5) {
                        num1 = "Cinquenta";
                    } else if (dezena == 6) {
                        num1 = "Sessenta";
                    } else if (dezena == 7) {
                        num1 = "Setenta";
                    } else if (dezena == 8) {
                        num1 = "Oitenta";
                    } else if (dezena == 9) {
                        num1 = "Noventa";
                    }

                    if (num == 0) {
                        System.out.printf(num1);
                    } else {
                        System.out.printf(num1 + " e ");
                    }
                }

                if(num == 0){
                    num2 = "Zero";
                }else if(num == 1){
                    num2 = "Um";
                } else if(num == 2){
                    num2 = "Dois";
                } else if(num == 3){
                    num2 = "Três";
                } else if(num == 4){
                    num2 = "Quatro";
                } else if(num == 5){
                    num2 = "Cinco";
                } else if(num == 6){
                    num2 = "Seis";
                } else if(num == 7){
                    num2 = "Sete";
                } else if(num == 8){
                    num2 = "Oito";
                } else if(num == 9){
                    num2 = "Nove";
                } else if(num == 10){
                    num2 = "Dez";
                } else if(num == 11){
                    num2 = "Onze";
                } else if(num == 12){
                    num2 = "Doze";
                } else if(num == 13){
                    num2 = "Treze";
                } else if(num == 14){
                    num2 = "Quatorze";
                } else if(num == 15){
                    num2 = "Quinze";
                } else if(num == 16){
                    num2 = "Dezesseis";
                } else if(num == 17){
                    num2 = "Dezessete";
                } else if(num == 18){
                    num2 = "Dezoito";
                } else if(num == 19){
                    num2 = "Dezonove";
                }
                System.out.printf(num2);
        } else {
            System.out.println("Apenas numeros de 1 a 99");
        }
    }
}
