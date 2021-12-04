package String;

import java.util.Scanner;

public class Main12_1 {
	public static String solution(int t, String c){
		String answer = "";
		for(int i = 0; i < t; i++) {
			int num = c.charAt(i);
			String tmp = Integer.toBinaryString(num);
			answer += tmp.substring(0, 7).replace('1', '#').replace('0', '*');
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int t = kb.nextInt();
		String c = kb.next();
		System.out.println(solution(t, c));
	}

}
