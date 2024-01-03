import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Find{
    int N;
    int [] d;
    public Find(int N){
        this.N = N;
        this.d = new int[N];
        d[0] = 1;
    }
    int a;
    int findCount(int n){
        if(d[n-1]>0){
            return d[n-1];
        }
        d[n-1] = findCount(n-1)+1;
        if(n%3==0) {
            a = findCount(n/3)+1;
            if(a<d[n-1]) d[n-1]=a;
        }
        if(n%2==0) {
            a = findCount(n/2)+1;
            if(a<d[n-1]) d[n-1]=a;
        }
        return d[n-1];
    }
}
public class Ex1463 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Find f = new Find(N);
        System.out.println(f.findCount(N)-1);
    }
}
