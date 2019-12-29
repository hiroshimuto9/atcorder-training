package ABS.ABC085B;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> dList = new ArrayList<>();
        for (int i=0; i < n; i++) {
            int d = sc.nextInt();
            dList.add(d);
        }
        sc.close();
    
        /*
            重複を取り除いた数値のSetを作成
         */
        Set<Integer> checkHash = new HashSet<>();
        for (Integer d : dList) {
            if (!checkHash.contains(d)) {
                checkHash.add(d);
            }
        }
        
        System.out.println(checkHash.size());
    }
}
