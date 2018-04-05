package samsungSW;

import java.util.Scanner;

public class S1204 {

	public static void main(String[] args) {
		int T = 0; // 테스트 케이스 번호
		int[] grade = null;
		int[] cnt = null;
		int max = 0;
		int result = 0;

		Scanner sc = new Scanner(System.in);
		for (int u = 0; u < 10; u++) {

			T = sc.nextInt();

			grade = new int[1000];
			cnt = new int[101]; // 횟수체크
			for (int i = 0; i < grade.length; i++) {
				grade[i] = sc.nextInt();
				cnt[grade[i]]++;
			}
			max = 0; // 최빈도
			result = 0; // 최빈값
			for (int i = 0; i < cnt.length; i++) {
				if (cnt[i] > max) {
					max = cnt[i];
					result = i;
				} else if (cnt[i] == max) { // 빈도수가 같으면
					max = cnt[i];
					if (i > result) // 숫자가 큰값이 최빈값이다.
						result = i;
				}
			}
			System.out.println("#" + (u + 1) + " " + result);
		}
		sc.close();

	}

}
