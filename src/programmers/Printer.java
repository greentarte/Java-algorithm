import java.util.Arrays;

public class Printer {

	public static void main(String[] args) {
		int[] priorities = { 1, 1, 9, 1,1,1 };
		int location = 0;
		System.out.println(solution(priorities, location));

	}

	public static int solution(int[] priorities, int location) {
		int answer = 0;
		char start = 'A';
		String[] result = new String[priorities.length];
		for (int i = 0; i < result.length; i++) {
			result[i] = priorities[i] + "" + (start++);
			// System.out.println(result[i]);

		}
		// System.out.println("-----------------------------");
		Arrays.sort(result);
		// for(int i=0; i<result.length; i++) {
		// System.out.println(result[i]);
		// }
		// A 65
		// location 2 -> C 67
		start = 'A';
		start = (char) (start + location);
		char tmp;
		for (int i = result.length - 1; i > -1; i--) {
			 tmp= result[i].charAt(1);
			if (tmp==start) {
				answer = result.length - i;
			}
		}

		return answer;
	}

}
