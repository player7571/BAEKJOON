import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//2024-02-20
public class Ex1264 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true){
            String str = br.readLine();
            int cnt=0;
            if(str.equals("#")) break;
            for(int i=0; i<str.length(); i++){
                char ch = str.charAt(i);
                switch (ch){
                    case'a':
                    case'e':
                    case'i':
                    case'o':
                    case'u':
                    case'A':
                    case'E':
                    case'I':
                    case'O':
                    case'U':
                        cnt++;
                    default:
                }
            }
            sb.append(cnt).append("\n");
        }
        System.out.print(sb);
    }
}
