import java.util.Scanner;
import java.io.*;

class Main{
    public static String validID(String str){
        int s1=str.indexOf("/");
        int s2=str.indexOf("/",8);
        
        return str.substring(s1+2,s2);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        
        System.out.println(validID(s));
        
    }
}