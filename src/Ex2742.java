import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//2024-03-13
public class Ex2742 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine())+1;
        while(N-->1){
            sb.append(N).append("\n");
        }
        System.out.print(sb);
    }
}
