package String;

import java.util.Scanner;

//중복문자제거
//ksekkset
public class Main06 {
	
	public static String solution(String str) {
		StringBuilder answer = new StringBuilder();

		for(int i = 0; i <str.length(); i++) { 
			//System.out.println(str.charAt(i) + " " + i + " " + str.indexOf(str.charAt(i)));
			
			//찾는 문자열의 인덱스와 for문 인덱스가 같다면,
			if(str.indexOf(str.charAt(i)) == i) 
				answer.append(str.charAt(i));
		}
		
		return answer.toString();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(solution(str));
	}
}
