import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//2024-03-20
public class Ex1032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        char[] ch = str.toCharArray();
        while(N-->1){
            str = br.readLine();
            for(int i=0; i<ch.length; i++){
                if(str.charAt(i)!=ch[i]) ch[i]='?';
            }
        }
        for (char c : ch) {
            sb.append(c);
        }
        System.out.print(sb);
    }
}
