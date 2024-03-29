import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex2752 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] val = new int[3];
        for(int i=0; i<3; i++){
            val[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(val);
        for(int ans: val){
            sb.append(ans).append(" ");
        }
        System.out.print(sb);
    }
}
