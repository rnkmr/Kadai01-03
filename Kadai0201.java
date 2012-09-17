// 20120903
// ‰Û‘è‚PF‚P‚OŒÂ‚Ì®”—v‘f‚ğ“ü—Í‚µ‚ÄA“¯‚¶“à—e‚ğo—Í

import java.util.Scanner;

public class Kadai0201 {
	public static void main(String args[]){
		Scanner stdIn = new Scanner(System.in);
//		int in;
//		in = stdIn.nextInt();
		int n = 10;
		int[] a = new int[n];

		for(int i=0;i<n;i++){
			a[i] = stdIn.nextInt();
		}

		for(int i=0;i<n;i++){
			System.out.println(a[i]);
		}
	}
}
