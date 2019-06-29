package string;

/**
 * @program: Leetcode
 * @author: Programming Queen
 * @create: 2019-06-27 14:56
 **/

public class reverseString {
    public void reverseString(char[] s) {
        int n = s.length;
        int i = 0;
        int j = n-1;
        while(i<j){
            char t = s[i];
            s[i] = s[j];
            s[j] = t;
            i++;
            j--;
        }
    }

    public static void main(String[] args){
        reverseString rs = new reverseString();
        char[] ch = {'a','d','f','g','y'};
        rs.reverseString(ch);
        System.out.println(ch);
    }

 /*   private void swap(char[] s,int i, int j){
        char t = s[i];
        s[i] = s[j];
        s[j] = t;
    }*/
}

