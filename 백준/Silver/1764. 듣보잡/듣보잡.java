import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashSet<String> hs = new HashSet<>();
        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            hs.add(br.readLine());
        }

        for (int i = 0; i < m; i++) {
            String s = br.readLine();
            if (hs.contains(s)) {
                arrayList.add(s);
            }
        }

        Collections.sort(arrayList);
        System.out.println(arrayList.size());
        for (String s : arrayList) {
            System.out.println(s);
        }
    }
}
