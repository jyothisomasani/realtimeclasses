import java.lang.*;
import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        for(int i=str.length()-1;i>=0;i--)
        {
            System.out.print(str.charAt(i));
        }

    }
}
