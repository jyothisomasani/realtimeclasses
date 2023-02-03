import java.util.Scanner;

import java.lang.*;
public class duplicates {
    public static void main(String[] args) {
        String str;
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        char[] arr = str.toCharArray();
        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<str.length();j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println(arr[j]);
                }
            }
        }

    }
}
