package ABS.ABC083B;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
    
        List<Integer> ary = new ArrayList<>();
        /*
            n以下の整数をaryに代入
            例) n=10 の場合 ary [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
         */
        for (int i=1; i <= n; i++) {
            ary.add(i);
        }
        
        /*
            各10進数を取り出し、
            桁ごとに区切り、
            各桁の合計がA以上B以下であるか判定し、
            trueであればそれらの数を合計する
         */
        List<Integer> result = new ArrayList<>();
        for (int i : ary) {
            List<Integer> splitedI = new ArrayList<>();
            // while内のみで取得した数値を使いたいため、iiに代入
            int ii = i;
            while (ii > 0) {
                splitedI.add(ii % 10);
                ii /= 10;
            }

            int sum = 0;
            // 各桁の合計値をsumに代入
            for (int iii=0; iii<splitedI.size(); iii++) {
                sum += splitedI.get(iii);
            }
            if (A<=sum && sum<=B) {
                result.add(i);
            }
            
        }
    
        int sumResult = result.stream()
            .mapToInt(x -> x)
            .sum();
        System.out.println(sumResult);
    }
}
