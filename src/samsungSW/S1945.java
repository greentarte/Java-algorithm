package samsung;

import java.util.Scanner;

public class S1945 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt(); //테스트 케이스 수
		int N; //소인수분해할 수
		int a,b,c,d,e;
		int seq=1;
		for(int i=1; i<=T; i++ ){
			//초기화
			a=0;
			b=0;
			c=0;
			d=0;
			e=0;
			N=sc.nextInt();
			// 소인수분해
			while(N%2==0){
				a++;
				N=N/2;
			}
			while(N%3==0){
				b++;
				N=N/3;
			}
			while(N%5==0){
				c++;
				N=N/5;
			}
			while(N%7==0){
				d++;
				N=N/7;
			}
			while(N%11==0){
				e++;
				N=N/11;
			}
			System.out.printf("#%d %d %d %d %d %d\n",seq++,a,b,c,d,e);
			
			
		}
	}

}
