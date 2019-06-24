package question;

/*
2019/3/11
统计字符串中的单词个数，这里的单词指的是连续的不是空格的字符。
请注意，你可以假定字符串里不包括任何不可打印的字符。
 */

public class q434 {
    public int countSegments(String s) {
       int count=0;
       for(int i=0; i<s.length();i++){
           if(s.charAt(i)!=' '&& (i==0 || s.charAt(i-1)==' '))
               count++;
       }
       return count;
    }
}




