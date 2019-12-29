package ABS.ABC088B;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
    
        /*
            入力された数値をリストに代入
         */
        List<Integer> cardList = new ArrayList<>();
        for (int i=1; i<=N; i++) {
            int a = sc.nextInt();
            cardList.add(a);
        }
        
        /*
            降順にソート
         */
        cardList.sort(Comparator.reverseOrder());
        
        int aSum = 0;
        int bSum = 0;
        for (int i=0; i<cardList.size(); i++) {
            if (i%2 == 0) {
                aSum += cardList.get(i);
            } else {
                bSum += cardList.get(i);
            }
        }
    
        System.out.println(aSum - bSum);
        
        
    }
}
