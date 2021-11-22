package String;

import java.util.Scanner;

public class Main07_2 {
	
	public static String solution(String str) {
		String answer = "NO";
		str = str.toUpperCase().replaceAll("[^A-Z]","");
		String tmp = new StringBuilder(str).reverse().toString();
		
		if(str.equals(tmp)) answer = "YES";

		
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(solution(str));
	}
}
