/**
 * Questão: @fuga: Fuga em helicóptero - OBI 2016
 *
 * @author UxieGu1
 */
package Repeticao_II;
import java.util.Scanner;

public class Fuga {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int h, p, f, d;
        h = scan.nextInt();
        p = scan.nextInt();
        f = scan.nextInt();
        d = scan.nextInt();


        if(d == 1){
            for (int i = f;; i++) {
                if (i == 16){
                    i = 0;
                }
                if(i == p){
                    System.out.println("N");
                    break;
                }
                if (i == h){
                    System.out.println("S");
                    break;
                }
            }
        }
        if (d == -1){
            for(int i=f;;i--){
                if(i==-1){

                    i=15;
                }
                if(i==p){
                    System.out.println("N");
                    break;
                }
                if(i==h){
                    System.out.println("S");
                    break;
                }
            }
        }
        scan.close();
    }
}
