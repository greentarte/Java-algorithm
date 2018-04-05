package baekjoon;

import java.util.Scanner;

public class baekjoon_14891 {
	static String word[]; // input값 처리
	static int N = 8; // 톱니 수
	static int K; // 회전횟수
	static int gear[][] = new int[4][N]; // 첫번째 톱니
	static int start;
	static int end;
	static int select;
	static int direct;
	static int result;
	static boolean visit[];
	static int[] xx;
	static int[] yy;

	public static void rotate(int select, int direct) {// 회전
		if (direct == 1) {
			end = gear[select][gear[select].length - 1];
			for (int i = gear[select].length - 1; i >= 1; i--) {
				gear[select][i] = gear[select][i - 1];
			}
			gear[select][0] = end;
		} else {
			start = gear[select][0];
			for (int i = 0; i < gear[select].length - 1; i++) {
				gear[select][i] = gear[select][i + 1];
			}
			gear[select][gear[select].length - 1] = start;

		}
	}

	public static void reverse(int dir) {
		direct = dir * -1;
	}

	public static void dfs(int select, int direct) {
		// 종료조건
		if (visit[select] == true || select < 0 || select > 3) {
			return;
		}

		// 시작 시점 방문도장
		visit[select] = true;

		// 재귀조건
		if (select == 0) {
			if (xx[0] == yy[0]) { // 같은 극이면 혼자만 회전함
				rotate(select, direct);
			} else { // 다른 극이면
				rotate(select++, direct); // 혼자회전
				reverse(direct);
				dfs(select, direct);
			}

		} else if (select == 1) {
			if (xx[1] == yy[1] && xx[0] == yy[0]) {
				rotate(select, direct);
			} else if (xx[1] == yy[1] && xx[0] != yy[0]) {
				rotate(select--, direct);
				reverse(direct);
				dfs(select, direct);
			} else if (xx[1] != yy[1] && xx[0] == yy[0]) {
				rotate(select++, direct);
				reverse(direct);
				dfs(select, direct);
			} else if (xx[1] != yy[1] && xx[0] != yy[0]) {
				rotate(select++, direct);
				reverse(direct);
				dfs(select--, direct);
				dfs(--select, direct);
			}

		} else if (select == 2) {
			if (xx[2] == yy[2] && xx[1] == yy[1]) {
				rotate(select, direct);
			} else if (xx[2] == yy[2] && xx[1] != yy[1]) {
				rotate(select--, direct);
				reverse(direct);
				dfs(select, direct);
			} else if (xx[2] != yy[2] && xx[1] == yy[1]) {
				rotate(select++, direct);
				reverse(direct);
				dfs(select, direct);
			} else if (xx[2] != yy[2] && xx[1] != yy[1]) {
				rotate(select++, direct);
				reverse(direct);
				dfs(select--, direct);
				dfs(--select, direct);
			}

		} else if (select == 3) {
			if (xx[2] == yy[2]) {
				rotate(select, direct);
			} else {
				rotate(select--, direct);
				reverse(direct);
				dfs(select, direct);
			}
		}
		return;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		word = new String[4];
		// 기어값 1줄씩 저장
		for (int i = 0; i < word.length; i++) {
			word[i] = sc.nextLine();
		}
		// 기어별 개별 대입
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < N; j++) {
				gear[i][j] = Character.getNumericValue(word[i].charAt(j));
			}
		}
		// dfs조건
		K = sc.nextInt();
		for (int i = 1; i <= K; i++) {
			select = sc.nextInt() - 1;
			direct = sc.nextInt();
			visit = new boolean[4]; // 한번회전 하면 초기화
			xx = new int[3];
			yy = new int[3];
			for (int j = 0; j < 3; j++) { // 회전시 마다 새로 추출
				xx[j] = gear[j][2];
				yy[j] = gear[j + 1][6];
			}
			dfs(select, direct);
		}

		// 점수 계산
		for (int i = 0; i < 4; i++) {
			if (gear[i][0] == 1)
				result += (int) Math.pow(2, i);
		}

		System.out.println(result);
		sc.close();
	}

}
