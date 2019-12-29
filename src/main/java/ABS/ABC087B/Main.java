package ABS.ABC087B;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = sc.nextInt();
        
        int count = 0;
        for(int An=0; An<=a; An++){
            for(int Bn=0; Bn<=b; Bn++){
                for(int Cn=0; Cn<=c; Cn++){
                    if((An*500+Bn*100+Cn*50)==x){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}