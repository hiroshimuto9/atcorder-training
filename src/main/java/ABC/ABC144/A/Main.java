package ABC.ABC144.A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        if (A <= 9 && B <= 9) {
            System.out.println(A*B);
        } else {
            System.out.println("-1");
        }
    }
}
