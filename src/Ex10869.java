import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex10869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int result = a+b;
        sb.append(result).append("\n");
        result = a-b;
        sb.append(result).append("\n");
        result = a*b;
        sb.append(result).append("\n");
        result = a/b;
        sb.append(result).append("\n");
        result = a%b;
        sb.append(result);
        System.out.print(sb);
    }
}
