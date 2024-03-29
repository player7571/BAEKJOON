import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
//2024-01-15
public class Ex11399 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] time = new int[N];
        int min=0;
        for(int i=0; i<N; i++) time[i]=Integer.parseInt(st.nextToken());
        Arrays.sort(time);
        for(int i=0; i<N; i++) {
            min+=(time[i]*(N-i));
        }
        System.out.print(min);
    }
}
