import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
//2024-01-04
public class Ex9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<String> s = new Stack<>();
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++){
            char [] PS = br.readLine().toCharArray();
            for (char p : PS) {
                if (p == '(') s.push("");
                else if(s.empty()) {
                    s.push("");
                    break;
                }
                else s.pop();
            }
            if(s.empty()) sb.append("YES");
            else sb.append("NO");
            if(i!=T-1) sb.append("\n");
            s.clear();
        }
        System.out.println(sb);
    }
}
