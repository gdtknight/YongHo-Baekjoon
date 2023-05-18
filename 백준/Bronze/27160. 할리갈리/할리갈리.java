import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // Your code
    int N = Integer.parseInt(br.readLine());
    Map<String, Integer> map = new HashMap<>();
    
    for (int i = 0; i < N; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      String fruit = st.nextToken();
      int cnt = Integer.parseInt(st.nextToken());
      map.put(fruit, map.getOrDefault(fruit, 0) + cnt);
    }
    
    for (String key : map.keySet()) {
      if (map.get(key) == 5) {
        System.out.println("YES");
        return;
      }
    }

    System.out.println("NO");

    br.close();
  }
}