package F08_Loops;

public class DoWhileLoop01 {
    public static void main(String[] args) {
        // do while loop
        /*baslangic degeri
                do{
                    calisacak kodlar
                            artirma/azaltma
                }while ( loop calisma alani)*/

        int i = 5;

        do {

            System.out.println(i);
            i--;

        } while (i > 2);


        // 1) while loop--body hiç çalışmadı dolayısıyla 0 çalışma mümkündür

        int a = 1;

        while (a < 1) {
            System.out.println("Sen bir While Loopsun...");
            a++;
        }


        // 2) do while loop   da body çalıştı,
        // en az bir kez çalışır,
        // dolayısıyla 0 çalışma mümkün değildir
        int b = 1;

        do {
            System.out.println("Sen bir do while loopsun...");
            b++;

        } while (b < 1);


    }


}
