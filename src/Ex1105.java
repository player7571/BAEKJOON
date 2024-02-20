import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//2024-02-07
public class Ex1105 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        char[] L = st.nextToken().toCharArray();
        char[] R = st.nextToken().toCharArray();
        if(L.length!=R.length){
            System.out.print(0);
            return;
        }
        int cnt=0;
        for(int i=0; i< L.length; i++){
            if(L[i]!=R[i]) break;
            if(L[i]=='8') cnt++;
        }
        System.out.print(cnt);
    }
}
