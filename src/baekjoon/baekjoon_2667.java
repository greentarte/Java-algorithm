package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class baekjoon_2667 {
	static int T;
	static String arr[];
	static int map[][];
	static boolean visit[][]; // 미방문 기본값 false
	static int x[];
	static int y[];
	static int a;
	static int b;
	static int dx[] = { 1, 0, -1, 0 };
	static int dy[] = { 0, 1, 0, -1 };
	static int cnt; // 단지 카운트
	static int dcnt;
	static ArrayList<Integer> danji = new ArrayList<Integer>();

	public static void dfs(int x, int y) {
		if (visit[x][y] == true) {
			return;
		}
		int nx;
		int ny;
		visit[x][y] = true;
		dcnt++;
		for (int i = 0; i < 4; i++) {
			nx = x + dx[i];
			ny = y + dy[i];
			if (nx >= 0 && ny >= 0 && nx < T && ny < T && map[x][y] == map[nx][ny]) {
				dfs(nx, ny);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt(); // 배열의 크기
		map = new int[T][T];
		visit = new boolean[T][T];
		x = new int[T * T];
		y = new int[T * T];
		arr = new String[T];
		sc.nextLine();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextLine();
		}
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				map[i][j] = Character.getNumericValue(arr[i].charAt(j));
				if (map[i][j] == 1) {
					x[a++] = i;
					y[b++] = j;
				}
			}
		}
		for (int i = 0; i < x.length; i++) {
			if (visit[x[i]][y[i]] == false && map[x[i]][y[i]] == 1) { 
				cnt++;
				dfs(x[i], y[i]);
				danji.add(dcnt);
				dcnt = 0;
			}

		}
		System.out.println(cnt);
		Collections.sort(danji); // 자동 오름차순 정렬
		for (int result : danji) {
			System.out.println(result);
		}
		// 단지내 집의 수량 오름차순 출력
		sc.close();
	}

}
