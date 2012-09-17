// 20120903
//‰Û‘è‚QF‚P‚OŒÂ‚Ì®”—v‘f‚Ì‚¤‚¿AÅ‘å’l

import java.util.Scanner;

public class Kadai0202 {
	public static void main(String args[]){
		Scanner stdIn = new Scanner(System.in);
		int n = 10;
		int[] a = new int[n];

		for(int i=0;i<n;i++){
			a[i] = stdIn.nextInt();
		}

		int max = 0;

		for(int i=0;i<n;i++){
			if(i==0 || max < a[i]){
				max = a[i];
			}
		}
		System.out.println(max);
	}
}
