import java.util.Scanner;

public class MaxOccuringChar {
    public static void main(String[] args) {
        MaxOccuringChar max=new MaxOccuringChar();
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(max.getMaxChar(str));

    }
    public char getMaxChar(String s)
    {
        int[] freq=new int[26];

        for(char ch:s.toCharArray())
        {
            freq[ch-'a']++;
        }
        int maxFerq=-1;
        char result='a';

        for(int i=0;i<26;i++)
        {
            if(freq[i]>maxFerq){
                maxFerq=freq[i];
                result=(char) (i+'a');
            }
        }

        return result;
    }
}
