package Array;

import java.util.*;

/**
 * 보이는 학생 
 * 
 * @author TaekGeun
 *
 */
public class Main02 {
	public static int solution(int n, int[] arr){
		int answer = 1;
		int tmp = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > tmp) {
				tmp = arr[i];
				answer++;
			}
		}
		
		return answer;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(solution(n,arr));
		

	}
}
