class Solution {
public int solution(String arrangement) {
            int answer=0;
            //레이저 위치 문자로 변경
            String result=arrangement.replace("()", "L");
            //char배열로 전환 탐색을 편하게 하기 위해서
            boolean tmp=result.contains("L");
            char[] total=result.toCharArray();
            //막대기를 찾아서 자르는 반복문
            int end;
            int start;
            int cnt;
            while(tmp) {
                //막대기 종료지점
                end=0;
                while(end < total.length && total[end]!=')' ) end++;

                //막대기 시작지점
                start=end-2;
                while(start > -1 && total[start]!='(') start--;

                //분할갯수 = 레이저갯수+1
                cnt=0;

                //막대기 성립조건
                if(start != -1 &&  end != arrangement.length() ) {
                    //막대기안에 레이져 갯수 탐색
                    for(int j=start; j<=end; j++) {
                        if(total[j]=='L')
                            cnt++;
                    }
                    total[start]='_';
                    total[end]='_';
                    answer+=cnt+1;
                } else {
                    tmp = false;
                }
            }

            return answer;
        }
}
