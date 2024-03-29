import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
//2024-01-24
public class Ex11279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<N; i++){
            int val = Integer.parseInt(br.readLine());
            if(val==0) {
                if(maxHeap.isEmpty()) sb.append("0\n");
                else sb.append(maxHeap.remove()).append("\n");
            }
            else maxHeap.add(val);
        }
        System.out.print(sb);
    }
}
