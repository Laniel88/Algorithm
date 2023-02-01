import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static StringBuffer sb = new StringBuffer();
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        if(N == 3) { System.out.println("  *   \n * *  \n*****"); return;}

        for(int column=1; column <= N; column++) {
            for(int row=1; row <= N*2; row++) {
                // 가장 큰 삼각형 밖의 공백은 미리 처리한다.
                if(row > N - column && row < N + column)
                    sb.append(isStar(column, row, N/2) ? '*' : ' '); // 가장 큰 삼각형 내부 탐색
                else
                    sb.append(' '); // 가장 큰 삼각형 외부
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }

    private static boolean isStar(int column, int row, int unit){

        // 3x2^1 일때의 예외 처리
        if(unit == 3) {
            if(column == 2 && row == 6)
                return false;
            else if(column == 5 && (row == 3 || row == 9) )
                return false;
            else if( column > 3 && row >= column && row < 13 - column )
                return false;
            else
                return true;
        }
        
        // 중앙 역삼각형의 column에 따른 가로 길이 : 4 * unit - 2 * column + 1
        // 이에 따른 중앙 역삼각형 (시작 위치, 종료위치) : (column, 4*unit-column)
        if(column > unit) {
            if(row < column) 
                return isStar(column-unit, row, unit/2);
            else if(row > 4 * unit - column) 
                return isStar(column-unit, row - unit * 2, unit/2);
            else 
                return false;
            
        } else {
            return isStar(column, row - unit, unit/2);
        }
    }
}
