import java.util.Scanner;
import java.io.*;

class Prog2{
    public static void check(String s){
    if(s.substring(0,5).equals("https")){
        System.out.println("secure");
    }
    else{
        System.out.println("Not secure");
    }
   }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        check(s);
    }
}