package F12_Methodcreation_methodoverloading_varargs_passbyvalue;

public class varArgs {
    public static void main(String[] args) {

        int result = toplamaYap(5, 6, 9, 7,9,3,3,2,1,6);
        System.out.println(result);


    }

    public static int toplamaYap(int... a) {

        int sum = 0;
        for (int w : a) {
            sum = sum + w;
        }
        return sum;
    }

    //1) Bir method parantezinde birden fazla varargs kullanilmaz
    //2) Bir method parantezinde birden fazla parametre kullanilacaksa Varargs en sonda olmalidir


    //Java farkli sayidaki parametrelerin hepsini kabul eden bir yapi olusturdu.
    //Bu yapiya Varargs diyoruz
    //Varargs arka planda Array yapisini kullanir


    // public static int topla(int a, int b) {
    //     return a + b;
    // }
    //
    // public static int topla(int a, int b, int c, int d) {
    //     return a + b + c + d;


}