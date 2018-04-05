package samsungSW;

import java.util.Scanner;

public class S1979 {
	static int nx;
	static int ny;
	static int map[][];
	static boolean visit[][];
	static int N;
	static int xcnt = 1;
	static int ycnt = 1;
	static int dx[] = { 1, -1 };
	static int dy[] = { 1, -1 };

	public static void xdfs(int x, int y) {
		visit[x][y] = true;
		for (int i = 0; i < 2; i++) {
			nx = x + dx[i];
			if (nx < N && nx > -1 && map[nx][y] == 1 && visit[nx][y] == false) {
				xcnt = xcnt + 1;
				xdfs(nx, y);
			}
		}
		return;
	}

	public static void ydfs(int x, int y) {
		visit[x][y] = true;
		for (int i = 0; i < 2; i++) {
			ny = y + dy[i];
			if (ny < N && ny > -1 && map[x][ny] == 1 && visit[x][ny] == false) {
				ycnt = ycnt + 1;
				ydfs(x, ny);
			}
		}
		return;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트케이스 수
		int K;
		int result;
		int seq = 1;
		for (int t = 1; t <= T; t++) {
			result = 0;
			N = sc.nextInt(); // 퍼즐크기
			K= sc.nextInt(); // 단어크기
			visit = new boolean[N][N];
			map =new int[N][N];
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					map[i][j]=sc.nextInt();
				}
			}
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (map[i][j] == 1) {
						xcnt = 1;
						xdfs(i, j);
						if (xcnt == K) {
							result++;
						}
						xcnt = 1;
					}
				}
			}

			visit = new boolean[N][N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (map[i][j] == 1) {
						ycnt = 1;
						ydfs(i, j);
						if (ycnt == K) {
//							System.out.println("좌표---" + i + "-----" + j);
							result++;
						}
						ycnt = 1;

					}
				}
			}
			System.out.printf("#%d %d\n", seq++, result);
		}
		sc.close();
	}

}
