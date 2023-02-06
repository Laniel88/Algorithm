import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        boolean isTag = false;
        StringBuilder tempSb = new StringBuilder(); // 태그, 공백 기준으로 잘라 문자열 작업을 처리하고 최종 sb에 넣는 방식

        for(int i=0; i<line.length(); i++) {
            char c = line.charAt(i);
            if(c == '<') {
                sb.append(tempSb.reverse());
                tempSb.setLength(0);
                sb.append('<');
                isTag = true;
            } else if(c == '>') {
                sb.append(tempSb).append('>');
                tempSb.setLength(0);
                isTag = false;
            } else if(c == ' '){
                if(isTag) tempSb.append(' ');
                else { 
                    sb.append(tempSb.reverse()).append(' ');
                    tempSb.setLength(0);
                }
            } else {
                tempSb.append(c);
            }
        }
        if(isTag) sb.append(tempSb);
        else sb.append(tempSb.reverse());
        System.out.println(sb);
    }
}