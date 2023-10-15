package F03_ScannerIncrementDecrementifstatements;

import java.util.Scanner;

public class Scanner03 {

    public static void main(String[] args) {

//Kullanicidan bir dikdortgenin iki kenar uzunlugunu aliniz
//i)Alanini hesaplayiniz ==> Kisa kenar * Uzun kenar
//ii)Cevresini hesaplayiniz ==> 2*Kisa Kenar + 2*Uzun Kenar

        Scanner input = new Scanner(System.in);

        System.out.println("Dikdörtgenin kısa kenar uzunluğunu giriniz...");
        float shortSide = input.nextFloat();
        System.out.println("Dikdörtgenin uzun kenar uzunluğunu giriniz...");
        float longtSide = input.nextFloat();

        System.out.println("Alan = "+(shortSide*longtSide));
        System.out.println("Çevre = "+(shortSide*2+2*longtSide));






    }


}
