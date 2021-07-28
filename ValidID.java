import java.util.Scanner;
import java.io.*;

class Main{
    public static boolean validID(String str){
        return str.matches("[0-9]{12}");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        
        System.out.println(validID(s));
        
    }
}