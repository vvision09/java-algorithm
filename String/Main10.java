package String;

import java.util.Scanner;

/**
 * 
 * @author TaekGeun
 *	
 * 가장 짧은 문자 거리
 * 
 *
 */
public class Main10 {
	
	public static int[] solution(String str,char c) {
		int[] answer = new int[str.length()];
		//거리는 최대한 크게, 입력받는 문자열의 길이 100자 
		int p = 101;
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == c) {
				p = 0;
				answer[i] = p;
			}else {
				p++;
				answer[i] = p;
			}
		}
		p = 101;
		
		for(int i = str.length()-1; i >= 0; i--) {
			if(str.charAt(i) == c) p = 0;
			else {
				p++;
				answer[i] = Math.min(answer[i], p);
			}
		}
		
		return answer;
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str =sc.next();
		char c = sc.next().charAt(0);
		
		for(int x : solution(str,c)) {
			System.out.print(x + " ");
		}
	}
}
