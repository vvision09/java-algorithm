package Array;
import java.util.*;

/**
 * 
 * @author TaekGeun
 *	가위바위보
 */
public class Main03 {
	public static ArrayList<String> solution(int n, int[] a, int[] b) {
		ArrayList<String> answer = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			if(a[i] == b[i]) answer.add("D");
			else if(a[i] == 1 && b[i] == 3) answer.add("A");
			else if(a[i] == 2 && b[i] == 1) answer.add("A");
			else if(a[i] == 3 && b[i] == 2) answer.add("A");
			else answer.add("B");
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
		}
		
		for(String x : solution(n,a,b)) {
			System.out.println(x);
		}
	}
}
