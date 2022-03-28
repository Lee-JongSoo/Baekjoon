import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        HashSet<Integer> hashSet = new HashSet<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            hashSet.add(Integer.parseInt(st.nextToken()));
        }

        ArrayList<Integer> arrayList = new ArrayList<>(hashSet);
        Collections.sort(arrayList);

        StringBuilder sb = new StringBuilder();

        for (int i : arrayList) {
            sb.append(i).append(" ");
        }
        System.out.println(sb.toString());
        
    }
}
