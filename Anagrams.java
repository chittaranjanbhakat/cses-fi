package GoogleKickStart;
import java.util.*;
public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
       
        for(int i=1;i<=tc;i++){
            String s=sc.next();
            List<String> arr=new ArrayList<>();
            anagram(s,0,s.length()-1,arr);
            System.out.println("Case #"+i+": "+sol1);

        }
	}

}
