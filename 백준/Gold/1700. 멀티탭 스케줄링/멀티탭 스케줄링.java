import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] order = new int[m];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            order[i] = Integer.parseInt(st.nextToken());
        }

        boolean[] isUsed = new boolean[101];
        int p = 0;
        int answer = 0;

        for (int i = 0; i < m; i++) {
            int tmp = order[i];

            if (!isUsed[tmp]) {
                if (p < n) {
                    isUsed[tmp] = true;
                    p++;
                } else {
                    ArrayList<Integer> arrayList = new ArrayList<>();
                    for (int j = i; j < m; j++) {
                        if (isUsed[order[j]] && !arrayList.contains(order[j])) {
                            arrayList.add(order[j]);
                        }
                    }

                    if (arrayList.size() != n) {
                        for (int j = 0; j < isUsed.length; j++) {
                            if (isUsed[j] && !arrayList.contains(j)) {
                                isUsed[j] = false;
                                break;
                            }
                        }
                    } else {
                        int delete = arrayList.get(arrayList.size() - 1);
                        isUsed[delete] = false;
                    }

                    isUsed[tmp] = true;
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}
