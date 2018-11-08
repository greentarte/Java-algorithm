package programmers;

import java.util.Arrays;

public class Kth_number {

	public static void main(String[] args) {
		int[] array= {1,5,2,6,3,7,4};
		int[][] commands = { {2,5,3}, {4,4,1}, {1,7,3} };
		int[] answer=solution(array,commands);
		for(int i=0; i<answer.length; i++) {
			System.out.print(answer[i]+" ");
		}
		
	}
	 public static int[] solution(int[] array, int[][] commands) {
	        int[] answer;
	        answer=new int[commands.length];
	        int[] ex;
	        //commands 횟수만큼 반복 실행
	        for(int i=0; i<answer.length; i++) {
	        	int end = commands[i][1]-1; // 5-1 = 4
	        	int start = commands[i][0]-1; // 2-1 = 1
	        	int select = commands[i][2]-1; // 3-1 = 2
	        	ex=new int[end-start+1]; // 4-1+1=4
	        	for(int j=0; j<ex.length; j++) {
	        		ex[j]=array[j+start]; // 0+1= 1, 1+1= 2, 2+1= 3, 3+1= 4
	        	}
	        	Arrays.sort(ex);
	        	
	        	answer[i]=ex[select];
	        	
	        }
	        return answer;
	    }
}
