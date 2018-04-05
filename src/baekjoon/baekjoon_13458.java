		package baekjoon;
		
		import java.util.Scanner;
		
		public class baekjoon_13458 {
		
			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				int roomNum = sc.nextInt();
				int[] st = new int[roomNum]; // 시험장 숫자
				for (int i = 0; i < st.length; i++) {// 시험장마다 학생수 대입
					st[i] = sc.nextInt();
				}
				int inspector = sc.nextInt(); // 총감독 1개의 방에 감시인원수
				int subInspector = sc.nextInt(); // 부감독 1개의 방에 감시인원수
				int numInspector = roomNum; // 총감독 필요량은 방의 갯수와 동일
				 // 부감독 필요량
				long result = 0;
				long sum=0;
				for (int i = 0; i < st.length; i++) {
					sum=0;
					sum=st[i]-inspector;
					if (sum == 0 || sum<0) {
						continue;
					} 
					if (sum % subInspector == 0) {
						result += sum / subInspector;
					}
					if(sum % subInspector != 0) {
						result += sum / subInspector + 1;
					}
				}
				result=result+numInspector;
				sc.close();
				System.out.println(result);
				
			}
		
		}
