package String;

import java.util.Scanner;

public class Split {
	public static String solution(String str){
        String answer = "";

        //Int 범위중에 가장 작은값
        int m = Integer.MIN_VALUE;
        String[] s = str.split(" ");

        for(String x:s){
            int len = x.length();

            if(len > m){
                m = len;
                answer = x;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }
}
