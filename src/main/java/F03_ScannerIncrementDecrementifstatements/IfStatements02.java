package F03_ScannerIncrementDecrementifstatements;

import java.util.Scanner;

public class IfStatements02 {

    public static void main(String[] args) {

        //Example 2: Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz

        Scanner imput = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz..");
        int num = imput.nextInt();

        // 1.yol

        if (num % 2 == 0) {
            System.out.println("Çift Sayıdır..");

        }
        if (num % 2 != 0){
            System.out.println("Tek Sayıdır...");
        }


        // 2.yol

        if(num % 2 == 0){
            System.out.println("Çift Sayıdır..");


        }else{
            System.out.println("Tek Sayıdır..");



        }















    }



}
