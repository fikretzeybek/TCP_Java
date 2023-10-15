package F09_LoopsArray;

import java.util.Arrays;

public class array01 {
    public static void main(String[] args) {
        int a = 13;
        a = 7;
        a = 5;

        //Arrays nası oluşturulur
        String stdNames [] = new String[5];

        // Arraylar nasıl yazdırılır
        System.out.println(Arrays.toString(stdNames));

        //toString() metodunu kullanmadan sadece array ismi ile yazdırırsanız
        // java o Arrayin adresini yazdırır

        //Array e eleman ekleme nasıl yapılır?
        stdNames [2] = "Alperen";
        stdNames [4] =  "Ali";
        stdNames [3] = "Veli";
        stdNames [1] =  "Salih";
        stdNames [0] = "Ahmet";

        System.out.println(Arrays.toString(stdNames));

        // Array den specific bir elemanı almak?
        System.out.println(stdNames[2]);
        System.out.println(stdNames[0]);

        //Example 1: String array olusturun, icine 5 tane eleman ekleyin, tum elemanlarin
        //           icerdigi karakter sayilari toplamini ekrana yazdirin.


        //note: Stringlerde kullandığımız lenght() methoddur
        // arraylerde kullandığımız lenght variable dir

        String cities [] = new String[5];
        cities [0] = "Miami" ;
        cities [1] = "Sivas";
        cities [2] = "Yozgat";
        cities [3] = "Ankara" ;
        cities [4] = "Bursa";


        //1. yol for loop

        int totalChar = 0;
        for (int i = 0; i <cities.length ; i++) {
            totalChar = totalChar + cities[i].length();

        }
        System.out.println(totalChar);

        //2.yol for-each loop (enhanced-zenginleştirilmiş- loop)

        int sum = 0;

        for(String w:cities){
            sum = sum +w.length();

        }
        System.out.println(sum);








    }
}
