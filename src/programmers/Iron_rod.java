package programmers;

public class Iron_rod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arrangement="(()((()))(())())";
		System.out.println(solution(arrangement));
	}
	public static int solution(String arrangement) {
		int answer=0;
		//레이저 위치 문자로 변경
		String result=arrangement.replace("()", "L");
		//char배열로 전환 탐색을 편하게 하기 위해서
		boolean tmp=result.contains("L");
		char[] total=result.toCharArray();
		//막대기를 찾아서 자르는 반복문
		while(tmp) {
			//막대기 시작지점
			int start=0;
			//막대기 종료지점
			int end=0;
			//분할갯수 = 레이저갯수+1
			int cnt=0;
			//막대기 위치 탐색
			for(int i=0; i<total.length; i++) {
				//막대기 시작점
				if(total[i]=='(')
					start=i;
				//막대기 종료점
				else if(total[i]==')')
					end=i;
				//막대기 성립조건
				if(start<end) {
					//막대기안에 레이져 갯수 탐색
					for(int j=start; j<=end; j++) {
						if(total[j]=='L')
							cnt++;
					}
					if(cnt!=0) {
						total[start]='_';
						total[end]='_';
						answer+=cnt+1;
						break; //탐색 for문 중지	
					}
				}
			}
			if(start==0||end ==0)
				break;
		}
		
		return answer;
	}

}
