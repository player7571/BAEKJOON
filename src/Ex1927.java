import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
//2024-01-18
public class Ex1927 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i=0; i<N; i++){
            int x = Integer.parseInt(br.readLine());
            if(x==0) {
                if(queue.isEmpty()) {
                    sb.append("0\n");
                    continue;
                }
                sb.append(queue.remove()).append("\n");
            }
            else queue.add(x);
        }
        System.out.print(sb);
    }
}
