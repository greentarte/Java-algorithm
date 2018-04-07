package samsung;

import java.util.Scanner;

public class S1986 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트케이스
		int seq = 1; // 답 순서
		int N; // 매번 실행할 값
		int sum;
		for (int i = 1; i <= T; i++) {
			N = sc.nextInt();
			sum=0;
			for (int j = 1; j <= N; j++) {
				if(j%2==0){
					sum-=j;
				}else{
					sum+=j;
				}
			}
			System.out.println("#"+(seq++)+" "+sum);

		}

	}

}
