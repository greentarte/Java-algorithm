package programmers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Printer {

	public static void main(String[] args) {
		int[] priorities= {2, 1, 3, 2};
		int location = 2;
		System.out.println(solution(priorities,location));

	}
	public static int solution(int[] priorities, int location) {
		int answer=0;
		char start='A';
		String[] result=new String[priorities.length];
		for(int i=0; i<result.length; i++) {
			result[i]=priorities[i]+""+(start++);
//			System.out.println(result[i]);
			
		}
//		System.out.println("-----------------------------");
		Arrays.sort(result);
//		for(int i=0; i<result.length; i++) {
//			System.out.println(result[i]);
//		}
		//A 65
		//location 2 -> C 67
		//Å½»öÁ¶°Ç 65+location
		start=(char)(start+location);
		for (int i = result.length-1; i >-1 ; i--) {
			if(result[i].substring(1,1).equals(start+"")){
				answer=result.length-i+1;
			}
		}

		return answer;
	}
	
}
