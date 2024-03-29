import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//2024-01-18
public class Ex1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String [] minus = str.split("-");
        int sum;
        int result = 0;
        for(int i=0; i<minus.length; i++){
            sum=0;
            String [] plus = minus[i].split("\\+");
            for (String s : plus) {
                sum += Integer.parseInt(s);
            }
            if(i==0) result+=sum;
            else result-=sum;
        }
        System.out.print(result);
    }
}
