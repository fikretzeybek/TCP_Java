package F06_StringManipulations;

public class StringManipulation03 {
    public static void main(String[] args) {

        //Example: Bir String'deki tekrarsiz character'leri ekrana yan yana yazdiriniz.
        //           mehmet ==> ht

        String s = "mehmet";

        if (s.indexOf("m")== s.lastIndexOf("m")) {
            System.out.print("m");
        }

        if (s.indexOf("e")== s.lastIndexOf("e")) {
            System.out.print("e");
        }

        if (s.indexOf("h")== s.lastIndexOf("h")) {
            System.out.print("h");
        }


        if (s.indexOf("t")== s.lastIndexOf("t")) {
            System.out.print("t");


        }
        System.out.println();
        //Example 2: Bir banka kartının son 4 hanesi hariç tüm hanelerini '*' kullanarak görünmez yapın
        //           1234 6789 1234 6789 ==> **** **** **** 6789

        String cardNumber = "1234 6789 1234 6789" ;
        String first = cardNumber.substring(0,15).replaceAll("[0-9]","*");
        System.out.print(first);

        String last = cardNumber.substring(15) ;
        System.out.println(last);

        String result1= first+ last;
        System.out.println("result1 = " + result1);//result1 = **** **** **** 6789

        String result2= first.concat(last);
        System.out.println("result2 = " + result2);//result2 = **** **** **** 6789







        }










    }






