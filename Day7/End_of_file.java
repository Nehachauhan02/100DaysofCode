//The challenge here is to read n lines of input until you reach EOF, then number and print all n lines of content.





import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        String line;
        int i = 1;
        while(sc.hasNext())
        {
            line = sc.nextLine();
            System.out.println(i + " " + line);
            i++;
            
        }
    }
}
