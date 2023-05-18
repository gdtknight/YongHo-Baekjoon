//    *
//   * *
//  * * *
// * * * *

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(
            new BufferedReader(new InputStreamReader(System.in)).readLine()
        );
        
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N - i; j++) {
                sb.append(" ");
            }

            for (int j = 1; j <= (i - 1) * 2 + 1; j++) {
                if (j % 2 == 1) {
                    sb.append("*");
                } else {
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}