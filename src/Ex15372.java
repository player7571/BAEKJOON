    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;

    public class Ex15372 {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();
            int N = Integer.parseInt(br.readLine());
            while (N-->0){
                String str = br.readLine();
                if(str.length()>=6&&str.length()<=9) sb.append("yes\n");
                else sb.append("no\n");
            }
            System.out.print(sb);
        }
    }