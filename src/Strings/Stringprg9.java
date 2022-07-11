package Strings;

public class Stringprg9 {

	 

    public static void main(String[] args) {
//Upadhyay G
  /*String str="gopal Upadhyay";
  String[] s=str.split(" ");
  System.out.println(s[0] + " "+s[1]);
        StringBuffer sb=new StringBuffer();
        sb.append(s[1]).append(" ").append(s[0].substring(0, 1).toUpperCase());
        System.out.println(sb);*/
        String str="Hi everyone. How are you.";
        System.out.println(str.length());
    String[] s=    str.split(" ");
        System.out.println(s.length);
        int count=0;
        for(int i=0; i<str.length(); i++)
        {
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
            {
                count++;
            }
        }
        System.out.println(count);
        
    }

 

}