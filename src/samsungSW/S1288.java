package samsung;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class S1288 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // �׽�Ʈ���̽�
		int seq = 1;
		int N; // �Է°� ���� ����
		int gob;
		int init;
		String size;
		Set<String> hs;

		for (int i = 1; i <= T; i++) {
			// �缼��
			hs = new HashSet<String>();
			N = sc.nextInt();
			gob = 1;
			init = N;

			while (hs.size() < 10) {
				N = init * (gob++);
				size = "" + N;
				for (int j = size.length(); j > 0; j--) {
					System.out.println("�Է°�    ----" + (int) (N / Math.pow(10, j - 1)));
					hs.add("" + (int) (N / Math.pow(10, j - 1)));
					N=N%(int) Math.pow(10, j - 1);
				}
			}
			System.out.println("#" + (seq++) + " " + init*(--gob));

		}
		sc.close();

	}

}
