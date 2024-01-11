import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
//2024-01-11
public class Ex2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N= Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        while(N!=arr.size()){
            arr.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(arr);
        for(int i=0; i<N; i++){
            sb.append(arr.get(i)).append("\n");
        }
        System.out.print(sb);
    }
}
