import java.util.Scanner;

import java.util.*;
public class strbuffer {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        StringBuffer st=new StringBuffer(str);
        System.out.println(st.reverse());
    }
}
