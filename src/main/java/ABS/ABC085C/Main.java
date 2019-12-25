package ABC085C;

import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Y = sc.nextInt();
        int x = -1, y = -1, z = -1;
        
        loop:
        for(int i=0; i<=N; i++){
            for(int j=0; j<=N-i; j++){
                int l = N - i - j;
                int price = (10000 * i) + (5000 * j) + (1000 * l);
                if(price==Y){
                    x = i;
                    y = j;
                    z = l;
                    break loop;
                }
            }
        }
        System.out.println(x + " " + y + " " + z);
    }
}
