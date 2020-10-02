import java.util.*;
public class TrailingZeroes {
   public static void main(String[] args) {
       
    Scanner in= new Scanner(System.in);
    int n=in.nextInt();
    //Initialising count
    //trailing Zeroes
    int count=0;

    // Keep dividing n by powers of 5
    for(int i=5;n/i>=1;i*=5)
    {
        count += n / i;
    }
    System.out.println(count);

   }
}
