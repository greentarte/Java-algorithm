package samsung;

import java.util.Scanner;

public class S1959 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();// �׽�Ʈ ���̽�
		int max = 0;
		int[] N;
		int[] M;
		int sum;
		for (int i = 1; i <= T; i++) {
			sum = 0;
			// �迭 ũ�� ���� �� �� �Է�
			N = new int[sc.nextInt()]; // �迭 ũ�� �Է�

			M = new int[sc.nextInt()]; // �迭 ũ�� �Է�

			for (int j = 0; j < N.length; j++) {
				N[j] = sc.nextInt();

			}
			for (int k = 0; k < M.length; k++) {
				M[k] = sc.nextInt();

			}
			// �Ǵ� ����
			if (N.length > M.length) {
				// N�� Ŭ��
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
				// M�� Ŭ��
				for (int y = 0; y < M.length - N.length + 1; y++) {
					for (int x = 0; x < N.length; x++) {
						sum += N[x] * M[y + x];
					}
					if (sum > max)
						max = sum;
					sum = 0;
				}
			}

			// ���
			System.out.println("#" + i + " " + max);
			max=0;
		}
		sc.close();

	}

}
