//Every line of input will contain a String followed by an integer.
//Each String will have a maximum of 10 alphabetic characters, and each integer will be in the inclusive range from 0 to 999 .




import java.io.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
          System.out.println("================================");
         for(int i=0;i<3;i++){
           String lef=sc.next();
            int rig=sc.nextInt();
            // rig.length();
            int le= lef.length();
            int exSpace=16-le;
            String spce="";
            for(int j=0;j<exSpace-1;j++){
                spce+=" ";
            }
            System.out.printf("%s%s%03d",lef,spce,rig);
             System.out.println();
        }
       System.out.println("================================");
       
    }
}
