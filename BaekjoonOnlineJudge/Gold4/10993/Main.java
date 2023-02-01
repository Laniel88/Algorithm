import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static StringBuffer sb = new StringBuffer();
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        final int COL = (int) Math.pow(2, N)-1;
        final int ROW = (int) Math.pow(2, N+1)-3;

        for(int column=1; column <= COL; column++){
            for(int row=1; row <= ROW; row++) {
                if(N%2 == 0) {
                    if(row >= column && row <= ROW - column + 1)
                        sb.append(isStar(column, row, N) ? '*':' ');
                    else if(row < column)
                        sb.append(' ');
                } else {
                    if(row > COL - column && row <= ROW - COL + column)
                        sb.append(isStar(column, row, N) ? '*':' ');
                    else if(row <= COL - column)
                        sb.append(' ');
                }
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }

    private static boolean isStar(int column, int row, int N) {

        int unit = (int) Math.pow(2, N-1);

        if(N%2 == 0){
            if(row == column || row == unit*4 - column - 2)
                return true;
            else if(column == 1 || column == unit)
                return true;
            else {
                if(column < unit && row > unit*2 - column && row < unit*2 + column - 2 )
                    return isStar(column-1, row-unit, N-1);
                else
                    return false;
            }
        } else {
            if(row == unit*2 - column || row == unit*2 + column - 2)
                return true;
            else if(column == unit*2 - 1 || column == unit)
                return true;
            else {
                if(column > unit && row > column && row < unit*4 - column - 2) {
                    if(N==3) return true;
                    else return isStar(column-unit+1, row-unit, N-1);

                }
                else
                    return false;
            }
        }
    }
}