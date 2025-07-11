/**
 * Questão: @guarda: Retornando problemas primeiro
 *
 * @author UxieGu1
 */
package Selecao_I;
import java.util.Scanner;

public class Guarda {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int wifi = scan.nextInt();
        int login = scan.nextInt();
        int admin = scan.nextInt();

        if(wifi == 0) {
            System.out.println("you must connect to wifi");
        } else if(login == 0) {
            System.out.println("you need to login first");
        } else if(admin == 0) {
            System.out.println("you must to login as admin");
        } else {
            System.out.println("done");
        }

        scan.close();
    }
}
