import java.util.ArrayList;
import java.util.Scanner;

public class Ex1094 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int sum = 64;
        ArrayList<Integer> stick = new ArrayList<>();
        stick.add(64);
        while(sum!=x){
            sum = 0;
            stick.set(stick.size()-1, stick.get(stick.size()-1)/2);
            for(Integer st : stick){
                sum+=st;
            }
            if(sum<x){
                stick.add(stick.get(stick.size()-1));
                sum += stick.get(stick.size()-1);
            }
        }
        System.out.println(stick.size());
    }
}
