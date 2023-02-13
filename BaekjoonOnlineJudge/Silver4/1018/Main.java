import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static boolean[][] board;
    static int min=64;
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        board = new boolean[N][M];
        for(int i=0; i<N; i++) {
            String line = br.readLine();
            for(int j=0; j<M; j++) {
                board[i][j] = line.charAt(j) == 'W' ? true:false;
            }
        }


        for(int i=0; i<N-7; i++) {
            for(int j=0; j<M-7; j++) {
                calculate(i,j);
            }
        }
        System.out.println(min);
    }

    private static void calculate(int y, int x) {
        int cnt = 0;
        int cntReverse = 0;
        for(int i=0; i<8; i++) {
            for(int j=0; j<8; j++) {
                if(i%2 == j%2){
                    if(board[y+i][x+j] != board[y][x])
                        cnt++;
                    else
                        cntReverse++;
                }
                else{
                    if(board[y+i][x+j] == board[y][x])
                        cnt++;
                    else
                        cntReverse++;
                }

                if(cnt > min && cntReverse > min) return;
            }
        }
        min = Math.min(cnt, cntReverse);
    }
}

