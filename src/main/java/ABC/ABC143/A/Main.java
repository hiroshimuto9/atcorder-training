package ABC.ABC143.A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        if (A <= B*2) {
            System.out.println(0);
        } else {
            System.out.println(A-B*2);
        }
    }
}
