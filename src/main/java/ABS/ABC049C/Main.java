package ABC049C;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
    
        String result = S.replaceAll("eraser", "").replaceAll("erase", "").replaceAll("dreamer", "").replaceAll("dream","");
        if (result.isEmpty()) {
            System.out.printf("YES");
        } else {
            System.out.printf("NO");
        }
    }
}
