/**
 * Questão: @zigzag: Viunei e a saúde mental
 *
 * @author UxieGu1
 */
package Repeticao_II;
import java.util.Scanner;

public class Zigzag {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int inicio = scan.nextInt();
        int fim = scan.nextInt();

        for (int i = inicio; i <= fim; i++) {
            if(i % 3 != 0 || i % 5 != 0){
                System.out.println(i);
                continue;
            }else if(i % 3 == 0){
                System.out.println("zig");
                continue;
            }else if(i % 5 == 0){
                System.out.println("zag");
                continue;
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("zigzag");
                continue;
            }
        }
        scan.close();
    }
}
