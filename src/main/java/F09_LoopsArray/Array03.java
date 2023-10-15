package F09_LoopsArray;

import java.util.Arrays;

public class Array03 {
    public static void main(String[] args) {

        //Example : Bir integer array olusturun ve 5 ten kucuk olan elemanlari yazdirin
        //           [12, 3, -3, 5, 23] ==> 3, -3

        // Array ler kısa yoldan nasıl oluşturabiliriz?

        int[] numbers = {12, 3, -3, 5, 23};
        for ( int w :  numbers  ) {

            if(w<5) {
                System.out.print(w + " ");
            }
        }

        //Example Specific bir elemanin array'de olup olmadigini anlamak icin gereken kodu yaziniz
        String[] names = {"K","C","R","A","S"};

        // binarySearch() methodunu  sort() kullanmadan kullanmayınız
        //binarySearch() methodu varolan elemanlar için size o elemanın index ini verir
        //binarySearch() methodu olmayan elemanlar için size negatif tam sayı verir
        //"-" işaretinin anlamı eleman yok demektir

        Arrays.sort(names);
        int result = Arrays.binarySearch(names,"U");
        System.out.println(result);

        //ornek :Size verilen bir cumlede kac kelime oldugunu gosteren kodu yaziniz.

        String s = "Java is easy. Learn Java earn money.";

        System.out.println(s);
        String words[] =s.split("");


        System.out.println(Arrays.toString(words));
        System.out.println(words.length);













    }




}
