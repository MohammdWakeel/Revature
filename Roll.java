import java.util.Scanner;
import java.io.*;

class Roll{
    public static boolean rollNo(String str){
        return str.matches("[0-9]{2}[A-Z]{4}[0-9]{3}[A-Z]{2}");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        
        System.out.println("Enrollment No: "+rollNo(s));
        
    }
}