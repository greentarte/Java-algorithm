		package baekjoon;
		
		import java.util.Scanner;
		
		public class baekjoon_13458 {
		
			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				int roomNum = sc.nextInt();
				int[] st = new int[roomNum]; // ������ ����
				for (int i = 0; i < st.length; i++) {// �����帶�� �л��� ����
					st[i] = sc.nextInt();
				}
				int inspector = sc.nextInt(); // �Ѱ��� 1���� �濡 �����ο���
				int subInspector = sc.nextInt(); // �ΰ��� 1���� �濡 �����ο���
				int numInspector = roomNum; // �Ѱ��� �ʿ䷮�� ���� ������ ����
				 // �ΰ��� �ʿ䷮
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
