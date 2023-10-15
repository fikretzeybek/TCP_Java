package F03_ScannerIncrementDecrementifstatements;

public class IncrementDecrement {
// artırma azaltma
    public static void main(String[] args) {

        // increment

        int a = 5;
        System.out.println(a);
        a = a+2;// a+ = 2 ; ile aynı şey demek, ikisi de kullanılabilir
        System.out.println(a);
        a += 2;
        System.out.println(a);

        //decrement

        int c = 8;
        System.out.println(c);

        c = c-3 ;
        System.out.println(c);

        c-= 3;
        System.out.println(c);

        // Increment 2

        int d = 6;
        System.out.println(d);

        d=d*2;// d*= 2; de olur
       System.out.println(d);

        // decrement 2

        int e = 24;
        System.out.println(e);

        e= e/2;
        System.out.println(e);

        e /= 2;
        System.out.println(e);

        // 1 ile increment
        int f = 13;
        f++;

        //1 ile decrement
        int h = 9;
        //h = h - 1;
        // h -= 1;
        h--;

        //post increment , pre increment

        int i = 10;
        int k = i++;
        System.out.println(i);
        System.out.println(k);


        int m = 15;
        int n = ++m;
        System.out.println(m);
        System.out.println(n);

        int p = 17;
        int r = p--;
        System.out.println(p);
        System.out.println(r);

        //Ornek

        int s = 20;
        int t = --s;

        System.out.println(s);
        System.out.println(t);



















    }



}
