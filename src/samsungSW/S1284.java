package samsung;

import java.util.Scanner;

public class S1284 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // �׽�Ʈ���̽�
		int P, Q, R, S, W;
		int a = 0;
		int b = 0;
		int result = 0;
		for (int i = 1; i <= T; i++) {
			P = sc.nextInt(); // ���ʹ� P���
			Q = sc.nextInt(); // R���� ���� Q���
			R = sc.nextInt(); // ����Ʈ
			S = sc.nextInt(); // �ʰ��� ���� ���ʹ� ���
			W = sc.nextInt(); // ���� ��뷮;

			a = W * P;
			if (W - R <= 0) {// R���� ���� ����Ѱ��
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
