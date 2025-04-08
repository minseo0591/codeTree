
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        for (int i = 0; i < s.length / 2; i++) {
            String s1 = s[i];
            String s2 = s[s.length - 1 - i];
            s[i] = s2;
            s[s.length - 1 - i] = s1;
        }
        StringBuilder sb = new StringBuilder();
        for (String t : s) {
            sb.append(t);
        }
        System.out.println(sb);

    }
}