package ABS.ABC086C;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 時刻0の時に点(0,0)
        // 時刻tに点(x,y)にいるとした時、時刻t+1では
        // (x+1,y) (x-1,y) (x,y+1) (x,y-1)のいずれかにいることができる
    
        int N = sc.nextInt(); // 目的地の数
        for (int i=0; i < N; i++) {
            int t = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
        }
    
    }
}
