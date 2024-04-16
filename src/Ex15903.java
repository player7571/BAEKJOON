import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
//2024-04-16
public class Ex15903 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        PriorityQueue<Long> card = new PriorityQueue<>();
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            card.add(Long.parseLong(st.nextToken()));
        }
        while(m-->0){
            long sum = card.poll()+card.poll();
            card.add(sum);
            card.add(sum);
        }
        long ans = 0;
        for(long li: card){
            ans+=li;
        }
        System.out.print(ans);
    }
}
