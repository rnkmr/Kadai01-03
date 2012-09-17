// 20120903
// ‰Û‘è4F‚P‚OŒÂ‚Ì®”—v‘f‚ğ“ü—Í‚µ‚ÄA•À‚Ñ‚ğ‹t“]

import java.util.Scanner;

public class Kadai0204 {
	public static void main(String args[]){
		Scanner stdIn = new Scanner(System.in);
		int n = 10;
		int[] a = new int[n];

		for(int i=0;i<n;i++){
			a[i] = stdIn.nextInt();
		}

		int tmp = 0; // contemporary

		// 0‚Æ9A1‚Æ8A2‚Æ7c‚Æ‹t“]
		for(int i=0;i<(n/2);i++){
			tmp = a[i];
			a[i] = a[(n-1)-i];
			a[(n-1)-i] = tmp;
		}

		for(int i=0;i<n;i++){
			System.out.println(a[i]);
		}

	}
}
