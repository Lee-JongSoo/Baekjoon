import java.util.Scanner;

public class Divide2_10430 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        System.out.println((A + B) % C);
        System.out.println(((A % C) + (B % C)) % C);
        System.out.println((A * B) % C);
        System.out.println(((A % C) * (B % C)) % C);


        /**
         * BufferReader + StringBuilder
         *
         public static void main(String[] args) throws IOException {

         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

         StringTokenizer st = new StringTokenizer(br.readLine()," ");
         int A = Integer.parseInt(st.nextToken());
         int B = Integer.parseInt(st.nextToken());
         int C = Integer.parseInt(st.nextToken());

         StringBuilder sb = new StringBuilder();

         sb.append( (A+B)%C );
         sb.append('\n');

         sb.append( (A%C + B%C)%C );
         sb.append('\n');

         sb.append( (A*B)%C );
         sb.append('\n');

         sb.append( (A%C * B%C)%C );

         System.out.println(sb);

         }
         */
    }
}
