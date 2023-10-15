package F11_ArrayLists;


import java.util.Arrays;
import java.util.List;

public class ArrayLists04 {
    public static void main(String[] args) {

        // bir List oluşturmak için kısa yol
        List<Integer> list = Arrays.asList(4,5,13,313,353) ;
        System.out.println(list);

        /* Arrays.asList() methodono kullanarak bir lis oluşturursanız listin
        eleman sayısını değiştiren methodları kullanamazsınız
        remove(), add(), clear() gibi
        ama set() kullanabilirsiniz
         */

        list.set(1,63);
        System.out.println(list.size());
        System.out.println(list);


    }
}
