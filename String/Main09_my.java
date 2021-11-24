package String;

import java.util.Scanner;

/**
 * 
 * @author swift
 *	입력받은 문자열 숫자만 추출하기
 *
 * 1. 정규식으로 문자열 전부 제거 
 * 2. 숫자형태로 변경 후 리턴 
 */
public class Main09_my {
	
	public static int solution(String str) {
		int answer;
		
		String s = str.replaceAll("[a-zA-Zㄱ-ㅎ가-힣]","");
		answer = Integer.parseInt(s);
		
		return answer;
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str =sc.next();
		System.out.println(solution(str));
	}
}
