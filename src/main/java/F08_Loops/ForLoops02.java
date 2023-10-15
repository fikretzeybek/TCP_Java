package F08_Loops;

public class ForLoops02 {
    public static void main(String[] args) {
        //Example : verilen sayıda ondalık kısımdaki rakamların toplamını bulun
        //            28.587 ==> 5+8+7=20
        double num = 28.587 ;

        // ondalıklı kısmı alabilmek için stringe çevirmeliyiz
        String sNum = String.valueOf(num);

        //stringe çevirdiğimiz sayıyı split metodu ile bölerek ondalıklı kısmı alırız
        String decimalPart = sNum.split("[.]")[1];

        //string tipinde olan decimalPart üzerinde matematikse işlem yapabilmek için int e çevirmeliyiz

        int intDecimalPart = Integer.valueOf(decimalPart);

        int sum = 0;
        for (int i = intDecimalPart; i > 0 ; i= i/10) {

           sum = sum + i%10 ;


        }

        System.out.println(sum);


    }
}
