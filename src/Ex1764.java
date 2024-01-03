import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//2024-01-03
public class Ex1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Map<String, Integer> map = new HashMap<>();
        ArrayList<String> nameList = new ArrayList<>();
        for(int i=0; i<N; i++){
            map.put(br.readLine(), 1);
        }
        for(int i=0; i<M; i++){
            String name = br.readLine();
            map.put(name, map.getOrDefault(name, 0)+1);
            if(map.get(name) ==2) nameList.add(name);
        }
        Collections.sort(nameList);
        sb.append(nameList.size()+"\n");
        for (String nl : nameList) sb.append(nl+"\n");
        System.out.println(sb);
    }
}
