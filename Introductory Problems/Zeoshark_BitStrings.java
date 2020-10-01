import java.util.*;
public class Zeoshark_BitStrings {
    public static void main(String args[] ) {
        Scanner in= new Scanner(System.in);
        int n= in.nextInt();
        long n_bits = 2;
        for(int i=2;i<=n;i++)
        {
            n_bits*=2;
            n_bits%=1000000007;
        }
        n_bits%=1000000007;
        System.out.println(n_bits);
    }
}
