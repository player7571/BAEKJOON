import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//2024-04-14
public class Ex1037 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int max = 0;
        int min = Integer.MAX_VALUE;
        StringTokenizer st = new StringTokenizer(br.readLine());
        while(N-->0){
            int val = Integer.parseInt(st.nextToken());
            max = Math.max(max, val);
            min = Math.min(min, val);
        }
        int ans = max*min;
        System.out.print(ans);
    }
}
