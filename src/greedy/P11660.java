package greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P11660 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int result = 0;
		
		int[][] arr = new int[N+1][N+1];
		int[][] s = new int[N+1][N+1];
		
		
		for(int i=1; i<N+1; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=1; j<N+1; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if(j==1) {
					s[i][1] = arr[i][1];
				} else {
					s[i][j] = s[i][j-1] + arr[i][j];
				}
			}
		}
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			if(x1 == x2) {
				bw.write(String.valueOf(s[x1][y2]-s[x1][y1-1]));
				bw.newLine();
			} else {
				result = 0;
				for(int j=0; j<x2-x1+1; j++) {
					result += (s[x1+j][y2] - s[x1+j][y1-1]);
				}
				bw.write(String.valueOf(result));
				bw.newLine();
			}
		}
		br.close();
		bw.close();

	}
	

}
