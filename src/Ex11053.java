import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//2024-01-10
public class Ex11053 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int [] A = new int[N];
        int [] dp = new int[N+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        for(int i=0; i<N; i++){
            dp[i]= 1;
            for(int j=0; j<i; j++){
                if(A[j]<A[i]) dp[i] = Math.max(dp[i], dp[j]+1);
            }
        }
        int max=0;
        for(int i=0; i<N; i++){
            max = Math.max(max, dp[i]);
        }
        System.out.print(max);
    }
}
