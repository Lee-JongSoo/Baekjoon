import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class StringLength implements Comparable<StringLength> {
    public String str;
    public int len;

    public StringLength(String str, int len) {
        this.str = str;
        this.len = len;
    }

    @Override
    public int compareTo(StringLength o) {
        if (o.len == this.len) {
            for (int i = 0; i < str.length(); i++) {
                if (this.str.charAt(i) == o.str.charAt(i)) continue;
                else return this.str.charAt(i) - o.str.charAt(i);
            }
            return this.str.charAt(0) - o.str.charAt(0);
        }
        else return this.len - o.len;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        ArrayList<StringLength> stringLengths = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            stringLengths.add(new StringLength(s, s.length()));
        }

        Collections.sort(stringLengths);

        StringBuilder sb = new StringBuilder();

        sb.append(stringLengths.get(0).str).append('\n');

        for (int i = 1; i < n; i++) {
            if (!stringLengths.get(i).str.equals(stringLengths.get(i - 1).str)) {
                sb.append(stringLengths.get(i).str).append('\n');
            }
        }
        System.out.println(sb);
    }
}
