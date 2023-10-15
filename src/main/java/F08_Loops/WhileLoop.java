package F08_Loops;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        //Example 2: Kullanicidan alinan pozitif bir tamsayının palindrom olup olmadığını kontrol eden kodu yazın
        //           Palindrome: 121 <==> 121        123321 <==> 123321


        Scanner scanner = new Scanner(System.in);

        System.out.println("sayi gir");
        int k = scanner.nextInt();


        String m = String.valueOf(k);

        String terseCevir = "";

        int n = m.length() - 1;

        while (n >= 0) {
            terseCevir = terseCevir + m.charAt(n);
            n--;
        }
        System.out.println(terseCevir);

        if (m.equals(terseCevir)) {
            System.out.println("Palindrome");

        } else {
            System.out.println("Palindrame degil");
        }


    }
}
