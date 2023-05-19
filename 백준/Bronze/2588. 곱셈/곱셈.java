import java.util.*;
import java.io.*;

// 472
// 385

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        long A = Long.parseLong(br.readLine());
        long B = Long.parseLong(br.readLine());
        long temp = B;
        
        StringBuilder sb = new StringBuilder();
        
        while (temp > 0) {
            long cur = temp % 10;
            sb.append(A * cur).append("\n");
            temp /= 10;
        }
        sb.append(A * B);
        System.out.println(sb);
    }
}