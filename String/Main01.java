package String;

import java.util.Scanner;

public class Main01 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char c =  sc.next().charAt(0);
		System.out.println(solution(str,c)); 
	}
	
	public static int solution(String str, char t) {
		int answer = 0;
		str = str.toUpperCase();
		t = Character.toUpperCase(t);
	
		for(char x : str.toCharArray())
			if(x == t) answer++;
		
		/*
		for(int i = 0; i < str.length(); i++) 
			if(str.charAt(i) == t) answer++; 
			*/
		
		
		
		return answer;
	}
	
}
