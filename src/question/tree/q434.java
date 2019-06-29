package question.tree;

/*
2019/3/11
ͳ���ַ����еĵ��ʸ���������ĵ���ָ���������Ĳ��ǿո���ַ���
��ע�⣬����Լٶ��ַ����ﲻ�����κβ��ɴ�ӡ���ַ���
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




