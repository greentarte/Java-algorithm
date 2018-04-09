package samsung;

import java.util.Scanner;

public class S1284 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트케이스
		int P, Q, R, S, W;
		int a = 0;
		int b = 0;
		int result = 0;
		for (int i = 1; i <= T; i++) {
			P = sc.nextInt(); // 리터당 P요금
			Q = sc.nextInt(); // R리터 이하 Q요금
			R = sc.nextInt(); // 리미트
			S = sc.nextInt(); // 초과시 내는 리터당 요금
			W = sc.nextInt(); // 수도 사용량;

			a = W * P;
			if (W - R <= 0) {// R보다 적게 사용한경우
				b = Q;
			} else {
				b = Q + (W - R) * S;
			}
			if (a > b){
				result = b;
			}else{
				result = a;
			}				
			System.out.printf("#%d %d\n", i, result);
		}
		sc.close();
	}

}
