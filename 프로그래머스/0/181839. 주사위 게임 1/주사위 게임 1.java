class Solution {
    public static void main(String[] args){
        int a=0,b=0;
        double random1=Math.random();
        double random2=Math.random();
        a=(int)(random1*6)*1;
        b=(int)(random2*6)*1;
        solution(a,b);
    }
    
    public static int solution(int a, int b) {
        int answer = 0;
        if((a%2==1) && (b%2==1)){    
            answer=a*a+b*b;
            return answer;
        }
        else if((a%2==1) || (b%2==1)){
            answer=2*(a+b);
            return answer;
        }
        else{
            answer=a-b;
            if(answer<0){
                answer=answer*-1;
            }
            return answer;
        }
    }
}