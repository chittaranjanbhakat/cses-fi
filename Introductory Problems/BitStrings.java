//Bit Strings
//https://cses.fi/problemset/task/1617

//author: souravbera
import java.util.*;
public class BitStrings {
    public static void main(String args[] ) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long n_bits = 2;
        for(int i=2;i<=n;i++)
        {
            n_bits*=2;
            n_bits%=1000000007;
        }
        n_bits %= 1000000007;
        System.out.println(n_bits);
    }
}
