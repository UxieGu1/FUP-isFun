/**
 * Questão: @cobra: Jogo da cobrinha
 *
 * @author UxieGu1
 */
package Selecao_II;

import java.util.Scanner;

import java.util.Scanner;

public class Cobrinha {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N, X, Y, S;
        char C;

        N = scan.nextInt();
        X = scan.nextInt();
        Y = scan.nextInt();
        C = scan.next().charAt(0);
        S = scan.nextInt();

        S = S % N;

        switch(C){
            case 'U':
                Y = Y - S;
                if(Y < 0) Y += N;
                break;
            case 'D':
                Y = Y + S;
                if(Y >= N) Y =Y - N;
                break;
            case 'L':
                X = X - S;
                if(X < 0) X += N;
                break;
            case 'R':
                X += S;
                if(X >= N) X -= N;
        }

        System.out.printf("%d %d\n", X, Y);

    }
}
