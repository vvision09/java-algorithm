package Array;
import java.util.*;

/**
 * @author TaekGeun
 * 피보나치 수열
 */
public class Main04 {
	
	public static ArrayList<Integer> solution(int num){
		ArrayList<Integer> answer = new ArrayList<Integer>();
		
		int tmp = 0;
		answer.add(1);
		answer.add(1);
		
		for(int i = 2; i < num; i ++) {
			answer.add(answer.get(i-2) + answer.get(i-1));
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int x : solution(num)) {
			System.out.print(x + " ");
		}
	}
}
