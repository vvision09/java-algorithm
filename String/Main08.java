package String;

import java.util.Scanner;

public class Main08 {
	
	public static String solution(String str) {
		String answer = "NO";
		
		String tmp = new StringBuilder(str)
								.reverse().
								toString();
		
		if(str.equalsIgnoreCase(tmp)) answer = "YES";
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(solution(str));
	}
}
