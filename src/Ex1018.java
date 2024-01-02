import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//2024-01-02
public class Ex1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int paint = 1000;
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String [] board = new String [N];
        for(int i=0; i<board.length; i++){
            board[i] = br.readLine();
        }
        for(int n=0; n<N-7; n++){
            for(int m=0; m<M-7; m++){
                int p=0;
                for(int i=n; i<n+8; i++){
                    char [] chessBoard = board[i].toCharArray();
                    if(0 == i%2){
                        for(int j=m; j<m+8; j+=2){
                            if(chessBoard[j]=='B') p++;
                        }
                        for(int j=1+m; j<m+8; j+=2){
                            if(chessBoard[j]=='W') p++;
                        }
                    }
                    else{
                        for(int j=m; j<m+8; j+=2){
                            if(chessBoard[j]=='W') p++;
                        }
                        for(int j=1+m; j<m+8; j+=2){
                            if(chessBoard[j]=='B') p++;
                        }
                    }
                }
                if(p<paint) paint=p;
                p=0;
                for(int i=n; i<n+8; i++){
                    char [] chessBoard = board[i].toCharArray();
                    if(1 == i%2){
                        for(int j=m; j<m+8; j+=2){
                            if(chessBoard[j]=='B') p++;
                        }
                        for(int j=1+m; j<m+8; j+=2){
                            if(chessBoard[j]=='W') p++;
                        }
                    }
                    else{
                        for(int j=m; j<m+8; j+=2){
                            if(chessBoard[j]=='W') p++;
                        }
                        for(int j=1+m; j<m+8; j+=2){
                            if(chessBoard[j]=='B') p++;
                        }
                    }
                }
                if(p<paint) paint=p;

            }
        }
        System.out.println(paint);
    }
}