import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//2024-01-11
public class Ex1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N= Integer.parseInt(br.readLine());
        int n=0;
        while(N>4){
            n+=N/5;
            N/=5;
        }
        System.out.print(n);
    }
}
