/**
 * Questão: @mumia: Criança, jovem, adulto
 *
 * @author UxieGu1
 */

package Selecao_II;
import java.util.Scanner;

public class Mumia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome = scan.nextLine();
        int idade = scan.nextInt();

        if(idade < 12) {
            System.out.println(nome + " eh crianca");
        } else if(idade < 18) {
            System.out.println(nome + " eh jovem");
        } else if(idade < 65) {
            System.out.println(nome + " eh adulto");
        } else if(idade < 1000) {
            System.out.println(nome + " eh idoso");
        } else {
            System.out.println(nome + " eh mumia");
        }

        scan.close();
    }
}
