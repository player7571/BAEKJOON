import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//2024-01-01
public class Ex2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int fSugar;
        int tSugar = 1;
        int i = 1;
        if(n%5==0) {
            fSugar = n/5;
            tSugar = 0;
        }
        else {
            while((n-3*i)%5 > 0){
                i++;
                tSugar = i;
            }
            fSugar = (n - tSugar*3)/5;
        }
        if(tSugar*3 + fSugar*5 != n) {
            System.out.println(-1);
        }
        else System.out.println(tSugar+fSugar);
    }
}
