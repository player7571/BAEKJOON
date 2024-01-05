import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
//2024-01-05
public class Ex1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<a; i++){
            map.put(Integer.parseInt(st.nextToken()), 1);
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<b; i++){
            if(map.getOrDefault(Integer.parseInt(st.nextToken()), 0)==1) count++;
        }
        System.out.println(a+b-count*2);
    }
}
