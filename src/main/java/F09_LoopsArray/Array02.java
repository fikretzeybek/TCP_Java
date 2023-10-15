package F09_LoopsArray;

import java.util.Arrays;

public class Array02 {

    public static void main(String[] args) {

        //Example 2: Integer array olusturunuz, icine 6 tane eleman yerlestiriniz,
        //           bu elemanlarin en kucugu ile en buyugunun toplamini ekrana yazdiriniz

        int ages [] = new int[6];
        ages [0] = 20;
        ages [1] = 23;
        ages [2] = 19;
        ages [3] = 44;
        ages [4] = 15;
        ages [5] = 32;

        System.out.println(Arrays.toString(ages));

        Arrays.sort(ages);
        System.out.println(Arrays.toString(ages));

        // note: sort() methodu sayısal data type larını küçükten büyüğe sıralar, (ascendig order)
        //       sort () methodu String data type larını alfabetik sıralar (alphabetical order)
        //       (ascendig order) + (alphabetical order)   ====> naturel order
        //

        System.out.println(ages[0] + ages[ages.length -1]);

        //2.yol
        int minimum = ages[0];
        int maximum = ages[0];

        for ( int w : ages){

            minimum = Math.min(minimum,w);
            maximum = Math.max(maximum,w) ;

        }
        System.out.println(minimum);
        System.out.println(maximum);
        System.out.println(maximum+minimum);






    }

}
