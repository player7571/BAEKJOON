import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
//2024-01-08
public class Ex2089 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        if(N==0) {
            System.out.print(N);
            return;
        }
        Stack<Integer> s = new Stack<>();
        while (N != 0) {
            int a= N%-2;
            N/=-2;
            if(a==1||a==-1) {
                sb.append(1);
                if(a==-1) N++;
            }
            else sb.append(0);
        }
        System.out.print(sb.reverse());
    }
}
