// 20120903
// 課題5：配列の要素範囲外の代入/参照を行った時に何が起こったかを確認しなさい

import java.util.Scanner;

public class Kadai0205 {
	public static void main(String args[]){
		Scanner stdIn = new Scanner(System.in);
		int n = 10;
		int[] a = new int[n];

		for(int i=0;i<n;i++){
			a[i] = stdIn.nextInt();
		}

		a[10] = 100;
		System.out.println(a[10]);

		// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 10
		// が出力される。

	}
}
