import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//2024-03-09
public class Ex2446 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            for(int j=0; j<i; j++){
                sb.append(" ");
            }
            for(int j=0; j<(N-i)*2-1; j++){
                sb.append("*");
            }
            sb.append("\n");
        }
        for(int i=N-2; i>=0; i--){
            for(int j=0; j<i; j++){
                sb.append(" ");
            }
            for(int j=0; j<(N-i)*2-1; j++){
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
