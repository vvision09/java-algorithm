package String;

import java.util.ArrayList;
import java.util.Scanner;

public class Main04_1 {
	
	public static ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<String>();
  
        for(String x : str){
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];

        for(int i = 0; i < n; i++){
            str[i] = sc.next();
        }
        for(String x : solution(n,str)){
            System.out.println(x);
        }
    }
}
