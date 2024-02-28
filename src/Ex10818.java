import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//2024-02-28
public class Ex10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int min = 1000000;
        int max = -1000000;
        StringTokenizer st = new StringTokenizer(br.readLine());
        while(N-->0){
            int val = Integer.parseInt(st.nextToken());
            min = Math.min(min, val);
            max = Math.max(max, val);
        }
        sb.append(min).append(" ").append(max);
        System.out.print(sb);
    }
}
