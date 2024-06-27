import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//2024-06-26
public class Ex10407 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        if (str.equals("1")) System.out.print("2");
        else System.out.print("1");
    }
}
