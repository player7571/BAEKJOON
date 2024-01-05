import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
//2024-01-05
public class Ex1302 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int max =0;
        Map<String, Integer> book = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i<N; i++){
            String str = br.readLine();
            book.put(str, book.getOrDefault(str, 0)+1);
            if(max< book.get(str)) max=book.get(str);
        }
        for(String key : book.keySet()){
            if(book.get(key)==max) list.add(key);
        }
        Collections.sort(list);
        System.out.println(list.get(0));

    }
}
