package samsungSW;

import java.util.Scanner;

public class S1926 {
	static String result;
	static int i;
	static int cnt;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 마지막 숫자
		int n;
		for (i = 1; i <= N; i++) {
			result = String.valueOf(i);
			n = result.length();
			if (n < 2) { // 1 ~ 9
				clap(n);
				if (cnt == 0)
					System.out.print(i+" ");
				else
					System.out.print(" ");
			} else if (n < 3) { // 10 ~ 99
				clap(n);
				// 안들어있다면
				if (cnt == 0)
					System.out.print(i+" ");
				else
					System.out.print(" ");
			} else if (n < 4) { // 100 ~ 999
				clap(n);
				// 안들어있다면
				if (cnt == 0)
					System.out.print(i+" ");
				else
					System.out.print(" ");
			} else { // 1000
				System.out.print(i);
			}
		}
		sc.close();

	}

	public static void clap(int n) {
		cnt = 0;
		for (int j = 0; j < n; j++) {
			if (result.charAt(j) == '3' || result.charAt(j) == '6' || result.charAt(j) == '9') {
				System.out.print("-");
				cnt++;
			}
		}
	}
}
