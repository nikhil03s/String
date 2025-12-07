import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.next();
        String temp=str;
        String rev="";
        for(int i=temp.length()-1;i>=0;i--)
        {
            rev+=temp.charAt(i);
        }
        if(rev.equals(str))
            System.out.println("Palindrome");
        else
            System.out.println("not a palindrome");
    }
}
