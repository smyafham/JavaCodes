package Strings;

import java.util.Scanner;

 

 

 

public class Stringprg4 {
static String getimage(String str) {
    
    StringBuffer sbuff=new StringBuffer(str);
                                                                //StringBuffer srev=sbuff;
                                                                // StringBuffer srev=sbuff.reverse();

    sbuff.append("|");         //.append(sbuff.reverse());
                               // System.out.println(sbuff);
    StringBuffer sbuff2=new StringBuffer(str);
    sbuff2.reverse();
    
   // System.out.println(sbuff2);
    
    String st=sbuff.toString().concat(sbuff2.toString());
    return st;
    
    
}
    public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.println("Enter String");
String str =s.nextLine();
String st=getimage(str);
System.out.println(st);
    }

 

 

 

}