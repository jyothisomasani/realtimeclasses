import java.util.Scanner;
import java.lang.*;
public class stroccurence {
    public static void main(String[] args) {
        String str;
        int count =0;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        char[] arr=str.toCharArray();
        char ch=sc.next().charAt(0);
        for(int i=0;i<str.length();i++)
        {
            if(ch==str.charAt(i))
                count++;
        }
        System.out.println(ch+": "+count);
    }}
