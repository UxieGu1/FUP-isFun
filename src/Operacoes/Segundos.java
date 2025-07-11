/**
 * Questão: @segundos: Converter segundos em h:m:s
 *
 * @author UxieGu1
 */
package Operacoes;
import java.util.Scanner;

public class Segundos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tempo = scanner.nextInt();

        int hora = tempo / 3600;
        int resto = tempo % 3600;
        int minutos = resto / 60;
        int segundos = resto % 60;

        System.out.printf("%d:%d:%d%n", hora, minutos, segundos);
        scanner.close();
    }
}
