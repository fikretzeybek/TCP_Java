package F03_ScannerIncrementDecrementifstatements;

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {

      /*
       Ornek:  Kullanıcıdan i)Adini ve Soyadini ii)Yaşını iii)Boyunu iv)kilosunu v) medeni durumunu girmesini isteyin
               Ardından bunları bir etiketle konsolda farklı satırlarda yazdırın
        */

        Scanner input = new Scanner(System.in);

        System.out.println("Adinizi Soyadinizi Giriniz");
        String fullName = input.nextLine();

        System.out.println("Yasinizi giriniz");
        byte age = input.nextByte();

        System.out.println("Boyunuzu Giriniz");
        float height = input.nextFloat();

        System.out.println("Kilonuzu Giriniz");
        float weight = input.nextShort();

        System.out.println("Medeni Durumunuzu Giriniz");
        String meritalStatus = input.next();

        System.out.println("fullName = " + fullName);
        System.out.println("age = " + age);
        System.out.println("height = " + height);
        System.out.println("weight = " + weight);
        System.out.println("meritalStatus = " + meritalStatus);


    }





}
