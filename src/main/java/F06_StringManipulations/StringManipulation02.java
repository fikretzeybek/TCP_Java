package F06_StringManipulations;

public class StringManipulation02 {
    public static void main(String[] args) {

        //Example 1: Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.
        //           String tv = "$456.99";   String laptop = "$875.99"; ==> 456.99 + 875.99 = 1332.98

        String tv = "$456.99" ;
        String laptop = "$875.99" ;

        String newTv = tv.replace("$","") ;
        String newLaptop = laptop.replace("$","");

        Double totalPrice = Double.valueOf(newTv) + Double.valueOf(newLaptop);
        System.out.println("totalPrice = " + totalPrice);

        //Example 2: Verilen ismin ilk isiminin ilk harfini ve soy isminin ilk harfini ekrana yazdiriniz.
        //           "Ali Can" ==> AC
        String name = "ali cAn";
        char first = name.trim().toUpperCase().charAt(0) ;
        char last = name.trim().toUpperCase().split(" ")[1] .charAt(0);


        System.out.println("" + first+last);


        //Ornek : Bir string'in belirli bir karakterinden baslayarak belirli bir karaktere kadar tum
//karakterleri dynamic olarak aliniz
//abc@gmail.com ===> gmail

        String mail = "abc@hotmail.com" ;
        int startingIndex = mail.indexOf("@")+1;
        int endingIndex = mail.indexOf(".");
        String companyName = mail.substring(startingIndex,endingIndex);
        System.out.println("companyName = " + companyName);




    }





}
