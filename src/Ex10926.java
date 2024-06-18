import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex10926 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        sb.append(br.readLine()).append("??!");
        System.out.print(sb);
    }
}
