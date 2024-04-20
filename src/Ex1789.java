import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//2024-04-19
public class Ex1789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long S = Long.parseLong(br.readLine());
        long cnt=0;
        for(int i=1; i<=S; i++){
            S-=i;
            cnt++;
        }
        System.out.print(cnt);
    }
}
