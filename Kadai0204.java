// 20120903
// �ۑ�4�F�P�O�̐����v�f����͂��āA���т��t�]

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

		// 0��9�A1��8�A2��7�c�Ƌt�]
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
