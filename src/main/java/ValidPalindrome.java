import java.util.Scanner;

//A phrase is a palindrome if, after converting all uppercase letters into lowercase
// letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
public class ValidPalindrome {
    public static void main(String[] args) {
        ValidPalindrome vp=new ValidPalindrome();
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        System.out.println(vp.isPalindrome(str));
    }
    public boolean isPalindrome(String s)
    {
        String temp=s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        String temp1=temp;
        String rev="";
        for(int i=temp.length()-1;i>=0;i--)
        {
            rev+=temp.charAt(i);
        }
        if(rev.equals(temp1))
            return true;
        else
            return false;
    }
}
