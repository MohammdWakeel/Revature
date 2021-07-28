import java.util.Scanner;
import java.io.*;

class Enroll{
    public static boolean EnrollmentNo(String str){
        return str.matches("[A-Z]{1}[0-9]{6}");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        
        System.out.println("Enrollment No: "+EnrollmentNo(s));
        
    }
}