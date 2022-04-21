import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int n ;
    static int[] inOrder;
    static int[] inOrderIndex;
    static int[] postOrder;

    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());

        inOrder = new int[n + 1];
        inOrderIndex = new int[n + 1];
        postOrder = new int[n + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            inOrder[i] = Integer.parseInt(st.nextToken());
            inOrderIndex[inOrder[i]] = i;

        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            postOrder[i] = Integer.parseInt(st.nextToken());
        }

        sb = new StringBuilder();
        getPreOrder(0, n - 1, 0, n - 1);
        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();
    }

    private static void getPreOrder(int inBegin, int inEnd, int postBegin, int postEnd) {
        if (inBegin > inEnd || postBegin > postEnd) {
            return;
        }

        int root = postOrder[postEnd];
        sb.append(root + " ");

        int rootIndex = inOrderIndex[root];
        int lt = rootIndex - inBegin;

        getPreOrder(inBegin, rootIndex - 1, postBegin, postBegin + lt - 1);
        getPreOrder(rootIndex + 1, inEnd, postBegin + lt, postEnd - 1);
    }
}
