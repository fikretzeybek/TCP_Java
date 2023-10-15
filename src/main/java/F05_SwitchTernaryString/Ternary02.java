package F05_SwitchTernaryString;

import java.util.Scanner;

public class Ternary02 {
    public static void main(String[] args) {

        //Example : girilen sayinin 3 basamakli olup olmadigini kontrol eden kodu yaziniz

        Scanner scanner = new Scanner(System.in);

        System.out.println("sayi giriniz");
        int a = scanner.nextInt();

        a = Math.abs(a);

        String result = a > 99 && a < 1000 ? "uc basamaklıdır" : "uc basamaklı değildir";
        System.out.println(result);

        //interview question
        /*    Example 1: Girilen yilin "Artik Yil"(Leap Year) olup olmadigini kontrol eden kodu yaziniz.
                       1)Yil 100'e bolunurse 400'e de bolunmelidir. 1600==>Leap    1800==>Leap degil
                       2)Yil 100'e bolunmuyorsa 4'e bolunmelidir. 2004==>Leap    2005==>Leap degil
         */
        System.out.println("Yil giriniz");
        int year = scanner.nextInt();

        String result2 = year % 100 == 0 ? year % 400 == 0 ? "Leap Year" : "Not Leap Year" : year % 4 == 0 ? "Leap Year" : "Not Leap Year";
        System.out.println(result2);

        System.out.println("2.Yol");

        if (year % 100 == 0 && year % 400 == 0) {
            System.out.println("Leap Year");

        } else if (year % 100 != 0 && year % 4 == 0 ) {
            System.out.println("Leap Year");

        }else {
            System.out.println("Not Leap Year");
        }
    }
}