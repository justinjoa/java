package test;

public class Solution03 {

	public String solution(String phone_number) {
	      String answer = "";
	      char[] charList = phone_number.toCharArray();
	      for(int i =0; i<phone_number.length()-4; i++){
	          charList[i]='*';
	      }
	      answer = new String(charList);
	      return answer;
	  }

}
