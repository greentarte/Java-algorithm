package samsung;

import java.util.Scanner;

public class S1959 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();// 테스트 케이스
		int max = 0;
		int[] N;
		int[] M;
		int sum;
		for (int i = 1; i <= T; i++) {
			sum = 0;
			// 배열 크기 생성 및 값 입력
			N = new int[sc.nextInt()]; // 배열 크기 입력

			M = new int[sc.nextInt()]; // 배열 크기 입력

			for (int j = 0; j < N.length; j++) {
				N[j] = sc.nextInt();

			}
			for (int k = 0; k < M.length; k++) {
				M[k] = sc.nextInt();

			}
			// 판단 로직
			if (N.length > M.length) {
				// N이 클때
				for (int y = 0; y < N.length - M.length + 1; y++) {
					sum = 0;
					for (int x = 0; x < M.length; x++) {
						sum += N[y + x] * M[x];
					}
					if (sum > max)
						max = sum;
					sum = 0;
				}
			} else {
				// M이 클때
				for (int y = 0; y < M.length - N.length + 1; y++) {
					for (int x = 0; x < N.length; x++) {
						sum += N[x] * M[y + x];
					}
					if (sum > max)
						max = sum;
					sum = 0;
				}
			}

			// 출력
			System.out.println("#" + i + " " + max);
			max=0;
		}
		sc.close();

	}

}
