import java.util.Scanner;

public class Ex2309 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [] tall = new int[9];
        int sum = -100;
        int num1, num2, num3 = 0, min = 100;
        for(int i=0; i<9; i++){
            tall[i] = s.nextInt();
            sum += tall[i];
        }
        for(int i=0; i<9; i++){
            num1 = tall[i];
            for (int j=0; j<9; j++){
                if(j == i) break;
                num2 = num1+tall[j];
                if(num2==sum) {
                    tall[i] = 0;
                    tall[j] = 0;
                    break;
                }
            }
            if (tall[i] == 0) break;
        }
        for(int i=0; i<7; i++){
            for(int j=0; j<9; j++)
                if(tall[j] != 0 && min>tall[j]) {
                    min=tall[j];
                    num3 = j;
                }
            System.out.println(min);
            min = 100;
            tall[num3] = 0;
        }
    }
}
