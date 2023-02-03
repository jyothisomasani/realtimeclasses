import java.lang.*;
import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        String str1="";

        for(int i=str.length()-1;i>=0;i--)
        {
            System.out.print(str.charAt(i));
            str1=str1+str.charAt(i);
        }
        if(str.equals(str1))
            System.out.println("palindrome");
        else{
            System.out.println("\n");
            System.out.println("not palindrome");
        }

    }
}
