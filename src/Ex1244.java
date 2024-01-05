import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//2024-01-05
public class Ex1244 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] s = new int[N];
        for(int i=0; i<N; i++){
            s[i] = Integer.parseInt(st.nextToken());
        }
        int M = Integer.parseInt(br.readLine());
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int gender = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            if(s[K-1] ==0) s[K-1] =1;
            else s[K-1] =0;
            if(gender == 1){
                for(int j=2; j*K-1<N; j++){
                    if(s[j*K-1] ==0) s[j*K-1] =1;
                    else s[j*K-1] =0;
                }
            }
            else{
                if(K<=(N+1)/2){
                    for(int j=1; j<K; j++){
                        if(s[K-j-1] == s[K+j-1]) {
                            if(s[K-j-1] == 0){
                                s[K-j-1] =1;
                                s[K+j-1] =1;
                            }
                            else{
                                s[K-j-1] =0;
                                s[K+j-1] =0;
                            }
                        }
                        else break;
                    }
                }
                else{
                    for(int j=1; j<N-K+1; j++){
                        if(s[K-j-1] == s[K+j-1]) {
                            if(s[K-j-1] == 0){
                                s[K-j-1] =1;
                                s[K+j-1] =1;
                            }
                            else{
                                s[K-j-1] =0;
                                s[K+j-1] =0;
                            }
                        }
                        else break;
                    }
                }
            }
        }
        for(int i=0; i<s.length; i++){
            if (i+1 == s.length) sb.append(s[i]);
            else if((i+1)%20!=0) sb.append(s[i]).append(" ");
            else sb.append(s[i]).append("\n");
        }
        System.out.println(sb);
    }
}
