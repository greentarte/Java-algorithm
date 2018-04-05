package baekjoon;

import java.util.Scanner;

public class baekjoon_10026 {
	static int N; // 배열크기
	static char[][] map;
	static boolean[][] visit;
	static int[] dx = { 1, 0, -1, 0 };
	static int[] dy = { 0, 1, 0, -1 };
	static int cntR;
	static int cntG;
	static int cntB;

	public static void dfs(int x, int y) {
		if (visit[x][y] == true)
			return;
		visit[x][y] = true;
		int nx = 0;
		int ny = 0;
		for (int i = 0; i < 4; i++) {
			nx = x + dx[i];
			ny = y + dy[i];
			if (nx >= 0 && ny >= 0 && nx < N && ny < N && map[x][y] == map[nx][ny]) {
				dfs(nx, ny);
			}
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		sc.nextLine();
		map = new char[N][N]; // map선정
		visit = new boolean[N][N];// 방문 선정
		String[] word = new String[N];
		for (int i = 0; i < N; i++) {
			word[i] = sc.nextLine(); // 1줄씩 문자열로 받음
		}
		for (int i = 0; i < word.length; i++) { // R,G,B 삽입
			for (int j = 0; j < N; j++) {
				map[i][j] = word[i].charAt(j);
			}
		}
		// 정상 눈
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (visit[i][j] == false && map[i][j] == 'R') {
					dfs(i, j);
					cntR++;
				} else if (visit[i][j] == false && map[i][j] == 'B') {
					dfs(i, j);
					cntB++;
				} else if (visit[i][j] == false && map[i][j] == 'G') {
					dfs(i, j);
					cntG++;
				}
			}
		}
		sc.close();
		System.out.print(cntR + cntB + cntG);

		// 색약눈
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if(map[i][j]=='G') {
					map[i][j]='R';
				}
			}
		}
		cntR=0;
		cntB=0;
		visit= new boolean[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (visit[i][j] == false && map[i][j] == 'R') {
					dfs(i, j);
					cntR++;
				} else if (visit[i][j] == false && map[i][j] == 'B') {
					dfs(i, j);
					cntB++;
				}	
			}
		}
		System.out.println(" "+(cntR+cntB));
		
	}

}
