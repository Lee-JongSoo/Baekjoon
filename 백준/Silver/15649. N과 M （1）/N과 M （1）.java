import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br;
	static BufferedWriter bw;
	static int N, M;
	static int[] answer;
	
	public static void main(String[] args) throws IOException {

		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken()); 
		M = Integer.parseInt(st.nextToken()); 
		answer = new int[M];					
		
		boolean[] isUsed = new boolean[N + 1]; 
												
		int depth = 0; 
		
		solution(isUsed, depth);
		
		bw.flush();
		bw.close();

	}

	private static void solution(boolean[] isUsed, int depth) throws IOException {
		if (depth == M) { 
			for(int i=0; i<answer.length; i++) {
				bw.write(answer[i]+ " ");
			}
			bw.newLine();
			return;
		}

		for (int i = 1; i <= N; i++) {
			if (isUsed[i] == false) {
				isUsed[i] = true;
				answer[depth] = i;
				solution(isUsed, depth + 1);
				isUsed[i] = false;
			}
		}

	}
}