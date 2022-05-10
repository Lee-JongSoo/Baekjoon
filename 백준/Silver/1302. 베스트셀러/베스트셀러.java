import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static String str;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            str = br.readLine();
            if (hashMap.containsKey(str)) {
                hashMap.replace(str, hashMap.get(str) + 1);
            } else {
                hashMap.put(str, 1);
            }
        }

        int max = 0;
        for (String s : hashMap.keySet()) {
            max = Math.max(max, hashMap.get(s));
        }

        ArrayList<String> arrayList = new ArrayList(hashMap.keySet());
        Collections.sort(arrayList);
        for (String str : arrayList) {
            if (hashMap.get(str) == max) {
                System.out.println(str);
                break;
            }
        }
    }
}
