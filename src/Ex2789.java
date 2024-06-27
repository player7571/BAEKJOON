import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//2024-06-27
public class Ex2789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = br.readLine();
        String str = "CAMBRIDGE";
        for(int i=0; i<input.length(); i++){
            boolean bool = false;
            for(int j=0; j<str.length(); j++){
                if(str.charAt(j)==input.charAt(i)) {
                    bool = true;
                }
            }
            if(!bool) sb.append(input.charAt(i));
        }
        System.out.print(sb);
    }
}
