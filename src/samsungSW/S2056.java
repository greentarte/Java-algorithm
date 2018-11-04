package samsung;

import java.util.Scanner;

public class S2056 {
    static int i;
    static int cnt;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine());
		
		String y;
		int m;
		int d;
		cnt=1;
		for(int i=0; i<T; i++){
			String input=sc.nextLine();
			y =input.substring(0,4);
			m = Integer.parseInt(input.substring(4,6));
			d = Integer.parseInt(input.substring(6));
			if(m==2 && d>28){
				System.out.println("#"+cnt+" "+"-1");
				cnt++;
				continue;
			}else if(m<1 || m>12){
				System.out.println("#"+cnt+" "+"-1");
				cnt++;
				continue;
			}else if(m%2==1 && (d>31 ||d<1)){
				System.out.println("#"+cnt+" "+"-1");
				cnt++;
				continue;
			}else if(m%2==0 && (d>30 || d<1)){
				System.out.println("#"+cnt+" "+"-1");
				cnt++;
				continue;
			}else{

				System.out.printf("#%d %s/%02d/%02d%n",cnt,y,m,d);
				cnt++;
			}
			
		}
		sc.close();
		
		

	}

}
