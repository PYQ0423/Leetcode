/**
 * @program: Leetcode1
 * @author: Programming Queen
 * @create: 2019-06-24 08:56
 **/

public class reference {
    String str = new String("good");
    char[] ch = {'a','b','c'};
    int i = 10;

    public void change(String str, char[] ch, int i){
        str = "test ok";
        ch[0] = 'g';
//        i++;
        this.i = i+1;
    }

    public void change(StringBuffer x, StringBuffer y){
        x.append(y);
        y = x;
    }

    private String nn = new String("1");
    private String[] mm = {"2","5"};

    void test(String nn, String[] mm){
        nn = new String("3");
        this.nn = "9";

        mm[0] = "4";
        System.out.println("in test, mm[0] = " + mm[0]);
        mm = new String[]{"8","7"};
        System.out.println("in test, nn = " + nn);
        System.out.println("this.nn = " + this.nn);
        System.out.println("mm[0] = " + mm[0]);
    }

    public static void main(String[] args){
/*        reference ref = new reference();
        ref.change(ref.str,ref.ch,ref.i);
        System.out.println("i = "+ref.i);
        System.out.println("str = "+ref.str);
        System.out.println("ch = " + ref.ch);*/

        /*StringBuffer buffA = new StringBuffer("a");
        StringBuffer buffB = new StringBuffer("b");
        new reference().change(buffA,buffB);
        System.out.println(buffA+","+buffB);*/

        reference ref = new reference();
        ref.test(ref.nn,ref.mm);
        System.out.println(ref.nn+" "+ref.mm[0]);
    }
}

