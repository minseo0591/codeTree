
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i <a ; i++) {
                int num = sc.nextInt();
                arr[i] = num *num;
        }
        StringBuilder sb = new StringBuilder();
        for (int i1 : arr) {
            sb.append(i1+ " ");
        }
        System.out.println(sb);
    }
}