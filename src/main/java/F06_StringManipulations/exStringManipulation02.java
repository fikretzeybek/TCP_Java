package F06_StringManipulations;

public class exStringManipulation02 {
    public static void main(String[] args) {

        //Example 1: Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.
        //           String tv = "$456.99";   String laptop = "$875.99"; ==> 456.99 + 875.99 = 1332.98

        String tv = "$456.99";
        String laptop = "$875.99";

        String newTv = tv.replace("$", "");
        String newLaptop = laptop.replace("$", "");

        double totalPrice = Double.parseDouble(newTv) + Double.parseDouble(newLaptop);
        System.out.println("totalPrice:" + totalPrice);

        //Example 2: Verilen ismin ilk isiminin ilk harfini ve soy isminin ilk harfini ekrana yazdiriniz.
        //           "Ali Can" ==> AC

        //1.yol
        String name = "ali Can";
        char first = name.toUpperCase().charAt(0);
        char second = name.toUpperCase().split(" ")[1].charAt(0);

        System.out.println("" + first + second);


        //2.yol
        String isim = "Ali Can";
        String[] names = isim.split(" ");

        for (String ilkHarf : names) {
        System.out.print(ilkHarf.charAt(0));
        }


    }

}
