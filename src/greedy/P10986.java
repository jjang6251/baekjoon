package greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P10986 {

	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		long check = 0;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		long[] s = new long[N];
		long[] checksum = new long[M];
		
		st = new StringTokenizer(br.readLine());
		s[0] = Integer.parseInt(st.nextToken());
		for(int k=1; k<N; k++) {
			s[k] = s[k-1] + Integer.parseInt(st.nextToken());;
		}
		
		for(int k=0; k<N; k++) {
			int remainder = (int) (s[k]%M);
			if(remainder ==0) check++;
			checksum[remainder]++;
		}
		
		for(int k=0; k<M; k++) {
			if(checksum[k] > 1) {
				check += checksum[k]*(checksum[k]-1)/2;
			}
		}
		
		
		
		System.out.println(check);
	}

}
