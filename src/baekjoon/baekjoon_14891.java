package baekjoon;

import java.util.Scanner;

public class baekjoon_14891 {
	static String word[]; // input�� ó��
	static int N = 8; // ��� ��
	static int K; // ȸ��Ƚ��
	static int gear[][] = new int[4][N]; // ù��° ���
	static int start;
	static int end;
	static int select;
	static int direct;
	static int result;
	static boolean visit[];
	static int[] xx;
	static int[] yy;

	public static void rotate(int select, int direct) {// ȸ��
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
		// ��������
		if (visit[select] == true || select < 0 || select > 3) {
			return;
		}

		// ���� ���� �湮����
		visit[select] = true;

		// �������
		if (select == 0) {
			if (xx[0] == yy[0]) { // ���� ���̸� ȥ�ڸ� ȸ����
				rotate(select, direct);
			} else { // �ٸ� ���̸�
				rotate(select++, direct); // ȥ��ȸ��
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
		// �� 1�پ� ����
		for (int i = 0; i < word.length; i++) {
			word[i] = sc.nextLine();
		}
		// �� ���� ����
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < N; j++) {
				gear[i][j] = Character.getNumericValue(word[i].charAt(j));
			}
		}
		// dfs����
		K = sc.nextInt();
		for (int i = 1; i <= K; i++) {
			select = sc.nextInt() - 1;
			direct = sc.nextInt();
			visit = new boolean[4]; // �ѹ�ȸ�� �ϸ� �ʱ�ȭ
			xx = new int[3];
			yy = new int[3];
			for (int j = 0; j < 3; j++) { // ȸ���� ���� ���� ����
				xx[j] = gear[j][2];
				yy[j] = gear[j + 1][6];
			}
			dfs(select, direct);
		}

		// ���� ���
		for (int i = 0; i < 4; i++) {
			if (gear[i][0] == 1)
				result += (int) Math.pow(2, i);
		}

		System.out.println(result);
		sc.close();
	}

}
