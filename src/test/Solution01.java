package test;

public class Solution01 {

	 public String solution(String s) {
         String answer = "";
         
         //¦���� Ȧ���� ���� ����� �����Ѵ�. ¦���� 2���ڰ� ������ Ȧ���� 1���ڰ� ���� ���̴�.
         if(s.length()%2==0) {
             answer = s.substring(s.length()/2-1, s.length()/2+1);
         } else {
             answer = s.substring(s.length()/2,s.length()/2+1);
         }
         
         return answer;
     }
}

	