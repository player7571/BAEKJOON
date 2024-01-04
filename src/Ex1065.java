import java.util.Scanner;
//231231
public class Ex1065 {
    static class Hansu{
        public boolean findHansu(int i){
            int h = i/100;
            int t = (i-h*100)/10;
            int o = i-h*100-t*10;
            return h - t == t - o || o - t == t - h;
        }
        }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Hansu ha = new Hansu();
        int n = s.nextInt();
        int i = 1;
        int j = 0;
        while(i<=n){
            if (i<100) j++;
            else {
                if(ha.findHansu(i)) j++;
            }
            i++;
        }
        System.out.println(j);
    }
}
