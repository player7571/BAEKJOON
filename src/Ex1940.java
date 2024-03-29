import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//2024-01-30
public class Ex1940 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M= Integer.parseInt(br.readLine());
        int[] metal = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            metal[i] = Integer.parseInt(st.nextToken());
        }
        int cnt=0;
        for(int i=0; i<N; i++){
            for(int j=i+1; j<N; j++){
                if(metal[i]+metal[j]==M) cnt++;
            }
        }
        System.out.print(cnt);
    }
}
