package F06_StringManipulations;

import java.util.Scanner;

public class exStringManipulation01 {
    public static void main(String[] args) {
        //Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz.
        //i)En az 8 character olsun
        //ii)Space characteri password'de olmasin
        //iii)En az bir tane buyuk harf olsun
        //iv)En az bir tane kucuk harf olsun
        //v)En az bir tane rakam olsun

        Scanner scan = new Scanner(System.in);
        System.out.println("Password giriniz");
        String pwd = scan.nextLine();


        //i)En az 8 character olsun
        boolean lenghtControl = pwd.length() > 7;
        System.out.println("lenghtControl:" + lenghtControl);

        //ii)Space characteri password'de olmasin
        boolean spaceControl = !pwd.contains(" ");
        System.out.println("spaceControl:" + spaceControl);

        //iii)En az bir tane buyuk harf olsun
        boolean upperCaseControl = !pwd.replaceAll("[^A-Z]", "").isEmpty();
        System.out.println("upperCaseControl:" + upperCaseControl);

        //iv)En az bir tane kucuk harf olsun
        boolean lowerCaseControl = !pwd.replaceAll("[^a-z]", "").isEmpty();
        System.out.println("lowerCaseControl:" + lowerCaseControl);

        //v)En az bir tane rakam olsun
        boolean digitControl = !pwd.replaceAll("[^0-9]", "").isEmpty();
        System.out.println("digitControl:" + digitControl);

        System.out.println("=================");

        boolean result = lenghtControl && spaceControl && upperCaseControl && lowerCaseControl && digitControl;


        if (result) {
            System.out.println("Pasword geçerli");
        } else {
            System.out.println("Pasword geçersiz");
        }


    }
}
