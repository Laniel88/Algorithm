import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws NoSuchElementException, IOException {
        Queue<Integer> cards = new LinkedList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++) {
            cards.add(i+1);
        }

        while(cards.size() > 1) {
            cards.remove();
            int temp = cards.remove();
            cards.add(temp);
        }
        System.out.println(cards.poll());
    }
}