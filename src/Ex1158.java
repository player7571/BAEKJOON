import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

//2024-01-02
public class Ex1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        ArrayList<Integer> num = new ArrayList<>();
        for(int i=1; i<=N; i++){
            num.add(i);
        }
        bw.write("<");
        int i = K;
        while(num.size()!=1){
            if(num.size()<i)
                while(i>num.size()) i -=num.size();
            if(i<0) i=0;
            bw.write(num.get(i-1)+", ");
            num.remove(i-1);
            i += (K-1);
    }
        bw.write(num.get(0)+">");
        bw.flush();
        bw.close();
    }
}
