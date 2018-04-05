package baekjoon;

import java.util.Scanner;

public class baekjoon_1012 {
	static int[] dx = { 1, 0, -1, 0 };
	static int[] dy = { 0, 1, 0, -1 };
	static int worm, T,M,N,K;
	static int map[][];
	static boolean[][] visit;

	public static void dfs(int x, int y) {

		// ��������
		if (visit[x][y] == true) // �湮������ ������ ����
			return;

		// ó������
		visit[x][y] = true; // ������ �湮����
		int nx;
		int ny;
		for (int i = 0; i < 4; i++) {
			nx = x + dx[i];
			ny = y + dy[i];
			if (nx >= 0 && ny >= 0 && nx < M && ny < N && map[x][y] == map[nx][ny]) {
				dfs(nx, ny);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt(); // �׽�Ʈ ���̽� ��
		for (int j = 0; j < T; j++) {
			worm = 0;
			M = sc.nextInt(); // ���α���
			N = sc.nextInt(); // ���α���
			K = sc.nextInt(); // ���߼���
			map = new int[M][N];
			visit = new boolean[M][N];
			int x = 0;
			int y = 0;
			int[] xArr = new int[K];
			int[] yArr = new int[K];
			for (int i = 0; i < K; i++) { // ���߼��� ��ŭ Map���ɴ´�
				x = sc.nextInt();
				y = sc.nextInt();
				map[x][y] = 1;
				xArr[i] = x;
				yArr[i] = y;
			}
			for (int i = 0; i <K; i++) {
				if(visit[xArr[i]][yArr[i]]==false  && map[xArr[i]][yArr[i]] ==1  ){
					dfs(xArr[i], yArr[i]);
					worm++;
				}
				
			}
			System.out.println(worm);
		}

		sc.close();

	}

}
