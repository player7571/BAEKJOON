import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//2024-01-05
public class Ex2579 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int [] stair = new int[N+1];
        int [][] dp = new int[N+1][2];
        for(int i=1; i<=N; i++){
            stair[i] = Integer.parseInt(br.readLine());
        }
        if(N==1) {
            System.out.println(stair[1]);
            return;
        }
        dp[N][0] = stair[N];
        dp[N][1] = stair[N];
        boolean count = true;
        System.out.println(maxStair(stair, dp, count, N));
    }
    static int maxStair(int [] stair, int [][] dp, boolean count, int N){
        if(N==dp.length) {
            return Math.max(Math.max(dp[1][0], dp[1][1]), Math.max(dp[2][0],dp[2][1]));
        }
        if(N<2) return maxStair(stair, dp, count, dp.length);
        if(dp[N-1][0] < dp[N][1] + stair[N-1] && count) {
            dp[N-1][0]=dp[N][1] + stair[N-1];
            count = false;
            maxStair(stair, dp, count, N-1);
        }
        count = true;
        if(dp[N-2][1] < dp[N][1] + stair[N-2]) {
            dp[N-2][1] = dp[N][1] + stair[N-2];
        }
        if(dp[N-2][1] < dp[N][0] + stair[N-2]) {
            dp[N-2][1] = dp[N][0] + stair[N-2];
        }
        maxStair(stair, dp, count, N-2);
        return maxStair(stair, dp, count, dp.length);
    }
}
