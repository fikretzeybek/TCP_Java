package F03_ScannerIncrementDecrementifstatements;

import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {

        //Kullanicidan iki sayi alip 4 islem yapan ve islemlerin sonuclarini ekrana yazdiran kodu yaziniz

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen iki sayı giriniz:");
        double firstNumber = input.nextDouble();
        double secondNumber = input.nextDouble();

        System.out.println("toplam="+ (firstNumber+secondNumber));
        System.out.println("çıkarma="+ (firstNumber-secondNumber));
        System.out.println("çarpım="+ (firstNumber*secondNumber));
        System.out.println("bölme="+ (firstNumber/secondNumber));





    }

}
