import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        final int ROW = 4*N-3;

        if(N == 1) { System.out.println("*"); return; }

        // 상부
        for(int i=0; i< 2*N; i++) {
            if(i % 2 == 0) {
                System.out.print("* ".repeat(i/2));
                System.out.print(
                    i > 3 ?
                    "*".repeat(ROW - 2 * i + 2) : "*".repeat(ROW - i)
                );
                System.out.print(
                    i > 3 ?
                    " *".repeat(i/2-1) : ""
                );
            } else {
                System.out.print("*" + " *".repeat((i-1)/2));
                 // NOTE : 두 번째 줄의 남는 공간을 빈칸 입력한다면 "출력 형식이 잘못되었습니다"의 결과가 나옴.
                System.out.print(" ".repeat(
                    i != 1 ? ROW - 2*i + 1 : 0  
                ));
                System.out.print(" *".repeat((i-1)/2));
            }
            System.out.println();
        }
        // 하부
        for(int i=0; i< 2*N-1; i++) {
            if(i%2 ==0) {
                System.out.print("* ".repeat((ROW-1)/4 - i/2));
                System.out.print("*".repeat(2 * i + 1));
                System.out.println(" *".repeat((ROW-1)/4 - i/2));
            } else {
                System.out.print("* ".repeat((ROW-1)/4 - (i-1)/2));
                System.out.print(" ".repeat(2 * i - 1));
                System.out.println(" *".repeat((ROW-1)/4 - (i-1)/2));
            }
        }

    }
}