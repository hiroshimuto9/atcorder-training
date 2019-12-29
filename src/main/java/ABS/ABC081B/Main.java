package ABS.ABC081B;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean bl = true;
        int count = 0;
        
        int[] a;
        a = new int[n];
        
        for (int i = 0; i < n; i++) {
            int ai = sc.nextInt();
            a[i] = ai;
        }
        
        
        
        while (true) {
            for (int i = 0; i < n; i++) {
                if (a[i] % 2 != 0) {
                    bl = false;
                } else {
                    a[i]  /= 2;
                }
            }
            if (!bl) {
                break;
            }
            count ++;
        }
    
        System.out.println(count);
    }
}
