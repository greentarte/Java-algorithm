package programmers;

public class Iron_rod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arrangement="(()((()))(())())";
		System.out.println(solution(arrangement));
	}
	public static int solution(String arrangement) {
		int answer=0;
		//������ ��ġ ���ڷ� ����
		String result=arrangement.replace("()", "L");
		//char�迭�� ��ȯ Ž���� ���ϰ� �ϱ� ���ؼ�
		boolean tmp=result.contains("L");
		char[] total=result.toCharArray();
		//����⸦ ã�Ƽ� �ڸ��� �ݺ���
		while(tmp) {
			//����� ��������
			int start=0;
			//����� ��������
			int end=0;
			//���Ұ��� = ����������+1
			int cnt=0;
			//����� ��ġ Ž��
			for(int i=0; i<total.length; i++) {
				//����� ������
				if(total[i]=='(')
					start=i;
				//����� ������
				else if(total[i]==')')
					end=i;
				//����� ��������
				if(start<end) {
					//�����ȿ� ������ ���� Ž��
					for(int j=start; j<=end; j++) {
						if(total[j]=='L')
							cnt++;
					}
					if(cnt!=0) {
						total[start]='_';
						total[end]='_';
						answer+=cnt+1;
						break; //Ž�� for�� ����	
					}
				}
			}
			if(start==0||end ==0)
				break;
		}
		
		return answer;
	}

}
