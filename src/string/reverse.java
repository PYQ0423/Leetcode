package string;

/**
 * @program: Leetcode
 * @author: Programming Queen
 * @create: 2019-06-27 15:12
 **/

public class reverse {
   /* public int reverse(int x) {
        int flag =0;
        if (x > (Math.pow(2,32))||Integer.reverse(x)> (Math.pow(2,32)))
            return 0;
        if(x<0){
            flag = 1;
            x = -x;
        }
        String s = Integer.toString(x);
        char[] ch = s.toCharArray();
        int n = ch.length;
        int i = 0;
        int j = n - 1;
        while (i < j) {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
        long result = Long.parseLong(String.valueOf(ch));
        if(flag==1)
            result = -result;
        return result ;
    }*/

  /*   public int reverse(int x){
         if(x<=Integer.MIN_VALUE || x>=Integer.MAX_VALUE)
             return 0;
         long temp = x<0?-x:x;
         String str = Long.toString(temp);
         StringBuffer sb = new StringBuffer(str);
         String result = sb.reverse().toString();
         if(Long.parseLong(result)>Integer.MAX_VALUE)
             result = "0";
         return x>0?Integer.parseInt(result):-Integer.parseInt(result);
    }*/

    public int reverse(int x){
        int rev = 0;
        while(x!=0){
            int pop = x%10;
            x/=10;
            if(rev>Integer.MAX_VALUE/10 || (rev==Integer.MAX_VALUE/10 && pop>7))
                return 0;
            if(rev<Integer.MIN_VALUE/10 || (rev==Integer.MIN_VALUE/10&&pop<-8))
                return 0;
            rev = rev*10+pop;
        }
        return rev;
    }

    public static void main(String[] args) {
        reverse rs = new reverse();
        int i = -2147483648;
        System.out.println(rs.reverse(i));
    }

}

