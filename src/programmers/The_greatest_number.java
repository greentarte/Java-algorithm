import java.util.Arrays;
import java.util.Comparator;

public class The_greatest_number {

	public static void main(String[] args) {
		int[] number={6,10,2};
		System.out.println(solution(number));

	}
	public static String solution(int[] numbers) {
        String answer = "";
        String[] num = new String[numbers.length];
        for(int i=0; i<numbers.length; i++){
        	num[i]=String.valueOf(numbers[i]);
        }
        Arrays.sort(num, new Mycomp());
        if(num[0].equals("0")){
        	answer+="0";
        }else{
        	for(int j=0; j<num.length; j++){
        		answer+=num[j];
        	}
        }

        return answer;
    }
}
//return 1일때, o2가 먼저 나온다
//return 0일때, 변함 없다
//return -1일때, o1가 먼저 나온다.
class Mycomp implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {
		return (o2+o1).compareTo(o1+o2);
	}
}
