import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Divide_3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            int a = Integer.parseInt(br.readLine()) % 42;
            hashMap.put(a, hashMap.getOrDefault(a,0) + 1);
        }
        System.out.println(hashMap.size());
    }
}
