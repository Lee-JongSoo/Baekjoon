import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<StringLength> stringLengths = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            stringLengths.add(new StringLength(s, s.length()));
        }

        Collections.sort(stringLengths);

        System.out.println(stringLengths.get(0).str);

        for (int i = 1; i < n; i++) {
            if (!stringLengths.get(i).str.equals(stringLengths.get(i - 1).str)) {
                System.out.println(stringLengths.get(i).str);
            }
        }

    }

}
