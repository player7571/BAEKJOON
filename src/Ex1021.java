import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;
//2024-01-06
public class Ex1021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> d = new ArrayDeque<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int min=0;
        for(int i=1; i<=N; i++) d.addLast(i);
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<M; i++){
            int j=0;
            int num = Integer.parseInt(st.nextToken());
            while(d.peek()!=num){
                d.addLast(d.remove());
                j++;
            }
            if(j>=(d.size()+1)/2) j=d.size()-j;
            min+=j;
            d.remove();
        }
        System.out.println(min);
    }
}
