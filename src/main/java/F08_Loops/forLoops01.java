package F08_Loops;

import java.util.Scanner;

public class forLoops01 {

    public static void main(String[] args) {
        /*
        Example 1: Asagidaki ciktiyi verecek kodu yaziniz
                    Week: 1
                      Day: 1
                      Day: 2
                      Day: 3
                      .....
                    Week: 2
                      Day: 1
                      Day: 2
                      Day: 3
                      ....
    */

        for (int i = 1; i <5 ; i++) {
            System.out.println("Week :" + i);
            for (int k = 1; k < 8; k++) {
                System.out.println("Day :"+k);
            }


            //System.out.println("Day 1:");
            //System.out.println("Day 2:");
            //System.out.println("Day 3:");
            //System.out.println("Day 4:");   bunun kısa kodlaması yukarıdaki
            //System.out.println("Day 5:");
            //System.out.println("Day 6:");
            //System.out.println("Day 7:");

               /*
          Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz
                X X X X X
                X X X X X
                X X X X X
    */
            Scanner input = new Scanner(System.in) ;
            System.out.println("Satir (row) sayisini giriniz...");
            int row = input.nextInt() ;

            System.out.println("Sutun (colum) sayisini giriniz....");
            int colum = input.nextInt();




            for (int k = 1; k < 4 ; k++) {

                for (int j = 1; j <= 5 ; j++) {
                    System.out.print("X ");
                    System.out.println();
                }

                System.out.println();

            }



        }





    }




}
