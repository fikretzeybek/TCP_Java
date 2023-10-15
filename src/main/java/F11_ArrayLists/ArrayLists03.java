package F11_ArrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLists03 {
    public static void main(String[] args) {
        //Example : Bir tane Integer List olusturunuz
        //           Bu List'te birbirine en yakin iki tamsayiyi yaziniz
        //           [12, 23, 10, 19] ==> 12 and 10

        List<Integer> num = new ArrayList<>();
        num.add(12);
        num.add(23);
        num.add(10);
        num.add(19);

        Collections.sort(num);

        int minDiff = num.get(1)-num.get(0);

        //en küçük farkın kaç olduğunu bulan kodu yazalım

        for (int i = 1; i < num.size(); i++) {

            minDiff = Math.min(minDiff, num.get(i) - num.get(i - 1));

        }
        System.out.println(minDiff);

        //en küçük farkı hangi iki sayıdan elde ettiğimizi bulalım

        for (int i = 1;  i < num.size();     i++) {

            if(num.get(i) - num.get(i - 1) == minDiff){
                System.out.println(num.get(i) + " ve  "+ num.get(i - 1));
            }
        }

    }
}
