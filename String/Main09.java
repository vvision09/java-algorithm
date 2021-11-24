package String;

import java.util.Scanner;

/**
 * 
 * @author swift
 *	
 *입력받은 문자열 숫자만 추출하기
 *
 * 1.  캐릭터 배열로 문자열 바꾸기 
 * 2. 0 ~ 9 까지의 아스키 코드가 48 ~ 57인점을 이용해서 숫자 거르기 
 */
public class Main09 {
	
	public static int solution(String str) {
		String answer = "";
		
		for(char x : str.toCharArray()) {
			if(Character.isDigit(x)) answer += x;
		}
		
		return Integer.parseInt(answer);
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str =sc.next();
		System.out.println(solution(str));
	}
}
