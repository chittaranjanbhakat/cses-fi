package GoogleKickStart;

import java.util.*;
class ShuffledAnagrams{
    static void anagram(String str, int strt, int ed,List<String> arr) 
    { 
        if (strt == ed) 
            arr.add(str); 
        else { 
            for (int i = strt; i <= ed; i++) { 
                str = swap(str, strt, i); 
                anagram(str, strt + 1, ed, arr); 
                str = swap(str, strt, i); 
            } 
        }
    }
    static String swap(String a, int i, int j) 
    { 
        char temp; 
        char[] chArr = a.toCharArray(); 
        temp = chArr[i]; 
        chArr[i] = chArr[j]; 
        chArr[j] = temp; 
        return String.valueOf(chArr); 
    } 
    static String isUniqueAnagram(List<String> ar,String s){
        int n=ar.size();
        int l=s.length()-1;
        for(int i=l-1;i>=1;i--)
            l=l*i;
        for(int i=l;i<n;i++){
            String s1=ar.get(i);
            int n1=s1.length(),f=0;
            for(int j=0;j<n1;j++){
                if(s1.charAt(j)==s.charAt(j)){
                    f=1;
                    break;
                }
            }
            if(f==0)
                return ar.get(i);
        }
        return "IMPOSSIBLE";
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
       
        for(int i=1;i<=tc;i++){
            String s=sc.next();
            List<String> arr=new ArrayList<>();
            anagram(s,0,s.length()-1,arr);
            String sol1=isUniqueAnagram(arr,s);
            System.out.println("Case #"+i+": "+sol1);

        }
    }
}