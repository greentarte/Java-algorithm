package samsung;


import java.util.Arrays;
import java.util.Scanner;

public class S1966 {
		static int T;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		T=sc.nextInt(); //텟흐트케이스
		int N;
		int[] arr;
		int cnt=1;
		for(int i=1; i<=T; i++){
			N=sc.nextInt();
			arr=new int[N];
			//make array
			for(int j=0; j<N; j++){
				arr[j]=sc.nextInt();
			}
			Arrays.sort(arr);
			System.out.printf("#%d ", cnt);
			for(int k=0; k<N; k++){
				if(k==N-1){
					System.out.println(arr[k]);
				}else{
					System.out.print(arr[k]+" ");
				}
				
			}
			cnt++;
			
		}
		sc.close();
	}

}
