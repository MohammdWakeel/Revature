import java.util.Scanner;
import java.io.*;

class Main{
    public static boolean AccountNo(String str){
        return str.matches("[0-9]{16}");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        
        System.out.println("IDBI Account No: "+AccountNo(s));
        
    }
}