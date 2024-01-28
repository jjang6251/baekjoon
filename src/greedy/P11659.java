package greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P11659 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int i=0, j=0;
		
		
		st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N+1];
		long[] s = new long[N+1];
		
		st = new StringTokenizer(br.readLine());
		
		for(int k=1; k<N+1; k++) {
			arr[k] = Integer.parseInt(st.nextToken());
			
			if(k==1) {
				s[1] = arr[1];
			} else {
				s[k] = s[k-1] + arr[k];
			}
		 
		}
	
		
		for(int k=0; k<M; k++) {
			st = new StringTokenizer(br.readLine());
			i = Integer.parseInt(st.nextToken());
			j = Integer.parseInt(st.nextToken());
			bw.write(String.valueOf(s[j]-s[i-1]) + " ");
		}
		
		bw.close();
	}

}
