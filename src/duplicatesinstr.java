import java.lang.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class duplicatesinstr {
    public static void main(String[] args) {
        String str;
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        int flag=0;
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++)
            {
                if(str.charAt(i)==str.charAt(j))
                    flag=1;

            }
            if(flag==1)
                System.out.println(str.charAt(i));
        }
    }
}
