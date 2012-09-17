// 20120903
// ‰Û‘è‚PF‚P‚OŒÂ‚Ì®”—v‘f‚ğ“ü—Í‚µ‚ÄA•½‹Ï’l

import java.util.Scanner;

public class Kadai0203 {
	public static void main(String args[]){
		Scanner stdIn = new Scanner(System.in);
		int n = 10;
		int[] a = new int[n];

		for(int i=0;i<n;i++){
			a[i] = stdIn.nextInt();
		}

		int sum = 0;
		int count = 0;
		int mean = 0;

		for(int i=0;i<n;i++){
			sum = sum + a[i];
			count++;
		}
		mean = sum / count;
		System.out.println(mean);
	}
}
