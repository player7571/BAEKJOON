import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//2024-01-02
public class Ex1748 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if(N<10){
            System.out.println(N);
            return;
        }
        int digit = 0;
        int n = 1;
        int i = 1;
        while(N>=n*10){
            digit += i*n*9;
            i+=1;
            n*=10;
        }
        digit += (i*n*(N/n-1))+i*((N%n)+1);
        System.out.println(digit);
    }
}
