
public class H_index {

	public static void main(String[] args) {
		int citations[]={3,0,6,1,5};
		System.out.println(solution(citations));

	}
	public static int solution(int[] citations){
		 	int answer = 0;
	        int cnt=0;
	        int h=0;
	        int length=citations.length;
	        
	        while(true){
	             for(int i=0; i<length; i++){
	                if(citations[i]>=h){
	                    cnt++;
	             }
	                }
	            
	            if(cnt>=h&& length-h<h){
	                 if(answer<h){
	                	 answer=h;
	                 }
	                break;
	            } else{
	            	answer=h;
	                h++;
	                cnt=0;
	            }
	        }
	       
	        return answer;
	}

}
