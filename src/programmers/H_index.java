import java.util.Arrays;

public class H_index {

	public static void main(String[] args) {
		int citations[]={3,0,6,1,5};
		System.out.println(solution(citations));

	}
	public static int solution(int[] citations){
		 	int answer = 0;
	        int cnt=0;
	        int length=citations.length;
	        Arrays.sort(citations);
	        int h=citations[length-1];
	        while(true){
	             for(int i=length-1; i>=0; i--){
	                if(citations[i]>=h){
	                    cnt++;
	             }
	                }
	            
	            if(cnt>=h&& length-h<h){
	                answer=h;
	                break;
	            } else{
	            	answer=h;
	                h--;
	                cnt=0;
	            }
	        }
	       
	        return answer;
	}

}
